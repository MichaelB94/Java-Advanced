package javaoopadvanced._2;

public class Boat implements Movable{
    @Override
    public void moveForward() {
        System.out.println("The boat is moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The boat is moving backward");
    }
}
