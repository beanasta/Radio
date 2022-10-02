package ru.netology.radio;

public class Radio {

    public int currentStation;

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


//public int soundVolume;

//public void setToNextStation(){
//
//        int currentStation=9;
//
//
//        }

}
