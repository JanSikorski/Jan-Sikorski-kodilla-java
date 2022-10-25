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

        for (double value: sortTemperatures()) {
            sum += value;
        }

        return sum / temperatures.getTemperatures().size();
    }

    public List<Double> sortTemperatures() {

        List<Double> sortedTemperatures = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sortedTemperatures.add(temperature.getValue());
        }

        //sorting mechanism

        for (int i = 0; i < sortedTemperatures.size(); i++) {
            for (int j = 0; j < sortedTemperatures.size(); j++) {
                if (sortedTemperatures.get(i) < sortedTemperatures.get(j)) {
                    double tmp = sortedTemperatures.get(i);
                    sortedTemperatures.set(i, sortedTemperatures.get(j));
                    sortedTemperatures.set(j, tmp);
                }
            }
        }

        return sortedTemperatures;
    }
    public double medianTemperature() {

        List<Double> sortedTemperatures = sortTemperatures();
        //in case if tempertaure map size is even, theres no middle value
        if (sortedTemperatures.size() % 2 == 0) {
            double lowerValue = sortedTemperatures.get(sortedTemperatures.size() / 2 - 1);
            double higherValue = sortedTemperatures.get(sortedTemperatures.size() / 2);

            return (lowerValue + higherValue) / 2;
        }
        //in case if temperature map size is odd
        else {
            return sortedTemperatures.get(sortedTemperatures.size() / 2);
        }
    }
}