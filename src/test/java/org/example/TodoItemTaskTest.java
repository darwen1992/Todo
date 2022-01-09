package org.example;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTaskTest {
    Person pr= new Person(1,"darwin","alt","se@er");
    TodoItem to= new TodoItem(2,"Test1","This is Test", LocalDate.of(2017, 1, 13),true,pr);

    TodoItemTask ob=new TodoItemTask(3,true,to,pr);
    @Test
    public void getId() {

        assertEquals(3,ob.getId());
    }

    @Test
    public void isAssigned() {
        assertEquals(true,ob.isAssigned());
    }


    @Test
    public void getTodoItem() {
        assertEquals(to,ob.getTodoItem());
    }

    @Test
    public void getAssignee() {
        assertEquals(pr,ob.getAssignee());
    }

    @Test
    public void getSummary() {

        assertEquals("{id:3isAssigned:trueTodoItem:org.example.TodoItem@78e03bb5Assignee:org.example.Person@5e8c92f4}",ob.getSummary());
    }



    @Test
    public void setAssigned() {
        ob.setAssigned(false);
        assertEquals(false,ob.isAssigned() );
    }

    Person pr1= new Person(1,"darwwwin","alt","se@er");
    TodoItem to2= new TodoItem(2,"Testtt1","This is Test", LocalDate.of(2017, 1, 13),true,pr);

    @Test
    public void setTodoItem() {
        ob.setTodoItem(to2);
        assertEquals(to2,ob.getTodoItem());
    }

    @Test
    public void setAssignee() {
        ob.setAssignee(pr1);
        assertEquals(pr1,ob.getAssignee());
    }
}