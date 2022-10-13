package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
//@AllArgsConstructor
//@Data


public class Radio {

    private int maxCurrentStation = 9;
    private int minCurrentStation = 0;

    private int currentStation = minCurrentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minCurrentStation) {
            return;
        }

        if (newCurrentStation > maxCurrentStation) {
            return;
        }

        currentStation = newCurrentStation;

    }

    public void next() {


        if (currentStation < maxCurrentStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }


    }

    public void prev() {


        if (currentStation > minCurrentStation) {
            currentStation = currentStation - 1;
        }


        if (currentStation <= minCurrentStation) {
            currentStation = maxCurrentStation;
        }


    }


    private int maxCurrentVolume = 100;

    private int minCurrentVolume = 0;

    private int currentVolume;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {


        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }


    }

    public void decreaseVolume() {


        if (currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        }

    }

    private int numberStations;

    private int minNumberStations = 1;
    private int maxNumberStations = 10;

    private int defaultNumberStations = maxNumberStations;

//    public Radio() {
//        this.numberStations = defaultNumberStations;
//    }

    public Radio(int numberStations) {
        if (numberStations < minNumberStations) {
            return;
        }
        if (numberStations > maxNumberStations) {
            return;
        }

        this.numberStations = numberStations;
    }

    public int getDefaultNumberStations() {
        return defaultNumberStations;
    }

    public int getNumberStations() {
        return numberStations;
    }
}
