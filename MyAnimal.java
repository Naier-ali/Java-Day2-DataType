package day2;
public class MyAnimal {
    public static void main(String[] args) {
    	System.out.println("Creating Cow....");
    	System.out.println("***********************");
    	Animal cow = new Animal();
        cow.setAnimalName("Cow");
        cow.setAnimalType("Mammal");
        cow.setNumberOfLegs(4);

        System.out.println("Animal Name: " + cow.getAnimalName());
        System.out.println("Animal Type: " + cow.getAnimalType());
        System.out.println("Number of Legs: " + cow.getNumberOfLegs());

        cow.walks();
        cow.eats();
        cow.makesSound();

        System.out.println();
        
        System.out.println("Creating Dog....");
    	System.out.println("***********************");
        Animal dog = new Animal();
        dog.setAnimalName("Dog");
        dog.setAnimalType("Domestic Mammal");
        dog.setNumberOfLegs(4);

        System.out.println("Animal Name: " + dog.getAnimalName());
        System.out.println("Animal Type: " + dog.getAnimalType());
        System.out.println("Number of Legs: " + dog.getNumberOfLegs());

        dog.walks();
        dog.eats();
        dog.makesSound();

        System.out.println();
        
        System.out.println("Creating Cat....");
    	System.out.println("***********************");
        Animal cat = new Animal();
        cat.setAnimalName("Cat");
        cat.setAnimalType("Mammal");
        cat.setNumberOfLegs(4);

        System.out.println("Animal Name: " + cat.getAnimalName());
        System.out.println("Animal Type: " + cat.getAnimalType());
        System.out.println("Number of Legs: " + cat.getNumberOfLegs());

        cat.walks();
        cat.eats();
        cat.makesSound();
    }
}