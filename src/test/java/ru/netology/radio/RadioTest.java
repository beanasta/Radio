package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetMinCurrentStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());


    }

    @Test

    public void shouldSetMaxCurrentStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test

    public void shouldSetOverMaxCurrentStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void shouldSetRepeatedNumberStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(000);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void shouldSetUnderMinCurrentStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());


    }


    @Test

    public void switchNextStationAfterMin() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.next();

        Assertions.assertEquals(1, radio.getCurrentStation());


    }

    @Test


    public void switchNextStationAfterMax() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        Assertions.assertEquals(0, radio.getCurrentStation());


    }

    @Test


    public void switchNextStationBeforeMax() {

        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.next();

        Assertions.assertEquals(9, radio.getCurrentStation());


    }

    @Test

    public void switchPreviousStationBeforeMin() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentStation());


    }

    @Test


    public void switchPreviousStationBeforeMax() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prev();

        Assertions.assertEquals(8, radio.getCurrentStation());


    }


    @Test

    public void decreaseMaxVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());


    }

    @Test


    public void decreaseMinVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());


    }

    @Test


    public void increaseMaximumVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());


    }

    @Test

    public void increaseMinVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());


    }

    @Test

    public void shouldMaxNumberStations() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(10, radio.getNumberStations());
    }

    @Test

    public void shouldOverMaxNumberStations() {
        Radio radio = new Radio(11);

        Assertions.assertEquals(0, radio.getNumberStations());
    }

    @Test

    public void shouldMinNumberStations() {
        Radio radio = new Radio(1);

        Assertions.assertEquals(1, radio.getNumberStations());
    }

    @Test

    public void shouldUnderMinNumberStations() {
        Radio radio = new Radio(0);

        Assertions.assertEquals(0, radio.getNumberStations());
    }

    @Test

    public void shouldDefaultNumberStations() {
        Radio radio = new Radio();

        radio.getDefaultNumberStations();

        Assertions.assertEquals(10, radio.getDefaultNumberStations());
    }


}





