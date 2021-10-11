package main.java.factory;

public class Cat implements Animal{
    @Override
    public boolean isVaccineRequired() {
        return false;
    }

    @Override
    public String movement() {
        return "walk";
    }

    @Override
    public String getName() {
        return "PeterPAn";
    }
}
