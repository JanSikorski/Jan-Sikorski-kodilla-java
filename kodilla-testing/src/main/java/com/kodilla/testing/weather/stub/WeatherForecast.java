package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sum = 0.0;

        if (getTemperaturesValues().size() == 0) {
            return 0;
        }

        for (double value: getTemperaturesValues()) {
            sum += value;
        }

        return sum / temperatures.getTemperatures().size();
    }

    public List<Double> getTemperaturesValues() {

        List<Double> temperaturesArray = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesArray.add(temperature.getValue());
        }
        return temperaturesArray;
    }
    public double medianTemperature() {

        if (getTemperaturesValues().size() == 0) {
            return 0;
        }

        List<Double> sortedTemperatures = getTemperaturesValues();
        Collections.sort(sortedTemperatures);

        return sortedTemperatures.get(sortedTemperatures.size() / 2);
    }
}