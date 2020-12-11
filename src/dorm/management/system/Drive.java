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
public class Drive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creating 5 full time students
        Student ft1 = new FullTimeStudent(1, 2, "Kate", "111 - 11 - 111", 160.253);
        Student ft2 = new FullTimeStudent(2, 1, "Emma", "222 - 22 - 222", 165.583);
        Student ft3 = new FullTimeStudent(3, 3, "Mian", "333 - 33 - 333", 170.123);
        Student ft4 = new FullTimeStudent(4, 1, "Luna", "444 - 44 - 444", 175.593);
        Student ft5 = new FullTimeStudent(5, 2, "John", "555 - 55 - 555", 180.258);

        // creating 5 part time students
        Student pt1 = new PartTimeStudent(6, 100, "Helen", "666 - 66 - 666", 185.669);
        Student pt2 = new PartTimeStudent(7, 200, "Ethan", "777 - 77 - 777", 190.123);
        Student pt3 = new PartTimeStudent(8, 300, "Jacob", "888 - 88 - 888", 163.321);
        Student pt4 = new PartTimeStudent(9, 400, "James", "999 - 99 - 999", 164.987);
        Student pt5 = new PartTimeStudent(10, 500, "Lucas", "101 - 10 - 101", 178.899);

        // creating an array of type student and store 10 students inside of it
        Student[] students = {ft1, pt4, ft3, ft5, pt1, ft2, pt2, pt3, ft4, pt5};

        printSep(); // the separate lines method

        // iterating on the array of students and check if each student is an instance of PartTimeStudent or FullTimeStudent
        System.out.println("Checking if each Student is an instance of PartTimeStudent or FullTimeStudent:");
        for (Student currentStudent : students) {
            // determining whether element is a PartTimeStudent
            if (currentStudent instanceof PartTimeStudent) {
                System.out.println(currentStudent); // invokes toString
                //downcast Student reference to PartTimeStudent reference
                PartTimeStudent student = (PartTimeStudent) currentStudent;
                System.out.println("The student " + student.getNameHuman() + " is part time and has passed these many hours in the dorm: " + student.getNumberOfHours()); // print passed number of hours in the dorm
            } // end if
            
            // determining whether element is a FullTimeStudent
            else if (currentStudent instanceof FullTimeStudent) {
                System.out.println(currentStudent); // invokes toString
                //downcast Student reference to FullTimeStudent reference
                FullTimeStudent student = (FullTimeStudent) currentStudent;
                System.out.println("The student " + student.getNameHuman() + " is full time and has passed these many years in the dorm: " + student.getYearNum()); // print passed number of years in dorm
            } // end if                                    
        } // end for 

        // creating 2 arrays of human and put 5 student inside the each array
        Human[] studentsD1 = {ft1, ft2, ft3, ft4, ft5}; // put 5 FullTimeStudent 
        Human[] studentsD2 = {pt1, pt2, pt3, pt4, pt5}; // put 5 PartTimeStudent

        printSep(); // the separate lines method

        System.out.println("Creating two dorms:");
        // creating 2 dorms
        Dorm d1 = new Dorm("Sun", "A", "5", studentsD1); // dorm1 with 5 FullTimeStudent 
        Dorm d2 = new Dorm("Sky", "B", "5", studentsD2); // dorm2 with 5 PartTimeStudent

        printSep(); // the separate lines method

        System.out.println("Displaying students' names  in each dorm:");
        // creating an array of dorms and store dorms in it
        Dorm[] dorms = {d1, d2}; // create an array of dorms and store dorms in it
        for (Dorm dormTemp : dorms) { // iterate through the dorms array
            Human[] humansTemp = dormTemp.getHumansInDorm(); // uptaine humansInDorm array for current dorm
            for (Human humanTemp : humansTemp) { // iterate through the humansInDorm array
                System.out.println("\nStudent " + humanTemp.getNameHuman() + " is registered in dorm: " + dormTemp.getNameDorm()); // print the name of the students
            } // end for Human
        } // end for Dorm
    } // end main

    public static void printSep() {
        System.out.println("______________________\n");
    }

    public static void printInfo() {
        System.out.println("Java Assignment 2\nInstructor: Kia Babashahi Ashtiani Fall 2020\nStudent's name: Ekaterina Gorbunova\nStudent ID: 209-5211");
    }
} // end class Drive
