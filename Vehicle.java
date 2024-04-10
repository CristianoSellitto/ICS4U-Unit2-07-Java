/*
* This class creates a vehicle
*
* @author  Cristiano Sellitto
* @version 1.1
* @since   2024-03-28
*/

/**
 * This is the class.
*/
public class Vehicle {
    /**
     * Variable for the class.
     *
     * @param colour of the vehicle
    */
    protected String colour = "";

    /**
     * Variables for the class.
     *
     * @param speed of the vehicle
    */
    protected double speed;

    /**
     * Variables for the class.
     *
     * @param maxSpeed of the vehicle
    */
    protected double maxSpeed;

    /**
     * Creates the base vehicle.
     *
     * @param startColour the base colour
     * @param startMaxSpeed the maximum speed of the vehicle
    */
    public Vehicle(String startColour, double startMaxSpeed) {
        this.colour = startColour;
        this.speed = 0;
        this.maxSpeed = startMaxSpeed;
    }

    /**
     * Gets the colour of the vehicle.
     *
     * @return the current colour
    */
    public String getColour() {
        return this.colour;
    }

    /**
     * Gets the speed of the vehicle.
     *
     * @return the current speed
    */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * Gets the maximum speed of the vehicle.
     *
     * @return the maximum speed
    */
    public double getMaxSpeed() {
        return this.maxSpeed;
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

        return status;
    }

    /**
     * Sets the colour of the vehicle.
     *
     * @param newColour of the vehicle
    */
    public void setColour(String newColour) {
        this.colour = newColour;
    }

    /**
     * Accelerates the vehicle, which changes the speed.
     *
     * @param accelPower power of the acceleration
     * @param accelTime time of the acceleration
    */
    public void accelerate(double accelPower, double accelTime) {
        this.speed = (accelPower * accelTime) + this.speed;
        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * Brakes the vehicle, which changes speed.
     *
     * @param brakePower power of the brake
     * @param brakeTime time of the brake
    */
    public void brake(double brakePower, double brakeTime) {
        this.speed = this.speed - (brakePower * brakeTime);
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
