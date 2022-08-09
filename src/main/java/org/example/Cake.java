package org.example;

public class Cake {

//    private Bakery bakery;
//
//    public Cake(Bakery bakery) {
//        this.bakery = bakery;
//    }

    private HoneyCake honeyCake;
    private CheeseCake cheeseCake;
    private Brownie brownie;

    public Cake(HoneyCake honeyCake, CheeseCake cheeseCake, Brownie brownie) {
        this.honeyCake = honeyCake;
        this.cheeseCake = cheeseCake;
        this.brownie = brownie;
    }


    public void getCakeMethod(){
        System.out.println("Cake method");
        honeyCake.bake();
        cheeseCake.bake();
        brownie.bake();
    }



    @Override
    public String toString() {
        return "Cake{" +
                "honeyCake=" + honeyCake +
                ", cheeseCake=" + cheeseCake +
                ", brownie=" + brownie;
    }
}
