package com.example.Course.Registration.System.Repository;

import com.example.Course.Registration.System.Model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistryRepo extends JpaRepository<CourseRegistry,Integer> {


}
