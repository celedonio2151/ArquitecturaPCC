<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateActividadsTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        // Schema::create('actividads', function (Blueprint $table) {
        //     $table->id();
        //     $table->timestamps();
        // });
        Schema::create('actividads', function (Blueprint $table) {
            // Definimos los campos de la tabla agenda
            $table->id(); //
            $table->string('actividad',100);  //
            $table->string('modalidad',50); //
            $table->date('fecha'); //
            $table->integer('duracion'); //
            $table->string('lugar',100); //
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('actividads');
    }
}
