package com.basics.oops.pillars.inheritance.single;

public class College {
    static String name= "SNPSU";
    String Address;
    int pincode;
    College(String Address, int pincode){
        this.Address=Address;
        this.pincode=pincode;
    }
}
class Department extends College{
    String block;
    int lecturerCount;
    Department(String Address,int pincode,String block,int lecturerCount){
        super(Address,pincode);
        this.block=block;
        this.lecturerCount=lecturerCount;

    }
    void departmentDetails(){
        System.out.println(block + " "+ lecturerCount+" " + pincode+" "+College.name);
    }

    public static void main(String[] args) {
        Department department= new Department("Bangalore", 560092,"A", 15);
       department.departmentDetails();
    }
}
/*
super.something--> variable from Parent class ✅
super()--> constructor of the parent class✅
Don't use super. for constructor
 */