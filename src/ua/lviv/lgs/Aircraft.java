package ua.lviv.lgs;

public abstract class Aircraft {

    private double aircraftLength = 19.6;
    private double aircraftWidth = 14.7;
    private int aircraftWeight = 16000;
    private int maxSpeed;
    private String color;

    public Aircraft(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    abstract void startingEngines();

    abstract void aircraftTakingOff();

    abstract void landingThePlane();

}
