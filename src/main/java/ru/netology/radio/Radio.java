package ru.netology.radio;

public class Radio {
    protected int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int quantityOfRadioStation;

    public Radio() {
        this.quantityOfRadioStation = 10;
    }

    public Radio(int quantityOfRadioStation) {
        this.quantityOfRadioStation = quantityOfRadioStation;
        this.maxRadioStation = quantityOfRadioStation - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int nextRadioStation() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
        return currentRadioStation;
    }

    public int prevRadioStation() {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int increaseVolumeByOnePoint() {
        if (currentVolume >= maxVolume) {
            currentVolume = 100;
        } else {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int reducingVolumeByOnePoint() {
        if (currentVolume <= minVolume) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
