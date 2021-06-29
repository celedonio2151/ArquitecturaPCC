<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use App\Models\Actividad;
class ActividadSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        // ejecutar esto para llenar datos falsos
        Actividad::factory()
        ->count(1000)
        ->create();
    }
}
