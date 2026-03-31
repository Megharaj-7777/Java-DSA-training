package com.basics.Arrays;
class Student{
    String name;
    int USN;
}
class Intern{
    String name;
    int id;
    Intern(String name,int id){
        this.name=name;
        this.id=id;
    }
}

public class E8 {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]= new Student();
        students[0].name= "MAGGI";
        students[0].USN=64;
        System.out.println(students[0].name+", "+students[0].USN);
        Intern[] interns= new Intern[]{
                new Intern("Sahana",101),
                new Intern("Suhana",102),
                new Intern("Harsha",103),

        };
        for (Intern i: interns){
            System.out.println(i.name+", "+i.id);
        }
    }

}
