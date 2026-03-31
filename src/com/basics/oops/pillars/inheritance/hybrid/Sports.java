package com.basics.oops.pillars.inheritance.hybrid;

interface Sports {
    void play();
}
class Person{
    String name;
    Person(String name ){
        this.name=name;
    }
}
class Student extends Person implements Sports{
    Student(String name){
        super(name);
    }
    @Override
    public void play(){
        System.out.println(name+ " plays football");

    }

    public static void main(String[] args) {
        Student student=new Student("Ram");
        student.play();
    }
}
