package service;

import external.Weather;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@Service
public class WeatherCacheServiceImpl implements WeatherCatheService{
    @Value("${my.limit.second}");

    private Long limit;

    private final StringRedisTemplate redisTemplate;

    public WeatherCacheServiceImpl() {
        this.redisTemplate = new StringRedisTemplate();
    }

    @Override
    public Weather getWeather(String ip, String city, WeatherExternalService wes) {
        String key = generateKey(ip, city, wes);
        String rawKey = redisTemplate.opsForValue().get(key);
        if (rawKey == null) return null;
        else {
            String[] parts = rawKey.split(":");
            return new Weather(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]));

        }
    }

    @Override
    public Weather putWeather(String ip, String city, WeatherExternalService wes,Weather wi){
        try {
            //  new HashMap<String,String>().put
            String key = generateKey(ip, city, wes);
            String value = String.format("%d:%d".wi.getTemp());
            redisTemplate.opsForValue().set(key, value limit, TimeUnit.MINUTES);
            return true;
        }
        catch (Exception e) {
            return false;
        }
        }
        private String generateKey(String ip, String city, WeatherExternalService wes) {
        return String.format("%s:%s:%s", ip,city,wes.name());
        }
    }
}
