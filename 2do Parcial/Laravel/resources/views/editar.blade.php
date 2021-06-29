@extends('layout')

@section('content')
    <h1>Pagina de edicion de un dato</h1>
    <form class="" action="{{route('actividades.update', $actividades->id)}}" method="post">
        {{ csrf_field() }}
        @method('PUT')
        <div class="primero">
            <label for="n">Actividad</label>
            <input type="text" required id="n"
            name="actividad"
            placeholder="ingrese su nombre"
            value="{{$actividades->actividad}}">
        </div>
        <div class="primero">
            <label for="d">Modalidad</label>
            <input type="text" required id="d"
            name="modalidad"
            placeholder="ingrese la duracion"
            value="{{$actividades->modalidad}}">
        </div>
        <div class="primero">
            <label for="d">Fecha</label>
            <input type="date" required id="d"
            name="fecha"
            placeholder="ingrese la fecha"
            value="{{$actividades->fecha}}">
        </div>
        <div class="primero">
            <label for="d">Duracion</label>
            <input type="number" required id="d"
            name="duracion"
            placeholder="ingrese la duracion"
            value="{{$actividades->duracion}}">
        </div>
        <div class="primero">
            <label for="d">Lugar</label>
            <input type="text" required id="d"
            name="lugar"
            placeholder="ingrese el lugar"
            value="{{$actividades->lugar}}">
        </div>
        <div class="boton">
            <input type="submit" name="" value="Registrar">
        </div>
    </form>
@endsection('content')
