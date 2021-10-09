package service;

import external.Weather;

public interface WeatherCatheService {
    Weather getWeather(String ip,String city,WeatherExternalService wes);
    Boolean putWeather (String ip,String city,WeatherExternalService wes, Weather wo);
}
