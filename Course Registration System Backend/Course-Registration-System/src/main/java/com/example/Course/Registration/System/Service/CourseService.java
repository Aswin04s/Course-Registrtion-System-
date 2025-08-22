package com.example.Course.Registration.System.Service;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Repository.CourseRepository;
import com.example.Course.Registration.System.Repository.RegistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepositoryObj;

    @Autowired
    RegistryRepo registryRepoObj;

    public List<Course> showCourses() {
        return courseRepositoryObj.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return registryRepoObj.findAll();
    }

    public void cousreEnroll(String name,String emailId,String courseName) {
        CourseRegistry st = new CourseRegistry(name,emailId,courseName);

        registryRepoObj.save(st);

    }
}
