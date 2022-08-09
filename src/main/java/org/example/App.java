package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //  DI by constructor    Person

//        Person person = context.getBean("person", Person.class);
//        person.getHouse();

//        System.out.println("--------------------------------------");
//        House house = context.getBean("person", House.class);
//        house.getHouse();


        //  DI actor by setter and director by constructor   Movie

//        Movie movie = context.getBean("movieBean",Movie.class);
//        movie.studioMethod();
//        System.out.println(movie.getStudio());


        // DI set cakes by constructor     Cake
        Cake cake = context.getBean("cakeBean",Cake.class);
        cake.getCakeMethod();


        context.close();


    }
}
