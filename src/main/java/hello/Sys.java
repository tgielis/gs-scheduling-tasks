/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {
    private int type;
    private int id;
    private double message;
    private String country;
    private int sunrise;
    private int sunset;
    
    public Sys(){
        
    }
    
    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the message
     */
    public double getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(double message) {
        this.message = message;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the sunrise
     */
    public int getSunrise() {
        return sunrise;
    }

    /**
     * @param sunrise the sunrise to set
     */
    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    /**
     * @return the sunset
     */
    public int getSunset() {
        return sunset;
    }

    /**
     * @param sunset the sunset to set
     */
    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

}
