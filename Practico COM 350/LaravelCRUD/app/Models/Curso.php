<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Curso extends Model
{
    // Conecta con una tabla llamada cursos
    use HasFactory;
    protected $fillable = [     // Aqui en filable ponemos los nombres de los campos de la tabla
        'nombre',
        'duracion',
        'tipocurso',
        'estado'
    ];
}
