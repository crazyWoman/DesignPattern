package main.java.factory;

public class AnimalFactory {
    public Animal getAnimal(String animal){
        if(animal.equalsIgnoreCase("dog")){
            return new Dog();
        }else  if(animal.equalsIgnoreCase("cat")){
            return new Cat();
        }else  if(animal.equalsIgnoreCase("bird")){
            return new Bird();
        }
        return null;
    }
}
