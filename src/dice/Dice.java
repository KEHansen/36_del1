package dice;
 // dette er vores terning klasse, som indeholder nogen commandoer for vores virtuelle terning.
public class Dice {
    // her definere vi hvad MAX er for terningen
    private final int MAX = 6;
    // her siger vi at faceValue skal være en int værdi.
    private int faceValue;

    /* Vi definere vores terninger at værdien skal være et tal fra 1 til 6.
    * der sker ved at vi siger +1 af (math.random() * MAX) som ellers vil være fra 0-5 */
    public Dice() {
        faceValue = (int) (Math.random() * MAX) + 1;
    }

    /* her definere vi vores terningskast. dvs. hvis man skriver d1.roll så svare det til at kaster terning 1.
    Hvad koden så består af er at den skal retunere en værdi fra kastet fra 1 til 6 */
    public int roll() {
        faceValue = (int) (Math.random() * MAX) + 1;
        return faceValue;
    }
}

