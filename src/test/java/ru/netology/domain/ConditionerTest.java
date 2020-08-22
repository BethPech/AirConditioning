package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Conditioner;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldIncreaseCurrentTemperature() {
        Conditioner Conditioner = new Conditioner();
        assertEquals(0, Conditioner.getCurrentTemperature());
        assertEquals(0, Conditioner.getMaxTemperature());
        assertEquals(0, Conditioner.getMinTemperature());
        Conditioner.setMaxTemperature(18);
        Conditioner.setMinTemperature(-5);
        Conditioner.setCurrentTemperature(-5);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-4);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-3);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-2);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-1);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(0);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(1);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(2);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(3);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(4);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(5);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(6);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(7);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(8);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(9);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(10);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-5);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(11);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(12);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(13);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(14);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(15);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(16);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(17);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(18);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(19);
        Conditioner.increaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-7);
        Conditioner.increaseCurrentTemperature();

    }

    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner Conditioner = new Conditioner();
        assertEquals(0, Conditioner.getCurrentTemperature());
        assertEquals(0, Conditioner.getMaxTemperature());
        assertEquals(0, Conditioner.getMinTemperature());
        Conditioner.setMaxTemperature(18);
        Conditioner.setMinTemperature(-5);
        Conditioner.setCurrentTemperature(-5);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-4);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-3);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-2);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-1);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(0);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(1);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(2);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(3);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(4);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(5);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(6);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(7);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(8);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(9);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(10);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-5);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(11);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(12);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(13);
        Conditioner.decreaseCurrentTemperature();;
        Conditioner.setCurrentTemperature(14);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(15);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(16);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(17);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(18);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(19);
        Conditioner.decreaseCurrentTemperature();
        Conditioner.setCurrentTemperature(-7);
        Conditioner.decreaseCurrentTemperature();
    }
}
