package ru.avalakh.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.avalakh.domain.Note;

public interface NoteRepository {

    List<Note> findAllByUsername(String username);

    void save(Note note);

    class MockNoteRepository implements NoteRepository {

        private List<Note> store = new ArrayList<>(
                List.of(
                        new Note("max", "Выучи QA автоматизацию наконец!"),
                        new Note("max", "Начни спокойнее работать!")
                )
        );

        @Override
        public List<Note> findAllByUsername(String username) {
            if ("max".equals(username)) {
                return store;
            }
            return Collections.emptyList();
        }

        @Override
        public void save(Note note) {
            if ("max".equals(note.username())) {
                store.add(note);
            }
        }
    }

}