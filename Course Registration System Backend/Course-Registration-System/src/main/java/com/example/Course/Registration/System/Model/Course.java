package com.example.Course.Registration.System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {

    @Id
    private String courseId;
    private String courseName;
    private String trainer;
    private int durationInWeeks;



}
