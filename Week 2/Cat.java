public class Cat extends Animal {
    private boolean Lazy;
    // everything here is pretty much the same as dog, but I added a boolean to check if the cat is lazy or not


    public Cat(String name, int age, boolean isLazy) {
        super(name, age);
        this.Lazy = isLazy;
    }

    public boolean isLazy() {
        return Lazy;
    }

    public void setLazy(boolean lazy) {
        Lazy = lazy;
    }

    public void meow() {
        System.out.println("Meow!");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
    @Override
    public void allergies() {
        if(Lazy) {
            System.out.println("Allergies: Allergic to work");
            //This if statement changes the allergies based off cat's laziness
        } else {
            System.out.println("Allergies: Allergic to days off and sleeping in");
        }
        }
    }
