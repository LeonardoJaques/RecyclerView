package com.jaques.projetos.recyclerview.activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jaques.projetos.recyclerview.R

import com.jaques.projetos.recyclerview.activity.adapter.Adapter

import com.jaques.projetos.recyclerview.activity.model.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var catalogoAdapter: Adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniRecyclerView()
        addDataSet()
    }

    private fun addDataSet() {
        val data = DataSource.createDataSet()
        catalogoAdapter.submitList(data)

    }

    private fun iniRecyclerView() {
        idRecyclerView.apply {
            idRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            catalogoAdapter = Adapter()
            idRecyclerView.adapter = catalogoAdapter
        }
    }
}