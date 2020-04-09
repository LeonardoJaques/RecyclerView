package com.jaques.projetos.recyclerview.activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jaques.projetos.recyclerview.R
import kotlinx.android.synthetic.main.adapter_lista.view.*

class Adapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<Catalogo> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CatalogoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_lista, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is CatalogoViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(catalogoList: List<Catalogo>) {
        items = catalogoList
    }

    class CatalogoViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val titulo: TextView = itemView.idTextViewTitulo
        val genero: TextView = itemView.idTextViewGenero
        val ano: TextView = itemView.idTextViewAno

        fun bind(catalogo: Catalogo): Unit {
            titulo.setText(catalogo.titulo)
            genero.setText(catalogo.genero)
            ano.setText(catalogo.ano)
        }
    }
}