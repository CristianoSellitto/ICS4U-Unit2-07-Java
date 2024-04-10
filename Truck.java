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
public class Truck extends Vehicle {
    /**
     * Variable for the class.
     *
     * @param licensePlateNumber the license plate number on the vehicle
    */
    private String licensePlateNumber = "";

    /**
     * Creates the base truck.
     *
     * @param startColour the base colour
     * @param startPlateNumber the base license plate number
     * @param startMaxSpeed the maximum speed of the vehicle
    */
    public Truck(
            String startColour, double startMaxSpeed, String startPlateNumber
    ) {
        super(startColour, startMaxSpeed);
        this.licensePlateNumber = startPlateNumber;
    }

    /**
     * Gets the license plate number of the vehicle.
     *
     * @return the current licensePlateNumber
    */
    public String getLicensePlateNumber() {
        return this.licensePlateNumber;
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
        status += " -> License Plate: " + this.licensePlateNumber + lineBreak;

        return status;
    }

    /**
     * Sets the license plate of the vehicle.
     *
     * @param newPlateNumber of the vehicle.
    */
    public void setLicensePlateNumber(String newPlateNumber) {
        this.licensePlateNumber = newPlateNumber;
    }

    /**
     * Provides air the the wheels of the truck, which changes speed.
     *
     * @param airPressure applied to the truck
    */
    public void applyAir(double airPressure) {
        this.speed = this.speed - airPressure / 2;
    }
}
