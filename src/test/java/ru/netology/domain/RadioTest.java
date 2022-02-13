package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void shouldUseRadioStation() {
        Radio radio = new Radio(5);
        assertEquals(4, radio.getNumberOfRadioStation());

    }

    @Test
    public void numberOfRadioStation() {

        Radio radio1 = new Radio();
        assertEquals(10, radio1.getNumberOfRadioStation());
    }


    @Test
    public void getCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);

        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void setMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setMinStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void next() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void next1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void next2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void prev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.prev();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void prev1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);
        radio.prev();
        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void prev2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void getCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);


    }

    @Test
    public void increaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void reductionVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reductionVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void reductionVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.reductionVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void reductionVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(60);
        radio.reductionVolume();
        int expected = 59;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
}