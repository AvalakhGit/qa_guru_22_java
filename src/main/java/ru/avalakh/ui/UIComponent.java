package ru.avalakh.ui;

import ru.avalakh.service.Session;

public interface UIComponent {

    Session render(Session session);

    class MockUIComponent implements UIComponent {
        @Override
        public Session render(Session session) {
            System.out.println("MockUIComponent!");
            return session;
        }
    }
}