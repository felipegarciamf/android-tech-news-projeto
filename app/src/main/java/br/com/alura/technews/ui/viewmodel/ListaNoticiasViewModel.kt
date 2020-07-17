package br.com.alura.technews.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import br.com.alura.technews.model.Noticia
import br.com.alura.technews.repository.NoticiaRepository
import br.com.alura.technews.repository.Resource

class ListaNoticiasViewModel(
    private val repository: NoticiaRepository
) : ViewModel() {

    init {
        Log.i("viewmodel", "criando view model")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("viewmodel", "destruindo viewmodel")
    }


    fun buscaTodos() : LiveData<Resource<List<Noticia>?>> {
        return repository.buscaTodos()
    }

}