package designpattern.pratice.adapter;

public class BirdAdapter implements ToyDuck{ //서로 메서드명은 다르지만 다른역할을 하는 것들 묶어줌
    Bird bird;
    public BirdAdapter(Bird bird){
        this.bird=bird;
    }
    @Override
    public void squeak() { //어댑터기능
        bird.makeSound();
    }
}
