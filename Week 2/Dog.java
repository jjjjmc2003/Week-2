public class Dog extends Animal {
    private String breed; //pretty much everything here is a continuation of animal class

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!"); //this override is from the animal class and overrides makeSound from animal class so that it prints bark since class is a dog
    }
    @Override
    public void allergies() {
        System.out.println("Allergies: Max has a sensitive stomach, so please avoid food with milk.");

    }
}