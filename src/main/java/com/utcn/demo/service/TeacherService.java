package com.utcn.demo.service;

import com.utcn.demo.entity.Teacher;
import com.utcn.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> retrieveTeachers(){
        return (List<Teacher>) this.teacherRepository.findAll();
    }

    public Teacher retrieveTeacherById(Long id){

        Optional<Teacher> teacher=this.teacherRepository.findById(id);
        if(teacher.isPresent()){
            return teacher.get();
        }else{
            return null;
        }

    }

    public Teacher addTeacher(Teacher teacher){
        return this.teacherRepository.save(teacher);
    }

    public String deleteTeacherById(Long id){
        try{
            this.teacherRepository.deleteById(id);
            return "Entry successfully deleted!";
        }catch (Exception e){
            return "Failed to delete entry with id:" + id;
        }
    }

}
