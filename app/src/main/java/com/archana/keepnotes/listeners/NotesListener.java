package com.archana.keepnotes.listeners;

import com.archana.keepnotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
