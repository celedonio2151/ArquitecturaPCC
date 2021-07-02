<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use App\Models\Curso;       // Llamamos al modelo
class CursoSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        //
        // ejecutar esto para llenar datos falsos
        Curso::factory()
        ->count(100)
        ->create();
    }
}
