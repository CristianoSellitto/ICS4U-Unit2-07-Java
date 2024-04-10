/*
* This class creates a truck using methods from vehicles
* 
* @author  Cristiano Sellitto
* @version 1.0
* @since   2024-04-09
*/

/**
 * This is the class.
*/
public class Bike extends Vehicle {
    /**
     * Variable for the class.
     *
     * @param cadence of the bike
    */
    private double cadence;

    /**
     * Creates the base truck.
     *
     * @param startColour the base colour
     * @param startMaxSpeed the maximum speed of the vehicle
    */
    public Bike(String startColour, double startMaxSpeed) {
        super(startColour, startMaxSpeed);
        this.cadence = 0;
    }

    /**
     * Gets the cadence of the bike.
     *
     * @return the current cadence
    */
    public double getCadence() {
        return this.cadence;
    }

    /**
     * Creates a string about the status of the vehicle.
     *
     * @return the string about the vehicle's status
    */
    public String getStatus() {
        final String lineBreak = "\n";
        String status = " -> Speed: " + this.speed + lineBreak;
        status += " -> MaxSpeed: " + this.maxSpeed + lineBreak;
        status += " -> Color: " + this.colour + lineBreak;
        status += " -> Cadence: " + this.cadence + lineBreak;

        return status;
    }

    /**
     * Sets the cadence of the bike.
     *
     * @param newPlateNumber of the vehicle.
    */
    public void setCadence(double newCadence) {
        this.cadence = newCadence;
        this.speed = newCadence + newCadence;
    }

    /**
     * Accelerates the bike, changing cadence.
     *
     * @param appliedNumber biking power
    */
    public void accelerate(double appliedNumber) {
        this.cadence = this.cadence + appliedNumber;
        this.speed = this.speed + appliedNumber + appliedNumber;
    }

    /**
     * Rings the bike's bell.
    */
    public void ringBell() {
        System.out.println("Ding ding!\n");
    }
}
