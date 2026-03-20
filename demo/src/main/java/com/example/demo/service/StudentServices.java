package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Student;
import com.example.demo.StudentRepository;
import com.example.demo.exception.StudentNotFoundException;

@Service
public class StudentServices {
    
    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public List<Student> getStudentsByName(String name){
        return studentRepository.findByName(name);
    }

    public Student getStudentById(int id){
        return studentRepository.findById(id)
        .orElseThrow(() -> new StudentNotFoundException("Student with id" + id + "not found"));
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudent(int id){
        if(!studentRepository.existsById(id)){
            throw new StudentNotFoundException("Student with id" + id + "not found");
        }
        studentRepository.deleteById(id);
    }
}
