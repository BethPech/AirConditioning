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
        Conditioner.setCurrentTemperature(6);
        Conditioner.increaseCurrentTemperature();


    }

    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner Conditioner = new Conditioner();
        assertEquals(0, Conditioner.getCurrentTemperature());
        Conditioner.setMaxTemperature(18);
        Conditioner.setMinTemperature(-5);
        Conditioner.setCurrentTemperature(-1);
        Conditioner.decreaseCurrentTemperature();

    }
}
