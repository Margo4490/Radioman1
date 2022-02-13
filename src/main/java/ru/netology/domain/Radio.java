package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int numberOfRadioStation = 10;


    public Radio(int numberOfRadioStation) {
        this.numberOfRadioStation = numberOfRadioStation -1;

    }

    public Radio() {

    }

    public int getNumberOfRadioStation() {
        return numberOfRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setMaxStation() {
        this.currentRadioStation = 9;
    }

    public void setMinStation() {
        this.currentRadioStation = 0;

    }

    public void next() {
        setCurrentRadioStation(currentRadioStation = currentRadioStation + 1);

    }


    public void prev() {
        setCurrentRadioStation(currentRadioStation = currentRadioStation - 1);

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void setToMaxVolume() {
        this.currentVolume = 100;
    }

    public void setToMinVolume() {
        this.currentVolume = 0;
    }

    public void increaseVolume() {
        setCurrentVolume(currentVolume = currentVolume + 1);
    }

    public void reductionVolume() {
        setCurrentVolume(currentVolume = currentVolume - 1);

    }
}


