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
public class PartTimeStudent extends Student {

    private int numberOfHours;

    public PartTimeStudent(int studentID, int numberOfHours, String nameHuman, String SIN, double height) {
        super(studentID, nameHuman, SIN, height);
        this.numberOfHours = numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    @Override
    public String toString() {
        return super.toString();
    }
} // PartTimeStudent

