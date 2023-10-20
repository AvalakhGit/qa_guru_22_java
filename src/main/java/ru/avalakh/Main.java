package ru.avalakh;

import ru.avalakh.data.FileUserRepository;
import ru.avalakh.data.NoteRepository;
import ru.avalakh.data.PostgresUserRepository;
import ru.avalakh.service.Base64PasswordEncoder;
import ru.avalakh.service.Session;
import ru.avalakh.ui.LoginUIComponent;
import ru.avalakh.ui.MainUIComponent;
import ru.avalakh.ui.UIContainer;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        new UIContainer(
                new LoginUIComponent(
                        new PostgresUserRepository(),
                        new Base64PasswordEncoder()
                ),
                new MainUIComponent(
                        new NoteRepository.MockNoteRepository()
                )
        ).render(
                new Session.EmptySession()
        );
    }
}
