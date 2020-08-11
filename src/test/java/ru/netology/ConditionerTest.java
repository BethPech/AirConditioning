package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldIncreaseCurrentTemperature() {
        Conditioner Conditioner = new Conditioner();
        assertNull(Conditioner.getName());
        assertEquals(18, Conditioner.getMaxTemperature());
        assertEquals(-5, Conditioner.getMinTemperature());
        assertEquals(0, Conditioner.getCurrentTemperature());
        assertFalse(Conditioner.isOn());
    }
}
