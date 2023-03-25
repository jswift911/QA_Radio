package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int countStations;
    private int minStation = 0;
    private int maxStation;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio(int countStations) {
        this.countStations = countStations;
        this.maxStation = this.countStations - 1;
    }

    public Radio() {
        this.countStations = 10;
        this.maxStation = this.countStations - 1;
    }

    //Радиостанции

    public int getMaxStation() {
        return maxStation;
    }
    public int getCountStations() {
        return countStations;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            currentStation = maxStation;
            return;
        }
        if (newCurrentStation > maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    //Громкость

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < maxVolume) {
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume > minVolume) {
            currentVolume = newCurrentVolume;
        }
        return;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        return;
    }


}
