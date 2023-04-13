package com.utcn.demo.service;


import com.utcn.demo.entity.Course;
import com.utcn.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> retrieveCourse(){
        return (List<Course>) this.courseRepository.findAll();
    }

    public Course insertCourse(Course course) {
        return this.courseRepository.save(course);
    }

    public String deleteById(Long id) {
        try{
            this.courseRepository.deleteById(id);
            return "Deletion Successfully";
        }catch (Exception e){
            return "Failed to delete course with id " + id;
        }
    }
}
