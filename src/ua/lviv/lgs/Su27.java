package ua.lviv.lgs;

public class Su27 extends Aircraft implements AircraftCapabilities {


    AircraftControl c = new AircraftControl();

    void moveUp() {
        System.out.println("The distance of the aircraft movement Up = " + Math.random());
    }

    void moveDown() {
        System.out.println("The distance of the aircraft movement Down = " + Math.random());
    }

    void moveLeft() {
        System.out.println("The distance of the aircraft movement Left = " + Math.random());
    }

    void moveRight() {
        System.out.println("The distance of the aircraft movement Right = " + Math.random());
    }

    public Su27(int maxSpeed, String color) {
        super(maxSpeed, color);
    }

    @Override
    public void turboAcceleration() {
        System.out.println("Turbo Acceleration = " + (2500 + Math.random()) + " km/h");
    }

    @Override
    public void stealthTechnology() {
        System.out.println("The plane is not visible = " + Math.random());

    }

    @Override
    public void nuclearStrike() {
        System.out.println("The number of nuclear warheads that will be dropped = " + Math.random() * 10);

    }


}

