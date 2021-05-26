package edu.aust.studentapp.controller;

import edu.aust.studentapp.model.Student;
import edu.aust.studentapp.repository.StudentRepository;
import edu.aust.studentapp.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController() {

        this.studentRepository = new StudentRepositoryImpl();
    }

    public List<Student> list(){

        return studentRepository.findAll();
    }
    public Student save(Student student){
        return studentRepository.save(student);
    }
    public Student show(int id){

        return studentRepository.get(id);
    }
    public void update(Student student){
        studentRepository.update(student);
    }
    public void delete(int id){
        studentRepository.delete(id);
    }
}
