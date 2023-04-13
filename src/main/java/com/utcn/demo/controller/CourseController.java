package com.utcn.demo.controller;

import com.utcn.demo.entity.Course;
import com.utcn.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/getAll")
    @ResponseBody
    public List<Course> retrieveAllCourses(){
        return this.courseService.retrieveCourse();
    }
    
    @PostMapping("/insertCourse")
    @ResponseBody
    public Course insertCourse(@RequestBody Course course){
        return this.courseService.insertCourse(course);
    }

    @PutMapping("/updateCourse")
    @ResponseBody
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.insertCourse(course);
    }

    @DeleteMapping("/deleteById")
    @ResponseBody
    public String deleteById(@RequestParam Long id){
        return this.courseService.deleteById(id);
    }
}
