package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {


    // 1) Тест на установку текущей радиостанции в пределах допустимого диапазона:

    @Test
    public void shouldSetCurrentStationValidRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // 2) Тест на установку текущей радиостанции за пределами допустимого диапазона (больше 9):

    @Test
    public void shouldSetCurrentStationInvalidRangeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // 3) Тест на установку текущей радиостанции за пределами допустимого диапазона (меньше 0):

    @Test
    public void shouldSetCurrentStationInvalidRangeDecrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // 4) Тест на переключение на следующую радиостанцию в пределах допустимого диапазона:

    @Test
    public void shouldNextValidRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.next();

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // 5) Тест на переключение на следующую радиостанцию за пределами допустимого диапазона:

    @Test
    public void shouldNextAboveValidRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // 6) Тест на переключение на предыдущую радиостанцию в пределах допустимого диапазона:

    @Test
    public void shouldPrevWithinValidRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // 7) Тест на переключение на предыдущую радиостанцию за пределами допустимого диапазона:

    @Test
    public void shouldPrevBelowValidRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // 8) Тест на увеличение громкости в пределах допустимого диапазона:

    @Test
    public void shouldIncreaseVolumeWithinValidRange() {
        Radio radio = new Radio();
        radio.currentVolume = 50;
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    // 9) Тест на увеличение громкости за пределами допустимого диапазона:

    @Test
    public void shouldIncreaseVolumeAboveValidRange() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    // 10) Тест на уменьшение громкости в пределах допустимого диапазона:

    @Test
    public void shouldDecreaseVolumeWithinValidRange() {
        Radio radio = new Radio();
        radio.currentVolume = 50;
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    // 11) Тест на уменьшение громкости за пределами допустимого диапазона:

    @Test
    public void shouldDecreaseVolumeBelowValidRange() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
