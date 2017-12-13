/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
/**
 *
 * @author gebruiker
 */
@Component
class WeatherDatabase {
    
    private static final Logger log = LoggerFactory.getLogger(WeatherDatabase.class);
    
    private static List<String> wdcitynames = new ArrayList<String>();    
    private static List<WeatherData> wd = new ArrayList<WeatherData>();
    private HashMap<String, PostCodeObj> wdpostcodes = new HashMap<String, PostCodeObj>();
    WeatherDatabase(){
        addCity("Leuven");
        addCity("Antwerpen");
        updateData();
        /*JsonParser jp = new JsonParser();
        JsonArray jo;
        jo = (JsonArray) jp.parse( new FileReader("C:\\Users\\gebruiker\\Documents\\NetBeansProjects\\gs-scheduling-tasks-master\\complete\\src\\main\\java\\hello\\newjson.json"));
        ArrayList<PostCodeObj> yourArray = new Gson().fromJson(jo.toString(), new TypeToken<List<PostCodeObj>>(){}.getType());
        log.info(yourArray.get(1).getPostcode());*/
    }
    public void addCity(String city){
        if(!wdcitynames.contains(city)){
            wdcitynames.add(city);
            updateData();
        }
    }

    public List<String> getWdcitynames() {
        return wdcitynames;
    }

    public void setWdcitynames(List<String> wdcitynames) {
        this.wdcitynames = wdcitynames;
    }

    public List<WeatherData> getWd() {
        return wd;
    }

    public void setWd(List<WeatherData> wd) {
        this.wd = wd;
    }
    
    public double gemTempCelcius(){
        double gem = 0;
        for(WeatherData d:wd){
            gem += d.getMain().getTemp();
        }
        return gem/wd.size()-273;
    }
    public WeatherData Leuven(){
        RestTemplate restTemplate = new RestTemplate();
        WeatherData weatherData = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Leuven,Be&appid=4d266ae3b02d55862d303fda83185146", WeatherData.class);
        return weatherData;
    }
    
    @Scheduled(fixedRate = 10000)
    public void updateData() {
        log.info("The time is now 1");
        wd.clear();
        RestTemplate restTemplate = new RestTemplate();
        for(String s: wdcitynames){
            WeatherData weatherData = restTemplate.getForObject(
					"http://api.openweathermap.org/data/2.5/weather?q="+s+",Be&appid=4d266ae3b02d55862d303fda83185146", WeatherData.class);
            log.info(weatherData.getName());
            wd.add(weatherData);
        }
        
        log.info("The time is now 2");
    }
    private String theString = "";
}
