package hello;

import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final WeatherDatabase wd = new WeatherDatabase();
    
    @CrossOrigin
    @RequestMapping("/WeatherData")
    public List<WeatherData> greeting() {
        return wd.getWd();
    }
    @CrossOrigin
    @RequestMapping("/Leuven")
    public WeatherData leuven() {
        return wd.Leuven();
    }
    @CrossOrigin
    @RequestMapping("/GemTempCelcius")
    public double gemTemp() {
        return wd.gemTempCelcius();
    }
    @CrossOrigin
    @RequestMapping(value="/VoegGemeenteToe", method = RequestMethod.POST)
    public void addCity(@RequestParam(value="City") String City) {
        if(!City.isEmpty()){
            wd.addCity(City); 
        }
    }
}
