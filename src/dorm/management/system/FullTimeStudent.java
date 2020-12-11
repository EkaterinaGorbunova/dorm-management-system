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
public class FullTimeStudent extends Student {
    
    private int yearNum;

    public FullTimeStudent(int studentID, int yearNum, String nameHuman, String SIN, double height) {
        super(studentID, nameHuman, SIN, height);
        this.yearNum = yearNum;
    }

    public void setYearNum(int yearNum) {
        this.yearNum = yearNum;
    }

    public int getYearNum() {
        return yearNum;
    }

    @Override
    public String toString() {
        return super.toString();
    }
} // end FullTimeStudent
