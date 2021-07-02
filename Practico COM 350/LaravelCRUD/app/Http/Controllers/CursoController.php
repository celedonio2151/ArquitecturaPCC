<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Curso;
class CursoController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        //  Listar datos de la base de datos
        $cursos=Curso::get();
        return view('index')->withCursos($cursos);    // Esta es la forma de pasar variables a la vista
        // return view('cursos',compact('cursos'));
        // return view('cursos',['cursos' => $cursos]);    // Esta es la forma de pasar variables a la vista
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        //
        return view('create');  //Con el direcotorio por delante
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        // Esta funcion guarda los datos en la base de datos
        $dato = $request->all();
        Curso::create([
            'nombre'=>$dato['nombre'],  // Vector asociativo
            'duracion'=>$dato['duracion'],  // Vector asociativo
            'tipocurso'=>$dato['tipo'],     // Vector asociativo
            'estado'=>$dato['estado']  // Vector asociativo
        ]);
        // dd($dato);
        return redirect(route('cursos.index'));
        // return view('welcome');
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
        // Ruta para editar que recive un id y gurda en la base de datos
        $curso=Curso::find($id); //Esto hace select * from tabla where id = $id
        return view('editar')->withCurso($curso);    // Esta es la forma de pasar variables a la vista
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        //
        $curso = Curso::find($id);
        $dato = $request->all();
        $curso->nombre=$dato['nombre'];
        $curso->duracion=$dato['duracion'];
        $curso->tipocurso=$dato['tipo'];
        $curso->estado=$dato['estado'];
        $curso->save();

        return redirect(route('cursos.index'));
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        //
        $curso = Curso::find($id);
        $curso->delete();
        // return redirect(route(''))
        return redirect(route('cursos.index'));
    }
}
