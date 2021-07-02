@extends('layout')

@section('content')
    <h1>Pagina de creacion de un registro</h1>
    <!-- Se añade una ruta en action hacia una ruta a su metodo del controlador -->
    <form class="" action="{{route('cursos.store')}}" method="post">
        {{ csrf_field() }}
        <div class="primero">
            <label for="n">Nombre</label>
            <input type="text" required id="n"
            name="nombre"
            placeholder="ingrese su nombre"
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
            <label for="t">Virtual
                <input type="radio" name="tipo" checked id="t" value="virtual">
            </label>
            </abel for="p">Presencial
                <input type="radio" name="tipo" id="p" value="presencial">
            </label>
        </div>
        <div class="primero">
            <label for="v">V
                <input type="radio" name="estado" checked id="v" value="V">
            </label>
            <label for="e">E
                <input type="radio" name="estado" id="e" value="E">
            </label>
        </div>
        <div class="boton">
            <input type="submit" name="" value="Registrar">
        </div>
    </form>
@endsection('content')
