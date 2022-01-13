package com.exercise.encapsulationactivity.model;

public class Student {

    private final String name;
    private Grade grade;
    private Group group;
    private final String nickName = "MySecretNickName";

    public Student(String name, Grade grade, int group){
        this.name = name;
        this.grade = grade;
        this.group = Group.getByValue(group);
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public int getGroup() {
        return group.getValue();
    }

    public void upGrade() {
        Grade newGrade = Grade.getByOrder(grade.getOrder() + 1);
        if(newGrade != null)    {
            grade = newGrade;
        }
    }

    public void downGrade() {
        Grade newGrade = Grade.getByOrder(grade.getOrder() - 1);
        if(newGrade != null)    {
            grade = newGrade;
        }
    }

}
