package com.example.notes.presentation

import com.example.notes.data.Note

sealed class NotesEvent {
    data object SortNotes: NotesEvent()
    data class DeleteNote(val note:Note): NotesEvent()
    data class SaveNote(
        val title: String,
        val description: String
    ): NotesEvent()
}