package com.aristidevs.estudiocompleto.MVVMyMVP.MVP

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aristidevs.estudiocompleto.R

interface NoteView {
    fun displayNotes(notes: List<Note>)
}

class NoteActivity : AppCompatActivity(), NoteView {
    private val presenter = NotePresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_note)//si activo esto, me da error, pero ahi se cargaria la vista.

        // Iniciar la carga de notas
        presenter.loadNotes()
    }

    override fun displayNotes(notes: List<Note>) {
        // Actualizar la interfaz de usuario con las notas
        // (En este caso, puedes mostrar las notas en un RecyclerView, por ejemplo)
    }
}
