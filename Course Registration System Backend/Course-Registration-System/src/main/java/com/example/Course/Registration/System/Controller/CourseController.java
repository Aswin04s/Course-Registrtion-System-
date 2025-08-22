package com.example.Course.Registration.System.Controller;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseServiceObj;


    @GetMapping("courses")
    public List<Course> showCourses(){
        return courseServiceObj.showCourses();
    }

    @PostMapping("courses/register")
    public String courseEnroll(@RequestParam("name") String name,
                                @RequestParam("emailId") String emailId,
                                @RequestParam("courseName") String courseName){

        courseServiceObj.cousreEnroll(name,emailId,courseName);

        return "Congratulations "+name+"! You have Successfully Enrolled for "+courseName;
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseServiceObj.enrolledStudents();
    }


}
