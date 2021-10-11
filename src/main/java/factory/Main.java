package main.java.factory;

public class Main {
    public static void main(String[] args) {
        Animal animal = new AnimalFactory().getAnimal("dog");
        System.out.println(animal.isVaccineRequired());
        System.out.println(animal.getName());
    }
}
