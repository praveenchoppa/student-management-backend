package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentServices;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @PostMapping("/addStudent")
    public ResponseEntity <Student> addStudent(@RequestBody Student student) {
        Student savedStudent = studentServices.addStudent(student);
        return new ResponseEntity<>(savedStudent,HttpStatus.CREATED);
    }

    @GetMapping("/students")
    public ResponseEntity <List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentServices.getAllStudents());
    }

    @GetMapping("/students/search")
    public ResponseEntity <List<Student>> getStudentsByName(@RequestParam String name){
        return ResponseEntity.ok(studentServices.getStudentsByName(name));
    }

    @GetMapping("/students/{id}")
    public ResponseEntity <Student> getStudentById(@PathVariable int id) {
        return ResponseEntity.ok(studentServices.getStudentById(id));
    }

    @PutMapping("/students/{id}")
public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student student) {
    student.setId(id);
    return ResponseEntity.ok(studentServices.updateStudent(student));
}
    

    @DeleteMapping("/students/{id}")
    public ResponseEntity <Void> deleteStudent(@PathVariable int id){
        studentServices.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

}
