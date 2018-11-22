package br.com.andresouza.demopersistencia

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import br.com.andresouza.demopersistencia.dao.BancoDeDados
import br.com.andresouza.demopersistencia.model.Game

class ListaViewModel(application: Application) : AndroidViewModel(application){


    private val bd = BancoDeDados.getDataBase(application.applicationContext)

    var games: LiveData<List<Game>>? = null


    fun carregaGames(){
        games = bd?.gameDAO()?.lerGames()
    }

}