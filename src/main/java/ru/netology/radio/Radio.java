package ru.netology.radio;

public class Radio {
    int currentStation;
    int currentVolume;

    //Радиостанции

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentStation = 9;
            return;
        }
        if (newCurrentStation > 9) {
            currentStation = 0;
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    //Громкость

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        return;
    }


}