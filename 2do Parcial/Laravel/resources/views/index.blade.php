@extends('layout')

@section('content')
    <h1>Mostrando las actividades registradas en la base de datos</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Actividad</th>
                <th>Modalidad</th>
                <th>Fecha</th>
                <th>Duracion</th>
                <th>Lugar</th>
                <th>Editar</th>
                <th>Eliminar</th>
            </tr>
        </thead>
        <tbody>
            @foreach($actividades as $actividad)
            <tr>
                <td>{{$actividad->actividad}}</td>
                <td>{{$actividad->modalidad}}</td>
                <td>{{$actividad->fecha}}</td>
                <td>{{$actividad->duracion}}</td>
                <td>{{$actividad->lugar}}</td>
                <td>
                    <!-- Pasamod una ruta de metodo del Modelo edit para la edicion -->
                    <a href="{{route('actividades.edit',$actividad->id)}}">Editar</a>
                </td>
                <td>
                    <!-- Link hacia laa ruta de eliminar -->
                    <form class="
                    " action="{{route('actividades.destroy',$actividad->id)}}" method="post">
                        {{ csrf_field() }}
                        @method('DELETE')
                        <input type="submit" name="" value="Eliminar">
                    </form>
                </td>
            </tr>
            @endforeach
        </tbody>
    </table>
    <a href="{{route('actividades.create')}}">Crear nueva actividad</a>
@endsection('content')
