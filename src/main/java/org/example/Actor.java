package org.example;

public class Actor implements Studio{

    private String name;
    private int age;


    public Actor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("set actor name by setter");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("set actor age by setter");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor:" +
                "name = '" + name + '\'' +
                ", age = " + age ;
    }

    @Override
    public void studio() {
        System.out.println("Class Actor: studio method");
    }
}
