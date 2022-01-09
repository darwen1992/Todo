package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
Person ob= new Person(1,"darwin","alt","se@er");
    @Test
    public void getId() {
        int x= ob.getId();
        assertEquals(1,x);
    }

    @Test
    public void getFirstName() {
String st= ob.getFirstName();
assertEquals("darwin",st);
    }



    @Test
    public void getLastName() {
        String st= ob.getLastName();
        assertEquals("alt",st);
    }


    @Test
    public void getEmail() {
        String st= ob.getEmail();
        assertEquals("se@er",st);
    }


    @Test
    public void getSummary() {
        String st= ob.getSummary();
        assertEquals("{id:1name:darwinaltemail:se@er}",st);
    }

    @Test
    public void setFirstName() {
        ob.setFirstName("darw");
        String st= ob.getFirstName();
        assertEquals("darw",st);
    }

    @Test
    public void setLastName() {
        ob.setLastName("Al");
        String st= ob.getLastName();
        assertEquals("Al",st);
    }

    @Test
    public void setEmail() {

        ob.setEmail("se@er.se");
        String st= ob.getEmail();
        assertEquals("se@er.se",st);
    }
}