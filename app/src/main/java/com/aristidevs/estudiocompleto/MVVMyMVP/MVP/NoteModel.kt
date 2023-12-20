package com.aristidevs.estudiocompleto.MVVMyMVP.MVP

data class Note(val id: Int, val title: String, val content: String)

class NoteModel {
    fun getAllNotes(): List<Note> {
        // Lógica para obtener todas las notas desde algún origen de datos
        return listOf(
            Note(1, "Nota 1", "Contenido de la Nota 1"),
            Note(2, "Nota 2", "Contenido de la Nota 2"),
            Note(3, "Nota 3", "Contenido de la Nota 3"),
            Note(4, "Nota 4", "Contenido de la Nota 4"),
            Note(5, "Nota 5", "Contenido de la Nota 5"),
            Note(6, "Nota 6", "Contenido de la Nota 6"),

        )
    }
}
