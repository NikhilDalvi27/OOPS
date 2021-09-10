package basics;

public class Interfaces implements Car1 {
    @Override
    public void start() {

    }

    public static void main(String[] args) {

    }
}

interface Car1{
    public abstract void start(); // By Default all the methods are public and abstract
}
