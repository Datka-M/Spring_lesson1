package org.example;

public class Person {

    private House house;

    public Person(House house) {
        this.house = house;
    }

    public void getHouse() {
        System.out.println("Hello,it's my house");
        house.getHouse();
    }

    @Override
    public String toString() {
        return "Person: " +
                "house = " + house;
    }
}
