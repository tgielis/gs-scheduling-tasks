/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author gebruiker
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostCodeObj {
    private String postcode;
    private String plaatsnaam;
    private String deelgemeente;
    private String provincie;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPlaatsnaam() {
        return plaatsnaam;
    }

    public void setPlaatsnaam(String plaatsnaam) {
        this.plaatsnaam = plaatsnaam;
    }

    public String getDeelgemeente() {
        return deelgemeente;
    }

    public void setDeelgemeente(String deelgemeente) {
        this.deelgemeente = deelgemeente;
    }

    public String getProvincie() {
        return provincie;
    }

    public void setProvincie(String provincie) {
        this.provincie = provincie;
    }
    
}
