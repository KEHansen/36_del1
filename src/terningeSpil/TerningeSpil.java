package terningeSpil;

import java.util.Scanner;
import dice.Dice;

public class TerningeSpil {

    // Her indføres scanner, strenge, heltal og terninger til spillet //
    public static Scanner in = new Scanner(System.in);
    public static String s1, s2;
    public static int slag1, slag2, tæller1 = 0, tæller2 = 0;
    public static Dice d1 = new Dice();
    public static Dice d2 = new Dice();
    public static boolean gameOn = true;

    public static Boolean WHAT = false;

    public static void main(String[] args) {

        // Dette er while løkken, hvor i spillet kører //;
        System.out.println("Tryk 'Enter' for at slå med terningerne.");

        while (gameOn == true) {

            spiller1();

            spiller2();

        }

        System.out.println("Spillet er slut");

    }

    public static void spiller1() {
        // Spiller 1 //
        System.out.println("Spiller 1s tur.");
        s1 = in.nextLine();
        slag1 = d1.roll();
        slag2 = d2.roll();

        if (tæller1 > 40 && slag1 == slag2 && slag1 + slag2 != 2) {
            System.out.println("Spiller 1 slog to " + slag1 + "'ere har vundet spillet.");
            gameOn = false;
        }

        if (slag1 + slag2 == 2) {
            tæller1 = 0;
            System.out.println("Spiller 1 slog to 1'ere og mistede alle sine point.");
        } else {
            tæller1 = tæller1 + slag1 + slag2;
            System.out.println("Spiller 1 slog en " + slag1 + "'er og en " + slag2 + "'er og har nu " + tæller1 + " point.");
        }

        if (slag1 + slag2 == 12) {
            System.out.println("Spiller 1 slog to 6'ere og må slå igen.");
            s1 = in.nextLine();
            slag1 = d1.roll();
            slag2 = d2.roll();
            tæller1 = tæller1 + slag1 + slag2;
            System.out.println("Spiller 1 slog en " + slag1 + "'er og en " + slag2 + "'er og har nu " + tæller1 + " point.");
        }
    }

    public static void spiller2() {
        // Spiller 2 //
        System.out.println("Spiller 2s tur.");
        s2 = in.nextLine();
        slag1 = d1.roll();
        slag2 = d2.roll();

        if (tæller2 > 40 && slag1 == slag2 && slag1 + slag2 != 2) {
            System.out.println("Spiller 2 slog to " + slag1 + "'ere har vundet spillet.");
            gameOn = false;
        }

        if (slag1 + slag2 == 2) {
            tæller2 = 0;
            System.out.println("Spiller 2 slog to 1'ere og mistede alle sine point.");
        } else {
            tæller2 = tæller2 + slag1 + slag2;
            System.out.println("Spiller 2 slog en " + slag1 + "'er og en " + slag2 + "'er og har nu " + tæller2 + " point.");
        }

        if (slag1 + slag2 == 12) {
            System.out.println("Spiller 2 slog to 6'ere og må slå igen.");
            s2 = in.nextLine();
            slag1 = d1.roll();
            slag2 = d2.roll();
            tæller2 = tæller2 + slag1 + slag2;
            System.out.println("Spiller 2 slog en " + slag1 + "'er og en " + slag2 + "'er og har nu " + tæller2 + " point.");
        }
    }

}




