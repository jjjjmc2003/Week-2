public class Animal {
    private String name; //creates instance variable
    private int age; //creates instance variable



    public Animal(String name, int age) {
        this.name = name; //sets instance variable
        this.age = age; //also sets instance variable

    }

    public String getName() {
        return name; //all of these methods are getters and setters for the instance variables and return them
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void makeSound() {
        if (name == "Cow") {
            System.out.println("Moo");
        } else if (name == "Dog") {
            System.out.println("Bark"); //used this if statement to change the sound of the animals depending on the type of animal
        } else if (name == "Cat") {
            System.out.println("Meow");
        }
    }
    public void allergies(){
        System.out.println("Allergies: No allergies");
    }
}


