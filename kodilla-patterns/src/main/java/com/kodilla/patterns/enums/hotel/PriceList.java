package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;
import java.util.Map;

public class PriceList {

    private static Map<Seasion, BigDecimal> singleBedPrices = Map.of(
            Seasion.LOW, new BigDecimal(250),
            Seasion.HIGH, new BigDecimal(320),
            Seasion.HOLIDAY, new BigDecimal(400)
    );

    private static Map<Seasion, BigDecimal> doubleBedPrices = Map.of(
            Seasion.LOW, new BigDecimal(350),
            Seasion.HIGH, new BigDecimal(400),
            Seasion.HOLIDAY, new BigDecimal(500)
    );

    public static BigDecimal getSingleBedPrice(Seasion season) {
        return singleBedPrices.get(season);
    }

    public static BigDecimal getDoubleBedPrice(Seasion season) {
        return doubleBedPrices.get(season);
    }
}
