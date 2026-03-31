package com.basics.oops.pillars.inheritance.single;

public class Library {
    int id;
    String name;
    Library(int id, String name){
        this.id=id;
        this.name=name;
    }

}
class Book extends Library {
    double price;

    Book( String name,int id, double price) {
        super(id, name);
        this.price = price;
    }

    void Bookdetails() {
        System.out.println(name + " " + id + " " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("You ", 100, 200);
        book.Bookdetails();
    }
}
