package com.endeavorsheep.phonebook.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.endeavorsheep.phonebook.databinding.GeraContatoBinding
import com.endeavorsheep.phonebook.model.Contato

class ListaContatosAdapter(
    private val context: Context,
    listaContato: List<Contato>
) : RecyclerView.Adapter<ListaContatosAdapter.ViewHolder>() {

    private val listaContato = listaContato.toMutableList()

    class ViewHolder(private val binding: GeraContatoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun vincula(contato: Contato) {
            val nome = binding.listaNome
            nome.text = contato.nome
            val telefone = binding.listaTelefone
            telefone.text = contato.numero
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding = GeraContatoBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listaTelefone = listaContato[position]
        holder.vincula(listaTelefone)
    }

    override fun getItemCount(): Int = listaContato.size

}
