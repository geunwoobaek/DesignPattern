package designpattern.pratice.adapter;

public class Main {
    public static void main(String[] args){
        Sparrow sparrow=new Sparrow();
        ToyDuck toyDuck=new PlasticToyDuck();

        ToyDuck birdAdapter=new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}
