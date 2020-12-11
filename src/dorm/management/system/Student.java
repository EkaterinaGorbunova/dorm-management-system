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
public abstract class Student extends Human {

    private int studentID;

    public Student(int studentID, String name, String SIN, double height) {
        super(name, SIN, height);
        this.studentID = studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return String.format("%sID: %s", super.toString(), getStudentID());
    }
} // end Student

