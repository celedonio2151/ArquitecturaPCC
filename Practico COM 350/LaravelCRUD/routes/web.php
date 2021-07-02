<?php

namespace App\Http\Controllers;
use Illuminate\Support\Facades\Route;
/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});
// Route::get('/cursos','App\Http\Controllers\CursoController@index')->name('cursos.index');
// Route::get('/cursos','App\Http\Controllers\CursoController@index');
// Este resource ya trae rutas como: create, edit, destroy, update
Route::resource('cursos', CursoController::class);
// Route::resource('create', CursoController::class);
// Route::get('create', 'App\Http\Controllers\CursoController@create');
