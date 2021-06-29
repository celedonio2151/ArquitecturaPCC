<?php

namespace Database\Factories;

use App\Models\Actividad;
use Illuminate\Database\Eloquent\Factories\Factory;

class ActividadFactory extends Factory
{
    /**
     * The name of the factory's corresponding model.
     *
     * @var string
     */
    protected $model = Actividad::class;

    /**
     * Define the model's default state.
     *
     * @return array
     */
    public function definition()
    {
        // return [
        //     //
        // ];
        // Definir como llenar los campos indicados en el migrate
        $modalidad = array('Presencial','Virtual','Semiprecencial');
        // $estado = array('V','E');
        return [
            'actividad' => $this->faker->name(),
            'modalidad' => $modalidad[rand(0,2)],
            'fecha' => $this->faker->date(),
            // 'duracion' => $this->faker->rand(50),
            'duracion' => rand(1,50),
            'lugar' => $this->faker->state()
            // 'direccion' => Str::random(10),
        ];
    }
}
