package com.jaques.projetos.recyclerview.activity.model

import com.jaques.projetos.recyclerview.activity.adapter.Catalogo

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<Catalogo> {
            val list = ArrayList<Catalogo>()
            list.add(
                Catalogo(
                    "Homem-Aranha: De Volta ao Lar ",
                    "Ação",
                    "2017"
                )
            )
            list.add(
                Catalogo(
                    "John Wick – De Volta Ao Jogo",
                    "Ação",
                    "2014"
                )
            )
            list.add(
                Catalogo(
                    "Velozes e Furiosos 8",
                    "Ação",
                    "2017"
                )
            )
            list.add(
                Catalogo(
                    "Velozes e Furiosos 8",
                    "Ação",
                    "2017"
                )
            )
            list.add(
                Catalogo(
                    "Velozes e Furiosos 8",
                    "Ação",
                    "2017"
                )
            )

            list.add(
                Catalogo(
                    "Homem-Aranha: De Volta ao Lar ",
                    "Ação",
                    "2017"
                )
            )
            list.add(
                Catalogo(
                    "John Wick – De Volta Ao Jogo",
                    "Ação",
                    "2014"
                )
            )
            list.add(
                Catalogo(
                    "Velozes e Furiosos 8",
                    "Ação",
                    "2017"
                )
            )
            list.add(
                Catalogo(
                    "Velozes e Furiosos 8",
                    "Ação",
                    "2017"
                )
            )
            list.add(
                Catalogo(
                    "Velozes e Furiosos 8",
                    "Ação",
                    "2017"
                )
            )


            return list
        }
    }
}






