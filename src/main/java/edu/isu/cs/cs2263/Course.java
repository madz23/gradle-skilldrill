package edu.isu.cs.cs2263;

public class Course {
    //instance variables
    private int number;
    private String subject;
    private String title;

    //constructor

    public Course() {}

    public Course(int number, String subject, String title) {
        this.number = number;
        this.subject = subject;
        this.title = title;
    }


    // getter and setter methods


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //toSting

    @Override
    public String toString() {
        return "Course{" +
                "number=" + number +
                ", subject='" + subject + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
