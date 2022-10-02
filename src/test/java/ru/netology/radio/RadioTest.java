package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetMinCurrentStation() {

        Radio radio = new Radio();

        radio.setCurrentStation (0);

        int expected = 0;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void shouldSetMaxCurrentStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetOverMaxCurrentStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetRepeatedNumberStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(000);

        int expected = 0;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

     @Test

     public void shouldSetUnderMinCurrentStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
