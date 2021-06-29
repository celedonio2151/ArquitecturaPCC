@extends('layout')

@section('content')
    <h1>Pagina de creacion de una actividad</h1>
    <!-- Se añade una ruta en action hacia una ruta a su metodo del controlador -->
    <form class="" action="{{route('actividades.store')}}" method="post">
        {{ csrf_field() }}
        <div class="primero">
            <label for="n">Actividad</label>
            <input type="text" required id="n"
            name="actividad"
            placeholder="ingrese su nombre"
            value="">
        </div>
        <div class="primero">
            <label for="d">Modalidad</label>
            <input type="text" required id="d"
            name="modalidad"
            placeholder="ingrese la duracion"
            value="">
        </div>
        <div class="primero">
            <label for="d">Fecha</label>
            <input type="date" required id="d"
            name="fecha"
            placeholder="ingrese la fecha"
            value="">
        </div>
        <div class="primero">
            <label for="d">Duracion</label>
            <input type="number" required id="d"
            name="duracion"
            placeholder="ingrese la duracion"
            value="">
        </div>
        <div class="primero">
            <label for="d">Lugar</label>
            <input type="text" required id="d"
            name="lugar"
            placeholder="ingrese el lugar"
            value="">
        </div>
        <div class="boton">
            <input type="submit" name="" value="Registrar">
        </div>
    </form>
@endsection('content')
