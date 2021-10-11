package main.java.factory;

public class Bird implements Animal{
    @Override
    public boolean isVaccineRequired() {
        return false;
    }

    @Override
    public String movement() {
        return "fly";
    }

    @Override
    public String getName() {
        return "Pepper";
    }
}
