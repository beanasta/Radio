package ru.netology.radio;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Radio {

    private int numberStation = 10;

    private int minNumberStation = 1;
    private int minCurrentStation = 0;
    private int currentStation = minCurrentStation;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;
    private int currentVolume;


    public Radio(int numberStation) {

        this.numberStation = numberStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minCurrentStation) {
            return;
        }

        if (newCurrentStation <= numberStation) {
            currentStation = numberStation - 1;
        }

        currentStation = newCurrentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }


    public int getNumberStation() {
        return numberStation;
    }


    public void setNumberStation(int newNumberStation) {
        numberStation = newNumberStation;
    }


    public void next() {
        if (currentStation < (numberStation - 1)) {
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
            currentStation = numberStation - 1;
        }
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


}
