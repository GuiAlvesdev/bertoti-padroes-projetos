public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        WeatherObserver observer = new WeatherObserver();

        // Registro do Observador
        weatherData.addObserver(observer);

        // Simulação de mudança na temperatura
        weatherData.setTemperature(25.5f);
    }
}