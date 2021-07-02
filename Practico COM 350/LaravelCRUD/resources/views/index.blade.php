@extends('layout')

@section('content')
<h1>Mostrando datos desde la pagina cursos</h1>
<table>
    <thead>
        <tr>
            <th>Nombres</th>
            <th>Duracion</th>
            <th>Tipo Curso</th>
            <th>Estado</th>
            <th>Editar</th>
            <th>Eliminar</th>
        </tr>
    </thead>
    <tbody>
        @foreach($cursos as $curso)
        <tr>
            <td>{{$curso->nombre}}</td>
            <td>{{$curso->duracion}}</td>
            <td>{{$curso->tipocurso}}</td>
            <td>{{$curso->estado}}</td>
            <td>
                <!-- Pasamod una ruta de metodo del Modelo edit para la edicion -->
                <a href="{{route('cursos.edit',$curso->id)}}">Editar</a>
            </td>
            <td>
                <!-- Link hacia laa ruta de eliminar -->
                <form class="
                " action="{{route('cursos.destroy',$curso->id)}}" method="post">
                {{ csrf_field() }}
                @method('DELETE')
                    <input type="submit" name="" value="Eliminar">
                </form>
            </td>
        </tr>
        @endforeach
    </tbody>
</table>
<a href="{{route('cursos.create')}}">Crear</a>
{{--  --}}
@endsection('content')
