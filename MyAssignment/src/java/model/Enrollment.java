/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kharr
 */
public class Enrollment {
    /*
    enrollment_id INT PRIMARY KEY,
    student_id INT FOREIGN KEY REFERENCES Users(user_id),
    course_id INT FOREIGN KEY REFERENCES Courses(course_id)
    */
    
    private int id;
    private User user;
    private Course course;

    public Enrollment() {
    }

    public Enrollment(int id, User user, Course course) {
        this.id = id;
        this.user = user;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
}
