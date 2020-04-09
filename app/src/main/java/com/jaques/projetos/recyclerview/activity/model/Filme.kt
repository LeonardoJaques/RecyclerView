package com.jaques.projetos.recyclerview.activity.model

data class Filme(var titulo: String, var genero: String, var ano: String) {
    override fun toString(): String {
        return "Filme(titulo='$titulo', genero='$genero', ano='$ano')"
    }
}


