package com.jaques.projetos.recyclerview.activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.jaques.projetos.recyclerview.R

import com.jaques.projetos.recyclerview.activity.adapter.Adapter

import com.jaques.projetos.recyclerview.activity.model.DataSource
import com.jaques.projetos.recyclerview.activity.model.Filme
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var filmeAdapter: Adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniRecyclerView()
        addDataSet()
    }

    private fun addDataSet() {
        val data = DataSource.createDataSet()
        filmeAdapter.submitList(data)

    }

    private fun iniRecyclerView() {
        idRecyclerView.apply {
            idRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            filmeAdapter = Adapter()
            idRecyclerView.adapter = filmeAdapter

        }
    }
}