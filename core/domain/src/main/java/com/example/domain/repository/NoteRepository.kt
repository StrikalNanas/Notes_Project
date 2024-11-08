package com.example.domain.repository

import com.example.domain.model.NoteDomain

interface NoteRepository {

    suspend fun insertNote(note: NoteDomain)

    suspend fun delete(noteId: Int)

    suspend fun getNodeById(noteId: Int): NoteDomain?

    suspend fun getAllNote(): List<NoteDomain>
}