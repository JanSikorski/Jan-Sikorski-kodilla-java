package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent();
        europe.addCountries(new Country(new BigDecimal("38000000")));
        europe.addCountries(new Country(new BigDecimal("71000000")));
        world.addContinents(europe);

        Continent asia = new Continent();
        asia.addCountries(new Country(new BigDecimal("51000000")));
        asia.addCountries(new Country(new BigDecimal("560000000")));
        world.addContinents(asia);

        Continent nAmerica = new Continent();
        nAmerica.addCountries(new Country(new BigDecimal("320000000")));
        world.addContinents(nAmerica);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("1040000000"), totalPeopleQuantity);
    }
}
