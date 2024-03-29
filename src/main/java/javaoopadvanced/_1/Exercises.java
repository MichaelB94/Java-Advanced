package javaoopadvanced._1;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog myDog = new Dog(118.5,96,"Alano");
        Bird myBird = new Bird(62.4,12.5,120);
        Fish myFish = new Fish(80,25.5,"Carp");


        if (myDog.runSpeedMetersPerSecond() > myBird.flySpeedMetersPerSecond()
                || myDog.runSpeedMetersPerSecond() > myFish.swimSpeedMetersPerSecond()){
            System.out.println("The dog is the fastest.It run at " + myDog.runSpeedMetersPerSecond() + " m/s.");
        }else if (myBird.flySpeedMetersPerSecond() > myFish.swimSpeedMetersPerSecond()
                || myBird.flySpeedMetersPerSecond() > myDog.runSpeedMetersPerSecond()){
            System.out.println("The bird is the fastest.It run at " + myBird.flySpeedMetersPerSecond() + " m/s.");
        }else if (myFish.swimSpeedMetersPerSecond() > myDog.runSpeedMetersPerSecond()
                || myFish.swimSpeedMetersPerSecond() > myDog.runSpeedMetersPerSecond()){
            System.out.println("Thefish is the fastest.It run at " + myFish.swimSpeedMetersPerSecond() + " m/s.");
        }


    }
}
