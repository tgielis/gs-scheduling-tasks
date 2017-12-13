/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind {
    private double speed;
    private double deg;
    
    public Wind(){
        
    }
    /**
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * @return the deg
     */
    public double getDeg() {
        return deg;
    }

    /**
     * @param deg the deg to set
     */
    public void setDeg(double deg) {
        this.deg = deg;
    }

}
