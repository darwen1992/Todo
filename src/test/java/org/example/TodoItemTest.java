package org.example;

import org.junit.Test;

import static org.junit.Assert.*;
import java.time.LocalDate;
public class TodoItemTest {


    Person ob= new Person(1,"darwin","alt","se@er");
    TodoItem obj= new TodoItem(2,"Test1","This is Test",LocalDate.of(2017, 1, 13),true,ob);
    @Test
    public void getId() {
assertEquals(2,obj.getId());
    }

    @Test
    public void getTitle() {
        assertEquals("Test1",obj.getTitle());
    }

    @Test
    public void getTaskDescription() {
        assertEquals("This is Test",obj.getTaskDescription());
    }


    @Test
    public void getDeadLine() {
        assertEquals(LocalDate.of(2017, 1, 13),obj.getDeadLine());
    }


    @Test
    public void isDone() {
        assertEquals(true,obj.isDone());
    }

    @Test
    public void getCrator() {
        assertEquals(ob,obj.getCrator());
    }

    @Test
    public void isOverdue() {

        assertEquals(true,obj.isOverdue());

    }

    @Test
    public void getSummary() {
        assertEquals("{id:2title:Test1task:This is Testdeadline:2017-01-13done:truecrator:org.example.Person@78e03bb5}",obj.getSummary());
    }


    @Test
    public void setTitle() {
        obj.setTitle("Updated title");
        assertEquals("Updated title",obj.getTitle());
    }

    @Test
    public void setDone() {
        obj.setDone(false);
        assertEquals(false,obj.isDone());
    }
    @Test
    public void setDeadLine() {
        obj.setDeadLine(LocalDate.of(2019, 1, 13));
        assertEquals(LocalDate.of(2019, 1, 13),obj.getDeadLine());

    }
    @Test
    public void setTaskDescription() {
        obj.setTaskDescription("This is new");
        assertEquals("This is new",obj.getTaskDescription());

    }
    @Test
    public void setCrator() {
        Person p=new Person(1,"darween","alt","se@er");
        obj.setCrator(p);
        assertEquals(p,obj.getCrator());

    }
}