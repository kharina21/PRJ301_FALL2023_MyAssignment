/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kharr
 */
public class Course {
    /*
    course_id INT PRIMARY KEY,
    course_code varchar(50),
    course_name VARCHAR(255),
    teacher_id INT FOREIGN KEY REFERENCES Users(user_id)
     */
    private int id;
    private String code;
    private String name;
    private User user;

    public Course() {
    }

    public Course(int id, String code, String name, User user) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getTeacherId() {
        return user;
    }

    public void setTeacherId(User teacherId) {
        this.user = teacherId;
    }
    
    
}
