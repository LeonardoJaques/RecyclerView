package com.jaques.projetos.recyclerview.activity.adapter

data class Catalogo(var titulo: String, var genero: String, var ano: String) {
    override fun toString(): String {
        return "Catalogo(titulo='$titulo', genero='$genero', ano='$ano')"
    }
}


