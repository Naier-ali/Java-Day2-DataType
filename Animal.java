package day2;

public class Animal {
    private String animalName;
    private String animalType;
    private int numberOfLegs;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void walks() {
        System.out.println(animalName + " is walking.");
    }

    public void eats() {
        System.out.println(animalName + " is eating.");
    }

    public void makesSound() {
        System.out.println(animalName + " is making a sound.");
    }
}

