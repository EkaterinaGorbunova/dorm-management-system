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
public class Dorm {
    private String nameDorm;
    private String building;
    private String capacity;
    private Human[] humansInDorm; // create an attribute "humansIdDorm" (array of Human)
    private static int idDorm = -1; // the static variable used to incremented each time a new building is created

    public Dorm(String nameDorm, String building, String capacity, Human[] humansInDorm) {
        this.nameDorm = nameDorm;
        this.building = building;
        this.capacity = capacity;
        this.humansInDorm = humansInDorm;

        ++idDorm; // increment static total count of Buildings
        System.out.printf("\nID of just created Dorm is: %d\n", idDorm);
        System.out.println(this.toString());
    }

    public void setNameDorm(String nameDorm) {
        this.nameDorm = nameDorm;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setHumansInDorm(Human[] humansIdDorm) {
        this.humansInDorm = humansIdDorm;
    }

    public static void setIdDorm(int idDorm) {
        Dorm.idDorm = idDorm;
    }

    public String getNameDorm() {
        return nameDorm;
    }

    public String getBuilding() {
        return building;
    }

    public String getCapacity() {
        return capacity;
    }

    public Human[] getHumansInDorm() {
        return humansInDorm;
    }

    public static int getIdDorm() {
        return idDorm;
    }

    @Override
    public String toString() {
        return String.format("Dorm's name is: %s\nBuilding is: %s\nCapacity is: %s",
                getNameDorm(), getBuilding(), getCapacity());
    }
} // end Dorm