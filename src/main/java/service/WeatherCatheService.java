package service;

import external.Weather;

public interface WeatherCatheService {
    Weather getInfo(String ip,String city,WeatherExternalService wes);
    Boolean putInfo (String ip,String city,WeatherExternalService wes, Weather wo);
}
