package com.himedi.cityweather;

import java.util.List;

public class WeatherResponse {
    private Main main;
    private List<Weather> weather;

    // Getters and setters
    public Main getMain() { return main; }
    public void setMain(Main main) { this.main = main; }
    public List<Weather> getWeather() { return weather; }
    public void setWeather(List<Weather> weather) { this.weather = weather; }
}