package org.example;

import java.util.ArrayList;

public interface TodoItemDAO {


    TodoItem  persist(TodoItem  todoItem);
    TodoItem  findById (int id);
    ArrayList< TodoItem > findAll();
    ArrayList< TodoItem >   findAllByDoneStatus (boolean done);
    ArrayList< TodoItem >  findbyTitleContains(String title);
    ArrayList< TodoItem >  findbyPersonId(int personId);
    ArrayList< TodoItem >  findbyDeadlineBefore(int personId);
    ArrayList< TodoItem >  findbydeadlineAfter(int personId);
    void remove(int id);



}
