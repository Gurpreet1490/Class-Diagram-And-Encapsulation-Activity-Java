package com.exercise.encapsulationactivity.model;



public class Main {

    public static void main(String[] args) {
        System.out.println("Student1 : ");
        Student student1 = new Student("Emily", Grade.B, 2);
        System.out.println(student1.getName());
        System.out.println(student1.getGrade());
        System.out.println(student1.getGroup());

        System.out.println("Student1 UpGrade: ");
        student1.upGrade();

        System.out.println("Student2 : ");
        Student student2 = new Student("Gia", Grade.F, 1);
        System.out.println(student2.getName());
        System.out.println(student2.getGrade());
        System.out.println(student2.getGroup());

        System.out.println("Student2 downGrade: ");
        student2.downGrade();

    }
}
