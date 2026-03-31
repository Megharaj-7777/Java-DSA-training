package com.basics.finalkeyword;
public final class Demo {
}
class A{
    void show(){
        System.out.println("Show some data");
    }
}
class B extends A{

}
class C{
    final int x= 200;
    void dispaly(final int x){
        //x=10;
    }
}
