import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        setChanged(); // Indica que houve uma mudança nos dados
        notifyObservers(); // Notifica os Observadores
    }

    public float getTemperature() {
        return temperature;
    }
}
