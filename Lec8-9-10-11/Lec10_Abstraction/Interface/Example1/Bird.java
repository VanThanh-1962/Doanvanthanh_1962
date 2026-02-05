package Lec10_Abstraction.Interface.Example1;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}