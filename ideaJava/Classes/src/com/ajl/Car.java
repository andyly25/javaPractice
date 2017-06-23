package com.ajl;

/**
 * Created by janly on 6/23/17.
 *
 * Goal, making a template of the object car with basic fields
 */
public class Car {
    // encapsulation is the inclusion within object of all res needed for obj to function
    // defining state of the car which we're defining as fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    // create a method to update the model, this is a setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        // creating something like a rule that only allow certain types of models
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            // use this when referring to the field of the class
            this.model = model;
        } else{
            this.model = "Unknown";
        }
    }

    // now to create a getter
    public String getModel(){
        return this.model;
    }
}
