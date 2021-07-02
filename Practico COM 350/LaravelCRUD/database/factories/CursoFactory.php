<?php

namespace Database\Factories;

use App\Models\Curso;
use Illuminate\Database\Eloquent\Factories\Factory;

class CursoFactory extends Factory
{
    /**
     * The name of the factory's corresponding model.
     *
     * @var string
     */
    protected $model = Curso::class;

    /**
     * Define the model's default state.
     *
     * @return array
     */
    public function definition()
    {
        // Definir como llenar los campos indicados en el migrate
        $tipoCurso = array('presencial','virtual');
        $estado = array('V','E');
        return [
            'nombre' => $this->faker->name(),
            'duracion' => $this->faker->phonenumber(),
            'tipocurso' => $tipoCurso[rand(0,1)],
            'estado' => $estado[rand(0,1)]
            // 'direccion' => Str::random(10),
        ];
    }
}
