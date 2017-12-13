/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private int visiility;
    private Wind wind;
    private Clouds clouds;
    private int dt;
    private Sys sys;
    private int id;
    private String name;
    private int cod;
    
    public WeatherData(){
        
    }
    /**
     * @return the coord
     */
    public Coord getCoord() {
        return coord;
    }

    /**
     * @param coord the coord to set
     */
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    /**
     * @return the weather
     */
    public List<Weather> getWeather() {
        return weather;
    }

    /**
     * @param weather the weather to set
     */
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    /**
     * @return the base
     */
    public String getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * @return the main
     */
    public Main getMain() {
        return main;
    }

    /**
     * @param main the main to set
     */
    public void setMain(Main main) {
        this.main = main;
    }

    /**
     * @return the visiility
     */
    public int getVisiility() {
        return visiility;
    }

    /**
     * @param visiility the visiility to set
     */
    public void setVisiility(int visiility) {
        this.visiility = visiility;
    }

    /**
     * @return the wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * @param wind the wind to set
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * @return the clouds
     */
    public Clouds getClouds() {
        return clouds;
    }

    /**
     * @param clouds the clouds to set
     */
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    /**
     * @return the dt
     */
    public int getDt() {
        return dt;
    }

    /**
     * @param dt the dt to set
     */
    public void setDt(int dt) {
        this.dt = dt;
    }

    /**
     * @return the sys
     */
    public Sys getSys() {
        return sys;
    }

    /**
     * @param sys the sys to set
     */
    public void setSys(Sys sys) {
        this.sys = sys;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

}
