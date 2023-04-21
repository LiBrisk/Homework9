import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void currentStationBetweenMinMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationBetweenMinMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-4);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationBetweenMaxMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(14);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationBetweenLimitValues1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationBetweenLimitValues2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationBetweenLimitValues3() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationBetweenLimitValues4() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationBetweenLimitValues5() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationBetweenLimitValues6() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeBetweenMinMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int actual = radio.getCurrentVolume();
        int expected = 50;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeBetweenMinMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-50);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeBetweenMaxMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeBetweenLimitValues1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeBetweenLimitValues2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeBetweenLimitValues3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeBetweenLimitValues4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeBetweenLimitValues5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeBetweenLimitValues6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationMidle() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationLimitValues1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationLimitValues2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationLimitValues3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationLimitValues4() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationMidelPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationLimitValuesPrev1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationLimitValuesPrev2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationLimitValuesPrev3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationLimitValuesPrev4() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeMidle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.changeVolumePlus();
        int actual = radio.getCurrentVolume();
        int expected = 51;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeLimitValuesPlus1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.changeVolumePlus();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeLimitValuesPlus2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.changeVolumePlus();
        int actual = radio.getCurrentVolume();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeLimitValuesPlus3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.changeVolumePlus();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeLimitValuesPlus4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.changeVolumePlus();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeMidleMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.changeVolumeMinus();
        int actual = radio.getCurrentVolume();
        int expected = 49;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeLimitValuesMinus1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.changeVolumeMinus();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeLimitValuesMinus2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.changeVolumeMinus();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeLimitValuesMinus3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.changeVolumeMinus();
        int actual = radio.getCurrentVolume();
        int expected = 98;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeLimitValuesMinus4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.changeVolumeMinus();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationsCount() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(18);
        int actual = radio.getCurrentStation();
        int expected = 18;
        Assertions.assertEquals(expected, actual);
    }


}
