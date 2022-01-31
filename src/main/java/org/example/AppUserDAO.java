package org.example;

import java.util.ArrayList;

public interface AppUserDAO {

    AppUser persist(AppUser appUser);
    AppUser  findByUsername (String username);
    ArrayList< AppUser> findAll();
    void remove(String username);
}
