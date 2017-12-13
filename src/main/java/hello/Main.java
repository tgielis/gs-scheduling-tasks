/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
    private double temp;
    private double pressure;
    private double humidity;
    private double temp_min;
    private double temp_max;
    public Main(){
        
    }
    /**
     * @return the temp
     */
    public double getTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    /**
     * @return the pressure
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * @param pressure the pressure to set
     */
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    /**
     * @return the humidity
     */
    public double getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    /**
     * @return the temp_min
     */
    public double getTemp_min() {
        return temp_min;
    }

    /**
     * @param temp_min the temp_min to set
     */
    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    /**
     * @return the temp_max
     */
    public double getTemp_max() {
        return temp_max;
    }

    /**
     * @param temp_max the temp_max to set
     */
    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

}
