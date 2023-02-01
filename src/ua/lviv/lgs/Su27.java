package ua.lviv.lgs;

public class Su27 extends Aircraft implements AircraftCapabilities {


    AircraftControl c = new AircraftControl();

    void move() {
        c.moveUp();
        c.moveLeft();
        c.moveDown();
        c.moveRight();

    }

    void startingEngines() {
        System.out.println("Time left until ready to fly = " + (20 + Math.random() * 68));
    }

    void aircraftTakingOff() {

        System.out.println("The plane will travel kilometers on a full tank of fuel = " + Math.random() * 1000);
    }

    void landingThePlane() {

        System.out.println("The plane is going to land");
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

