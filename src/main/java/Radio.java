public class Radio {
    private int currentFrequency;
    private int currentVolume;

    public int getCurrentFrequency() {
        return currentFrequency;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextFrequency() {
        if (currentFrequency == 9) {
        currentFrequency = 0;
    }
        else {
            currentFrequency++;
        }
    }

    public void previousFrequency() {
    if (currentFrequency == 0) {
        currentFrequency = 9;
    }
    else {
        currentFrequency = currentFrequency - 1;
    }
    }
    public void setFrequency(int desiredFrequency) {
        if (desiredFrequency > 9) {
            return;
        }
        if (desiredFrequency < 0) {
            return;
        }
        currentFrequency = desiredFrequency;
    }

    public void setVolumeToMax() {
        currentVolume = 100;
    }

    public void volumeIncrease() {
    if (currentVolume == 100){
        return;
    }
    else currentVolume++;
    }

    public void volumeDecrease() {
        if (currentVolume == 0) {
            return;
        }
        else currentVolume = currentVolume - 1;
    }
}