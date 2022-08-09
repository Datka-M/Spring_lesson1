package org.example;

public class Movie {

    private Studio studio;

    public Movie() {
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        System.out.println("Class Movie: setter");
        this.studio = studio;
    }

    public void studioMethod(){
        System.out.println("Hello,studio");
        studio.studio();

    }

    @Override
    public String toString() {
        return "Movie: " +
                "studio = " + studio;
    }
}
