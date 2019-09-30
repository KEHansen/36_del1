package test;

import dice.Dice; // Vi starter med at importere vores klasse dice.

public class Test {

    public static void main(String[] args) {
        Dice d1 = new Dice(), d2 = new Dice();
        // Vi definerer variablerne for summen mellem 2 og 12,....
        double antalPar = 0;
        double sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, sum7 = 0;
        double sum8 = 0, sum9 = 0, sum10 = 0, sum11 = 0, sum12 = 0;
        int sum = 0, t1 = 0, t2 = 0;
        int i = 0;
        int antalTest = 10000;

        while (i<antalTest) {
            t1 = d1.roll();
            t2 = d2.roll();
            sum=t1+t2;
            switch (sum) {
                case 2: sum2++; break;
                case 3: sum3++; break;
                case 4: sum4++; break;
                case 5: sum5++; break;
                case 6: sum6++; break;
                case 7: sum7++; break;
                case 8: sum8++; break;
                case 9: sum9++; break;
                case 10: sum10++; break;
                case 11: sum11++; break;
                case 12: sum12++; break;


            }

            if (t1==t2)
                antalPar++;

            i++;

        }

        System.out.println("Andel af summen 2: " + sum2/antalTest*100 + "%");
        System.out.println("Andel af summen 3: " + sum3/antalTest*100 + "%");
        System.out.println("Andel af summen 4: " + sum4/antalTest*100 + "%");
        System.out.println("Andel af summen 5: " + sum5/antalTest*100 + "%");
        System.out.println("Andel af summen 6: " + sum6/antalTest*100 + "%");
        System.out.println("Andel af summen 7: " + sum7/antalTest*100 + "%");
        System.out.println("Andel af summen 8: " + sum8/antalTest*100 + "%");
        System.out.println("Andel af summen 9: " + sum9/antalTest*100 + "%");
        System.out.println("Andel af summen 10: " + sum10/antalTest*100 + "%");
        System.out.println("Andel af summen 11: " + sum11/antalTest*100 + "%");
        System.out.println("Andel af summen 12: " + sum12/antalTest*100 + "%");

        System.out.println("Andel af par: " + antalPar/antalTest*100 + "%");

    }
}
