package com.endeavorsheep.phonebook.activity.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.endeavorsheep.phonebook.databinding.ActivityListaDeContatosBinding
import com.endeavorsheep.phonebook.model.Contato
import com.endeavorsheep.phonebook.recyclerview.adapter.ListaContatosAdapter


class ListaDeContatosActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityListaDeContatosBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configuraRecyclerView()
    }

    private fun configuraRecyclerView() {
        val recyclerView = binding.activityListaDeContatosRecyclerview
        recyclerView.adapter = ListaContatosAdapter(
            context = this, listaContato = listOf(
                Contato(
                    nome = "Andressa Jessica",
                    numero = "99999-8888"
                ),
                Contato(
                    nome = "Andressa Alburquerque",
                    numero = "98888-4321"
                )
            )
        )
    }
}