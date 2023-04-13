package com.utcn.demo.controller;

import com.utcn.demo.entity.Teacher;
import com.utcn.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/getAll")
    @ResponseBody
    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers =this.teacherService.retrieveTeachers();
        return teachers;
    }

    @GetMapping("/getById/{id}")
    @ResponseBody
    public Teacher getTeacherById(@PathVariable Long id) {
       Teacher teacher =this.teacherService.retrieveTeacherById(id);
        return teacher;
    }

    @GetMapping("/getById")
    @ResponseBody
    public Teacher getTeacherByIdVar2(@RequestParam("id") Long id) {
        Teacher teacher =this.teacherService.retrieveTeacherById(id);
        return teacher;
    }

    @PostMapping("/addTeacher")
    @ResponseBody
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return  this.teacherService.addTeacher(teacher);
    }

    @PutMapping("/updateTeacher")
    @ResponseBody
    public Teacher updateTeacher(@RequestBody Teacher teacher){
        return  this.teacherService.addTeacher(teacher);
    }

    @DeleteMapping("/deleteById")
    @ResponseBody
    public String deleteTeacherById(@RequestParam Long id){
        return this.teacherService.deleteTeacherById(id);
    }
}
