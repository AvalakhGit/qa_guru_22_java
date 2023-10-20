package ru.avalakh.domain;

public class User {

    private final String userName;
    private final String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String username() {
        return userName;
    }

    public boolean isPasswordEquals(String password) {
        return this.password.equals(password);
    }
}
