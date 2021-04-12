package designpattern.pratice.adapter;

public class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
