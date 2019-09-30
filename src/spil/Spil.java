package spil;

import java.util.Scanner; //importerer java.util.Scanner som bruges til at opdage når brugeren har trykkede på enter
import dice.Dice; //importerer dice klassen

public class Spil {

    // Her indføres scanner, strenge, heltal og terninger til spillet
    public static Scanner in = new Scanner(System.in); //laver et scanner der hedder in
    public static int slag1, slag2, tæller1 = 0, tæller2 = 0; //slag1 og slag2 bruges til at gemme information om de sidste to slag, tæller 1 og 2 tæller summen et et spillers point
    public static Dice d1 = new Dice(); //Laver et objekt ved navn d1 ud fra dice klassen
    public static Dice d2 = new Dice(); //Laver et objekt ved navn d2 ud fra dice klassen
    public static boolean gameOn = true; //Boolean som ændrer sig hvis et spiller har vundet spillet, hvis det er falk, ville spillet slutte.

    // Her er main metoden som køres når programmet køres
    public static void main(String[] args) {

        System.out.println("Tryk 'Enter' for at slå med terningerne.");

        // Dette er while løkken, hvor i spillet kører
        while (gameOn == true) {
            //Kører spiller1(); funktionen,  dette slår terning for spiller 1 og bestemmer om der er to ettere to seksere osv. Det holder også styr på spillerens tæller
            spiller1();
            //Gør det samme for spiller 2, der er brugt et andet tæller så spilleren kan have sin egen tæller.
            spiller2();

        }

        System.out.println("Spillet er slut");

    }


    // Spiller 1
    public static void spiller1() {
        // notifikation på at spiller 1 skal slå
        System.out.println("Spiller 1s tur.");
        //Venter på noget input før koden køres
        in.nextLine();
        //Slår med første terning ved at bruge roll funktionen i Dice klassen for både objektet d1 og d2
        slag1 = d1.roll();
        slag2 = d2.roll();

        //Undersøget om spiller 1 har over 40 point, hvis de har over 40 point, så undersøges der om de har slået to ens, og at de to ens ikke er to ettere. Hvis alt dette er sandt så slutter spillet
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
            in.nextLine(); //Venter på et input før koden kører videre
            slag1 = d1.roll();
            slag2 = d2.roll();
            if (slag1 + slag2 == 12) {
                System.out.println("Spiller 1 slog par 6 to gange i træk og vinder derfor spillet.");
                gameOn = false;
            } else {
            tæller1 = tæller1 + slag1 + slag2;
            System.out.println("Spiller 1 slog en " + slag1 + "'er og en " + slag2 + "'er og har nu " + tæller1 + " point.");
            }
        }
    }

    // Spiller 2 //
    public static void spiller2() {
        // notifikation på at spiller 2 skal slå
        System.out.println("Spiller 2s tur.");
        in.nextLine();
        slag1 = d1.roll();
        slag2 = d2.roll();

        /* dette er en if statement for hvis vi vinder,
           Det vil sige at hvis tælleren kommer over 40 og slag 1 og slag 2 er det sammme.
           MEN ikke er 2
           Så har spiller 2 vundet*/
        if (tæller2 > 40 && slag1 == slag2 && slag1 + slag2 != 2) {
            System.out.println("Spiller 2 slog to " + slag1 + "'ere har vundet spillet.");
            gameOn = false;
        }

        // hvis spiller 2 han slår 2, 1'ere vil den løbe igennem dette if statement som er:
        if (slag1 + slag2 == 2) {
            // her bliver tælleren reset:
            tæller2 = 0;
            // der bliver printet ud at han har mistet alle point:
            System.out.println("Spiller 2 slog to 1'ere og mistede alle sine point.");
        } else {

            // men hvis det så ikke er
            tæller2 = tæller2 + slag1 + slag2;
            System.out.println("Spiller 2 slog en " + slag1 + "'er og en " + slag2 + "'er og har nu " + tæller2 + " point.");
        }

        if (slag1 + slag2 == 12) {
            System.out.println("Spiller 2 slog to 6'ere og må slå igen.");
            in.nextLine(); //Venter på et input før koden kører videre
            slag1 = d1.roll();
            slag2 = d2.roll();
            if (slag1 + slag2 == 12) {
                System.out.println("Spiller 2 slog par 6 to gange i træk og vinder derfor spillet.");
                gameOn = false;
            } else {
                tæller2 = tæller2 + slag1 + slag2;
                System.out.println("Spiller 2 slog en " + slag1 + "'er og en " + slag2 + "'er og har nu " + tæller2 + " point.");
            }
        }
    }

}




