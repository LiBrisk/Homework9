package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;
    public Radio(){
        this.maxVolume = 100;
        this.maxStation = 9;

    }


    public Radio (int stationsCount){
        this.maxStation = stationsCount - 1;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }

    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void changeVolumePlus() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void changeVolumeMinus() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
