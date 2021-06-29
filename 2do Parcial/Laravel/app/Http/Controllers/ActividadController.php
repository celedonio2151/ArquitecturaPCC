<?php

namespace App\Http\Controllers;
use App\Models\Actividad;
use Illuminate\Http\Request;

class ActividadController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        //
        // return "Hola desde en controlador index";
        $actividades=Actividad::get();
        return view('index')->withActividades($actividades);
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        //
        return view('crear');
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        //
        // Esta funcion guarda los datos en la base de datos
        $dato = $request->all();
        Actividad::create([
            'actividad'=>$dato['actividad'],  // Vector asociativo
            'modalidad'=>$dato['modalidad'],  // Vector asociativo
            'fecha'=>$dato['fecha'],  // Vector asociativo
            'duracion'=>$dato['duracion'],     // Vector asociativo
            'lugar'=>$dato['lugar']  // Vector asociativo
        ]);
        // dd($dato);
        return redirect(route('actividades.index'));
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
        //
        // Ruta para editar que recive un id y gurda en la base de datos
        $actividad=Actividad::find($id); //Esto hace select * from tabla where id = $id
        return view('editar')->withActividades($actividad);    // Esta es la forma de pasar variables a la vista
        // return "Hola desde la vista";
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
        $activi = Actividad::find($id);
        $dato = $request->all();
        $activi->actividad=$dato['actividad'];
        $activi->modalidad=$dato['modalidad'];
        $activi->fecha=$dato['fecha'];
        $activi->duracion=$dato['duracion'];
        $activi->lugar=$dato['lugar'];
        $activi->save();

        return redirect(route('actividades.index'));
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
        $dato = Actividad::find($id);
        $dato->delete();
        // return redirect(route(''))
        return redirect(route('actividades.index'));
    }
}
