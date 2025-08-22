package com.example.Course.Registration.System.Repository;

import com.example.Course.Registration.System.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,String> {

}
