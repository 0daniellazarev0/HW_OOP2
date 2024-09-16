import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolumeByOne() {
    Radio radio = new Radio();
    radio.volumeIncrease();
    int actual = radio.getCurrentVolume();
    int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeByOne() {
        Radio radio = new Radio();
        radio.setVolumeToMax();
        radio.volumeDecrease();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDesiredFrequency() {
        Radio radio = new Radio();
        radio.setFrequency(7);
        int actual = 7;
        int expected = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSkipToNextFrequency() {
        Radio radio = new Radio();
        radio.setFrequency(7);
        radio.nextFrequency();
        int expected = 8;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSkipToPreviousFrequency() {
        Radio radio = new Radio();
        radio.setFrequency(8);
        radio.previousFrequency();
        int expected = 7;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSkipToFrequencyZeroIfCurrentlyTunedIntoNine() {
        Radio radio = new Radio();
        radio.setFrequency(9);
        radio.nextFrequency();
        int actual = 0;
        int expected = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSkipToFrequencyNineIfCurrentlyTunedIntoZero() {
        Radio radio = new Radio();
        radio.setFrequency(0);
        radio.previousFrequency();
        int actual = 9;
        int expected = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeAnyFurtherIfCurrentlyAtZero() {
        Radio radio = new Radio();
        radio.volumeDecrease();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAnyFurtherIfCurrentlyAtHundred() {
        Radio radio = new Radio();
        radio.setVolumeToMax();
        radio.volumeIncrease();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTuneIntoFrequenciesAboveNine() {
        Radio radio = new Radio();
        radio.setFrequency(100);
        int actual = 0;
        int expected = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTuneIntoFrequenciesBelowZero() {
        Radio radio = new Radio();
        radio.setFrequency(-10);
        int actual = 0;
        int expected = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

}
