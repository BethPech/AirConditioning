package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Conditioner;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldIncreaseCurrentTemperature() {
        Conditioner Conditioner = new Conditioner();
        assertEquals(0, Conditioner.getCurrentTemperature());
        Conditioner.setMaxTemperature(18);
        Conditioner.setMinTemperature(-5);

        Conditioner.setIncreaseCurrentTemperature(3);
        assertEquals(18, Conditioner.getCurrentTemperature());
    }


    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner Conditioner = new Conditioner();
        assertEquals(0, Conditioner.getCurrentTemperature());
        Conditioner.setMaxTemperature(18);
        Conditioner.setMinTemperature(-5);
        Conditioner.setDecreaseCurrentTemperature(-5);
        assertEquals(-5, Conditioner.getCurrentTemperature());

    }
}
