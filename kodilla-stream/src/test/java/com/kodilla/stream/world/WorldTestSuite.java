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
        Continent europe = new Continent("Europe");
        europe.addCountries(new Country(new BigDecimal("38000000"), "Poland"));
        europe.addCountries(new Country(new BigDecimal("71000000"), "Germany"));
        world.addContinents(europe);

        Continent asia = new Continent("Asia");
        asia.addCountries(new Country(new BigDecimal("51000000"), "Japan"));
        asia.addCountries(new Country(new BigDecimal("560000000"), "India"));
        world.addContinents(asia);

        Continent nAmerica = new Continent("North America");
        nAmerica.addCountries(new Country(new BigDecimal("320000000"), "USA"));
        world.addContinents(nAmerica);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("1040000000"), totalPeopleQuantity);
    }
}
