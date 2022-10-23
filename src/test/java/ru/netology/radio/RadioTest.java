package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetMinCurrentStation() {

        Radio radio = new Radio();

        radio.setNumberStation(1);

        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());


    }


    @Test

    public void shouldSetMaxCurrentStation() {

        Radio radio = new Radio();

        radio.setNumberStation(50);

        radio.setCurrentStation(49);

        Assertions.assertEquals(49, radio.getCurrentStation());
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

    public void shouldNextStationAfterMin() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.next();

        Assertions.assertEquals(1, radio.getCurrentStation());


    }


    @Test

    public void shouldNextStationBeforeMax() {

        Radio radio = new Radio();

        radio.setNumberStation(15);

        radio.setCurrentStation(14);

        radio.next();

        Assertions.assertEquals(0, radio.getCurrentStation());


    }


    @Test

    public void shouldPreviousStationBeforeMax() {

        Radio radio = new Radio();

        radio.setNumberStation(15);

        radio.setCurrentStation(14);

        radio.prev();

        Assertions.assertEquals(13, radio.getCurrentStation());


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

    public void switchPreviousStationBeforeMin() {

        Radio radio = new Radio();

        radio.setNumberStation(3);

        radio.setCurrentStation(0);

        radio.prev();

        Assertions.assertEquals(2, radio.getCurrentStation());


    }


    @Test

    public void shouldSetNumberStations() {
        Radio radio = new Radio();

        radio.setNumberStation(50);

        Assertions.assertEquals(50, radio.getNumberStation());


    }


    @Test

    public void shouldInitNumberStation() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(15);

        Assertions.assertEquals(15, radio.getCurrentStation());


    }


    @Test

    public void shouldInitRadio() {

        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getNumberStation());


    }


}





