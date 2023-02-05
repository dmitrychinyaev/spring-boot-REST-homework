package ru.netology.authorizationserviceboot.model;

import java.util.Objects;

public class User {
    private String username;
    private String password;

    public String getUser() {
        return username;
    }

    public void setUser(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        User user1 = (User) o;
        return username.equals(user1.username) && password.equals(user1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
