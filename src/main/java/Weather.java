public class Weather {

    private int temp;
    private int wind;
    private int precipitation;

    public Weather() {}

    public Weather (int temp, int wind, int precipitation) {
        this.temp = temp;
        this.wind = wind;
        this.precipitation = precipitation;
    }

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
