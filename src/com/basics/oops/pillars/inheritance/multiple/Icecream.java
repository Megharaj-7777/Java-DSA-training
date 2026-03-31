package com.basics.oops.pillars.inheritance.Multiple;

interface Icecream {
    String Icecream();

}
interface Icecream2 {
    String Icecream2();

}
interface Icecream3 {
    String Icecream3();

}
class Icecreams implements Icecream,Icecream2,Icecream3{
    @Override
    public String  Icecream(){
        return "butterscotch";
    }
    @Override
    public String Icecream2(){
        return "vanilla";
    }
    @Override
    public String Icecream3(){
        return "blueberrry";
    }

    public static void main(String[] args) {

        Icecreams browser=new Icecreams();
        System.out.println( browser.Icecream());
        System.out.println(browser.Icecream2());
        System.out.println(browser.Icecream3());
    }


}