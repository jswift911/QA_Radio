package ru.netology;

import ru.netology.radio.Radio;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio(5);
        System.out.println(radio.getMaxStation());
    }
}