package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        int expected = 8;
        int actual = radio.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationBeyondTheMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 0;
        int actual = radio.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(3);

        int expected = 2;
        int actual = radio.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousRadioStationBeyondTheMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 9;
        int actual = radio.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOnePoint() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);

        int expected = 4;
        int actual = radio.increaseVolumeByOnePoint();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.increaseVolumeByOnePoint();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBeyondMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.increaseVolumeByOnePoint();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducingVolumeByOnePoint() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        int expected = 6;
        int actual = radio.reducingVolumeByOnePoint();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducingVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.reducingVolumeByOnePoint();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducingVolumeBeyondMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.reducingVolumeByOnePoint();

        Assertions.assertEquals(expected, actual);
    }
}
