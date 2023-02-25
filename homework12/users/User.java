package de.telran.averchenko.elena.homework12.users;

public class User {
    private int password;
    private String login;

    public User(int password, String login) {
        this.password = password;
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "password=" + password +
                ", login='" + login + '\'' +
                '}';
    }

    public int getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }
}
