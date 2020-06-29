package com.company;

public class Main {
    enum Season {
        WINTER(5), SPRING(10), SUMMER(15), FALL(20);


        private int value;

        Season(int value) {
            this.value = value;
        }

        public static void main(String[] args) {

            for (Season season : Season.values()) {
                System.out.println(season + ":" + season.value);
            }

        }
    }

}
