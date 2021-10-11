package main.java.factory;

public class Dog implements Animal{
    @Override
    public boolean isVaccineRequired() {
        return true;
    }

    @Override
    public String movement() {
        return "walk";
    }

    @Override
    public String getName() {
        return "Jewels";
    }
}
