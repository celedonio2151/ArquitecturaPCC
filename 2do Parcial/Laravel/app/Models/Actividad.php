<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Actividad extends Model
{
    use HasFactory;
    protected $fillable = [     // Aqui en filable ponemos los nombres de los campos de la tabla
        'actividad',
        'modalidad',
        'fecha',
        'duracion',
        'lugar'
    ];
}
