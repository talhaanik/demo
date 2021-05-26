package edu.aust.studentapp.model;

public class Student {
    //public static final int VERSION=0;
    private int id;
    private   String name;
    private String email;

    public Student() {
        System.out.println("Constroctor without parameter");
    }

    public Student(int id, String name, String email) {
        System.out.println("Constroctor withparameter");
        this.id = id;
        this.name = name;
        this.email = email;

    }
    public Student(int id, String name) {
        System.out.println("Constroctor withparameter");
        this.id = id;
        this.name = name;

    }
    public Student(int id ){
        System.out.println("Constroctor withparameter");
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /* @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }*/
    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:'" + name + '\'' +
                ", email:'" + email + '\'' +
                '}';
    }
}
