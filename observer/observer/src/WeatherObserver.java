import java.util.Observable;
import java.util.Observer;

public class WeatherObserver implements Observer {
    private float temperature;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    public void display() {
        System.out.println("Temperatura atual: " + temperature);
    }
}
