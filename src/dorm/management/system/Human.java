/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dorm.management.system;

/**
 *
 * @author Kate
 */
public abstract class Human {

    private String nameHuman;
    private String SIN;
    private double height;

    public Human(String nameHuman, String SIN, double height) {
        this.nameHuman = nameHuman;
        this.SIN = SIN;
        this.height = height;
    }

    public void setNameHuman(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    public void setSIN(String SIN) {
        this.SIN = SIN;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNameHuman() {
        return nameHuman;
    }

    public String getSIN() {
        return SIN;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("\nStudent's name: %s\nSIN: %s\nHight: %,.2fcm.\n",
                            getNameHuman(), getSIN(), getHeight());
    }
} // end Human
