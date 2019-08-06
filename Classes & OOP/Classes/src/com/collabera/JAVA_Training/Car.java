package com.collabera.JAVA_Training;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Setter Method
    public void setModel(String model) {

        String validModel = model.toLowerCase();

        if(validModel.equals("four runner trd pro") || validModel.equals("pilot")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // Getter Method
    public String getModel() {
        return this.model;
    }
}
