package com.basics.oops.pillars.polymorphism.overriding;

public class RBI {

    double rateofInterest() {
        return 6.8;
    }
}
class HDFC extends RBI{
    @Override
    double rateofInterest(){
        return 7.2;

    }
}
class ICICI extends RBI {
    @Override
    double rateofInterest(){
        return 7.5;
    }
}
class CANARA extends RBI{
    @Override
    double rateofInterest(){
        return 7.9;

    }

    public static void main(String[] args) {
        // upcasting-->parent obj= new child
        RBI rbi = new RBI();
        RBI hdfc= new HDFC();
        RBI icici= new ICICI();
        RBI canara = new CANARA();
        System.out.println("The ROI of RBI : " + rbi.rateofInterest()+"%");
        System.out.println("The ROI of HDFC : " + hdfc.rateofInterest()+"%");
        System.out.println("The ROI of ICICI: " + icici.rateofInterest()+"%");
        System.out.println("The ROI of CANARA: " + canara.rateofInterest()+"%");

    }
}