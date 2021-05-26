package edu.aust.studentapp.repository;

import edu.aust.studentapp.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{
    private List<Student> studentData;

    public StudentRepositoryImpl() {
        this.studentData = new ArrayList<>();
        studentData.add(new Student(1, "Md. Easir", "easir@aust.edu"));
        studentData.add(new Student(2, "Md. Arafat", "arafat@aust.edu"));
        studentData.add(new Student(3, "Md. Nasir", "nasir@aust.edu"));
    }

    @Override
    public List<Student> findAll() {
        return studentData;
    }

    @Override
    public Student get(int id) {

        for (Student student : studentData) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student save(Student student) {
        if (student != null) {
            studentData.add(student);
            System.out.println("Student Inserted Successfully");
        }else {
            System.out.println("Student can't be null");
        }
        return student;
    }

    @Override
    public void update(Student student) {
        int index = getIndex(student.getId());
        if (index>-1){
            studentData.remove(index);
            studentData.add( student);
            System.out.println("Updated Successfully");
        }else {
            System.out.println("Student Not Found");
        }

    }

    @Override
    public void delete(int id) {
        int index = getIndex(id);
        if (index > -1) {
            studentData.remove(index);
            System.out.println("Updated Successfully");
        }else {
            System.out.println("Student Not Found");
        }

    }

    private int getIndex(int id) {
        int i = 0;
        for (Student student : studentData) {
            if (student.getId() == id) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
