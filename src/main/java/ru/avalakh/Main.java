package ru.avalakh;

import ru.avalakh.data.DataBaseNotesRepository;
import ru.avalakh.data.NoteRepository;
import ru.avalakh.data.DataBaseUserRepository;
import ru.avalakh.service.Base64PasswordEncoder;
import ru.avalakh.service.Session;
import ru.avalakh.ui.LoginUIComponent;
import ru.avalakh.ui.MainUIComponent;
import ru.avalakh.ui.UIContainer;

public class Main {
    public static void main(String[] args) {
        new UIContainer(
                new LoginUIComponent(
                        new DataBaseUserRepository(),
                        new Base64PasswordEncoder()
                ),
                new MainUIComponent(
                        //new NoteRepository.MockNoteRepository()
                        new DataBaseNotesRepository()
                )
        ).render(
                new Session.EmptySession()
        );
    }
}
