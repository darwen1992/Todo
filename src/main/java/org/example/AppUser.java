package org.example;

import java.util.Objects;

public abstract class AppUser {

private String username;
private String password;
private AppRole role;

    public String getUsername() {
        return username;
    }

    public abstract void setUsername(String username);

    public String getPassword() {
        return password;
    }

    public abstract void setPassword(String password);

    public AppRole getRole() {
        return role;
    }

    public abstract void setRole(AppRole role) ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppUser)) return false;
        AppUser appUser = (AppUser) o;
        return username.equals(appUser.username)  && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username,  role);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\''  +
                ", role=" + role +
                '}';
    }
}
