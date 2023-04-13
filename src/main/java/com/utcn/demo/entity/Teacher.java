package com.utcn.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="teachers")
public class Teacher {

    @Id
    @Column(name="teacher_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="first_name")
    private String firstName;

    public Teacher(){

    }

    public Teacher(Long teacherId, String lastName, String firstName) {
        this.teacherId = teacherId;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
