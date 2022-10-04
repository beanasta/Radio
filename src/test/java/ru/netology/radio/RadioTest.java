package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetMinCurrentStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);

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



    @Test

    public void switchNextStationAfterMin() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test


    public void switchNextStationAfterMax() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test


    public void switchNextStationBeforeMax() {

        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void switchPreviousStationBeforeMin() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test


    public void switchPreviousStationBeforeMax() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);


    }


    @Test

    public void decreaseMaxVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int expected = 9;

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test


    public void decreaseMinVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test


    public void increaseMaximumVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void increaseMinVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }


}





