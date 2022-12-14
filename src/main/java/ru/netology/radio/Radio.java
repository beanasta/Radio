package ru.netology.radio;

public class Radio {

    private int currentStation;


    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < 0) {
            return;
        }

        if (newCurrentStation > 9) {
            return;
        }

        currentStation = newCurrentStation;


    }

    public void next() {


        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }


    }

    public void prev() {


        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }


        if (currentStation <= 0) {
            currentStation = 9;
        }


    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int newCurrentVolume) {


        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {


        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }


    }

    public void decreaseVolume() {


        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }


}
