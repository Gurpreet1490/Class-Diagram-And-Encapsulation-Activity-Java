package com.exercise.encapsulationactivity.model;

public class Student {

    private final String name;
    private static Grade grade;
    private Group group;
    private final String nickName = "Nickname";

    public Student(String name, Grade grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = Group.getByValue(group);
    }


    public String getName() {
        return name;
    }

    public static Grade getGrade() {
        return grade;
    }

    public int getGroup() {
        return group.getValue();
    }

    public Grade upGrade() {
        Grade newGrade = Grade.getByOrder(grade.getOrder() - 1);
        Grade currentGrade = getGrade();
        if (newGrade != Grade.A) {
            System.out.println("Can't Upgrade Grade.");
            newGrade = currentGrade;
            System.out.println(newGrade);
        } else if (newGrade != null) {
            grade = newGrade;
            System.out.println(grade);
        }
        return newGrade;
    }

    public Grade downGrade() {
        Grade newGrade = Grade.getByOrder(grade.getOrder() + 1);
        Grade currentGrade = getGrade();
        if (newGrade != Grade.F) {
            System.out.println("Can't change Grade.");
            newGrade = currentGrade;
            System.out.println(newGrade);
        } else if (newGrade != null) {
            grade = newGrade;
            System.out.println(grade);
        }
        return newGrade;

    }

}
