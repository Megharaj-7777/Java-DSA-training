package com.basics.oops.withConstructor;

public class Student {
    int USN;
    String name;
    int marks;
    Student(int USN, String name, int marks){
        this.USN=USN;
        this.name=name;
        this.marks=marks;
    }
    void evaluateMarks(){
        if (marks<45){
            System.out.println(name + " has failed");
        }else{
            System.out.println(name + " has passed");
        }
    }

    public static void main(String[] args) {
        Student s1= new Student(101,"Sahana",43);
        s1.USN=101;
        s1.name="Sahana";
        s1.marks=42;
        Student s2= new Student(102,"kahana",46);
        s2.USN=102;
        s2.name="Kahana";
        s2.marks=46;
        s1.evaluateMarks();
        s2.evaluateMarks();


    }
}
