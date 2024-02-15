public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Cow", 5);
        genericAnimal.displayInfo(); //prints animal's name and age
        genericAnimal.makeSound(); //Displays animal's sound, used if statement for 3 animals: cow, dog, and cat
        genericAnimal.allergies(); //Displays animal's allergies
        System.out.println('\n'); //Added in for spacing



        Dog myDog = new Dog("Max", 3, "Mini Dachshund");
        myDog.displayInfo(); //prints dog's name, age, and breed
        myDog.makeSound(); //Displays bark
        myDog.allergies(); //Displays allergies
        System.out.println('\n'); //Added in for spacing



        Cat myCat = new Cat("Buttercup", 2, false);
        myCat.displayInfo(); //prints cat's name, age
        myCat.makeSound(); //Displays meow

        myCat.allergies(); //used if statement to change allergies depending on if it is lazy or not
    }
}
