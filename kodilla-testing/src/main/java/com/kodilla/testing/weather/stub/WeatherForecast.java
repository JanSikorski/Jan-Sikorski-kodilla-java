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
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature() {
        Double sum = 0.0;

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }

        return sum / temperatures.getTemperatures().size();
    }

    private List<Double> sortTemperatures() {

        List<Double> sortedTemperatures = new ArrayList<>();
        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            sortedTemperatures.add(temperature.getValue());
        }

        Collections.sort(sortedTemperatures);

        return sortedTemperatures;
    }
    public double medianTemperature() {

        if (sortTemperatures().size() % 2 == 0) {
            double lowerValue = sortTemperatures().get(sortTemperatures().size() / 2);
            double higherValue = sortTemperatures().get(sortTemperatures().size() / 2 - 1);

            return lowerValue / higherValue;
        } else {
            return sortTemperatures().get(sortTemperatures().size() / 2);
        }
    }
}