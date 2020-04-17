package com.jaques.projetos.recyclerview.activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.jaques.projetos.recyclerview.R
import com.jaques.projetos.recyclerview.activity.model.Filme
import kotlinx.android.synthetic.main.adapter_lista.view.*

class MainAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<Filme> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FilmeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_lista, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is FilmeViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(filmeList: List<Filme>) {
        items = filmeList
    }

    class FilmeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titulo: TextView = itemView.idTextViewTitulo
        val genero: TextView = itemView.idTextViewGenero
        val ano: TextView = itemView.idTextViewAno

        fun bind(filme: Filme): Unit {
            titulo.setText(filme.titulo)
            genero.setText(filme.genero)
            ano.setText(filme.ano)
        }


        init {
            titulo.setOnClickListener { view ->
                val text = "Click: ${titulo.text}"
                Toast.makeText(titulo.context, text, Toast.LENGTH_LONG)
                    .show()
            }

            titulo.setOnLongClickListener { view ->
                val text = "Click longo: ${titulo.text}"
                Toast.makeText(titulo.context, text, Toast.LENGTH_LONG).show()
                true
            }
        }
    }
}

