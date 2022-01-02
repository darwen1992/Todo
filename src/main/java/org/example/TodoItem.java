package org.example;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class TodoItem {

    private int id;
    private String title;
    private String taskDescription;
    private  LocalDate deadLine;
    private boolean done ;
    private Person crator;

    public TodoItem(int id, String title, String taskDescription,  LocalDate deadLine, boolean done, Person crator) {
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.crator = crator;
    }

    public int getId() {
        return id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public  LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine( LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCrator() {
        return crator;
    }

    public void setCrator(Person crator) {
        this.crator = crator;
    }


    public boolean isOverdue() {
        LocalDate x=LocalDate.now();
        if(x.isAfter(getDeadLine() )  ){ return true;}
        else{ return false;}

    }

    public String getSummary() {
        return  "{id:" + getId() + "title:"+getTitle()  +"task:"+ getTaskDescription() +  "deadline:"+ getDeadLine() +
                  "done:"+ isDone() + "crator:"+ getCrator() +"}" ;
    }

}
