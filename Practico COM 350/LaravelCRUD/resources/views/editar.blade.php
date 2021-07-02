@extends('layout')

@section('content')
    <h1>Pagina de edicion de un registro</h1>
<!-- En action llamamos a una ruta a un metodo del controlador -->
    <form class="" action="{{route('cursos.update', $curso->id)}}" method="post">
        {{ csrf_field() }}
        @method('PUT')
        <div class="primero">
            <label for="n">Nombre</label>
            <input type="text" required id="n"
            name="nombre"
            placeholder="ingrese su nombre"
            value="{{$curso->nombre}}">
        </div>
        <div class="primero">
            <label for="d">Duracion</label>
            <input type="text" required id="d"
            name="duracion"
            placeholder="ingrese la duracion"
            value="{{$curso->duracion}}">
        </div>
        <div class="primero">
            Tipo Curso: 
            <label for="t">Virtual
                <input type="radio" name="tipo"  {{$curso->tipocurso=='virtual'?'checked':''}} id="t" value="virtual">
            </label>
            </abel for="p">Presencial
                <input type="radio" name="tipo" {{$curso->tipocurso=='presencial'?'checked':''}} id="p" value="presencial">
            </label>
        </div>
        <div class="primero">
            <label for="v">V
                <input type="radio" name="estado"  {{$curso->estado=='V'?'checked':''}} id="v" value="V">
            </label>
            <label for="e">E
                <input type="radio" name="estado"  {{$curso->estado=='E'?'checked':''}} id="e" value="E">
            </label>
        </div>
        <div class="boton">
            <input type="submit" name="" value="Actualizar">
        </div>
    </form>
@endsection('content')
