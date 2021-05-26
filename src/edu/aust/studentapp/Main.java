package edu.aust.studentapp;

import edu.aust.studentapp.controller.StudentController;
import edu.aust.studentapp.model.Person;
import edu.aust.studentapp.model.Student;

public class Main {

    public static void main(String[] args) {
       /* Student student=new Student(1,"Arafa");
        System.out.println(student);
       student.setEmail("arafat@aust.edu");
        System.out.println(student);
        System.out.println(student.getName());
        Student student1=new Student();
        student1.setEmail("easir@aust.edu");
        student1.setId(2);
        student1.setName("Easir");
        System.out.println(student1);
       // Student stf=new Person();*/
        System.out.println("--Application Started--");
        //1
        Student student = new Student(4, "Easir Arafat", "easir@aust.edu");
        System.out.println(student);
        System.out.println("Email:" + student.getEmail());

        Student student1 = new Student();
        student1.setName("Akbor");
        System.out.println(student1);


        //Start Control
        StudentController controller = new StudentController();
        System.out.println(controller.list());

       controller.save(student);
        System.out.println("----------updated Student List---------");
        System.out.println(controller.list());

        System.out.println("----------Showing Data Of Student:" + student.getId() + "----------");
        System.out.println(controller.show(1));

        Student updatestudent = controller.show(1);
        updatestudent.setEmail("arafat_@aust.edu");
        controller.update(updatestudent);
        System.out.println("----------updated Student List---------");
        System.out.println(controller.list());

        controller.delete(3);
        System.out.println("----------updated Student List---------");
        System.out.println(controller.list());
        /*CRUD POJO, JAVA Design pattern */


    }
}
