package test;

import dice.Dice;

public class Test {

    public static void main(String[] args) {
        Dice d1 = new Dice(), d2 = new Dice();
        int antalPar = 0;
        int sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, sum7 = 0;
        int sum8 = 0, sum9 = 0, sum10 = 0, sum11 = 0, sum12 = 0;
        int s = 0;
        int i = 0;
        while (i<1000) {
            s = d1.roll() + d2.roll();
            switch (s) {
                case 2: sum2++;
            }

            i++;
        }




    }
}
