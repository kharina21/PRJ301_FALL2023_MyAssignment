/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author kharr
 */
public class Slot {
    /*
    slot_id INT PRIMARY KEY,
    course_id INT FOREIGN KEY REFERENCES Courses(course_id),
    time DATETIME,
    location VARCHAR(255)
    */
    
    private int id;
    private Course course;
    private Date date;
    private String location;

    public Slot() {
    }

    public Slot(int id, Course course, Date date, String location) {
        this.id = id;
        this.course = course;
        this.date = date;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
