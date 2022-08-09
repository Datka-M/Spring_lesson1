package org.example;

public class Director implements Studio{
    private String name;

    public Director(String name) {
        System.out.println("set director name by constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void studio() {
        System.out.println("Class Director: studio method");
    }
}
