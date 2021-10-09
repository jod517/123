package external;

@JsonIgnoreProperties
public class OpenWeather {

    private StatsOpenMap main;


    public Weather toWheather() {
        return new Weather((int)this.main.getTemp(),this.main.getWind(), this.main.getPrecipitation());
    }
    public OpenWeather.StatsOpenMap getMain() {
        return main;
    }

    public void setMain(OpenWeather.StatsOpenMap main) {
        this.main = main;
    }

    @JsonIgnoreProperties
    private static class StatsOpenMap {
        private int temp;
        private int wind;
        private int precipitation;

        public int getTemp() {
            return temp;
        }

        public void setTemp(int temp) {
            this.temp = temp;
        }

        public int getWind() {
            return wind;
        }

        public void setWind(int wind) {
            this.wind = wind;
        }

        public int getPrecipitation() {
            return precipitation;
        }

        public void setPrecipitation(int precipitation) {
            this.precipitation = precipitation;
        }
    }

}