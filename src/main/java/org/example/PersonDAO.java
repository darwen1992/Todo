package org.example;

import java.util.ArrayList;

public interface PersonDAO {



    Person persist(Person person);
    Person  findById (int id);
    Person  findByEmail (String email);
    ArrayList< Person> findAll();
    void remove(String username);
}
