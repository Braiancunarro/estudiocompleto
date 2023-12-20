package com.aristidevs.estudiocompleto.MVVMyMVP.MVP

class NotePresenter(private val view: NoteView) {
    private val model = NoteModel()

    fun loadNotes() {
        // Lógica para cargar las notas desde el Modelo
        val notes = model.getAllNotes()

        // Actualizar la Vista con las notas cargadas
        view.displayNotes(notes)
    }
}
