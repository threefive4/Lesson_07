package ua.lviv.lgs;

public abstract class Aircraft {

    double aircraftLength = 19.6;
    double aircraftWidth = 14.7;
    int aircraftWeight = 16000;
    int maxSpeed = 2500;
    String color = "black";

    public Aircraft(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
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

}
