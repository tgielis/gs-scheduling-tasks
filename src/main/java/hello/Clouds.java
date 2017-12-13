/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Clouds {

    private double all;
    public Clouds(){
        
    }
    /**
     * @return the all
     */
    public double getAll() {
        return all;
    }

    /**
     * @param all the all to set
     */
    public void setAll(double all) {
        this.all = all;
    }
    
    
    
}
