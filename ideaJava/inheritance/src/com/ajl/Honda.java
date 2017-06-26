package com.ajl;

/**
 * Created by janly on 6/26/17.
 */

public class Honda extends Car{
    private int roadServiceMonths;

    // this is all we need to pass in
    public Honda(int roadServiceMonths) {
        super("Honda", "4WD", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVeloicity = getCurrentVelocity() + rate;
        if(newVeloicity == 0){
            stop();
            changedGear(1);
        }else if( newVeloicity > 0 && newVeloicity <=10){
            changedGear(1);
        }else if( newVeloicity > 10 && newVeloicity <=20){
            changedGear(2);
        }else if( newVeloicity > 20 && newVeloicity <=30) {
            changedGear(3);
        }else{
            changedGear(4);
        }

        if(newVeloicity>0){
            changeVelocity(newVeloicity, getCurrentDirection());
        }
    }
}

//public class Honda extends Car{
//    private String shape;
//    private String brand;
//
//    public Honda(int wheels, int gears, int seats, int doors, String shape, String brand) {
//        super(1, gears, seats, doors);
//        this.shape = shape;
//        this.brand = brand;
//    }
//
//    public void cruise(){
//        System.out.println("Yay, cruise mode");
//    }
//
//    @Override
//    public void moving(int speed) {
//        super.moving(speed);
//        cruise();
//    }
//}
