package edu.aust.studentapp.repository;

import edu.aust.studentapp.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    Student get(int id);
    Student save(Student student);
    void update(Student student);
    void delete(int id);
}
