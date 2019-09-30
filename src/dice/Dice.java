package dice;

public class Dice {
    //
    private final int MAX = 6;
    private int faceValue;

    public Dice() {
        faceValue = (int) (Math.random() * MAX) + 1;
    }

    public int roll() {
        faceValue = (int) (Math.random() * MAX) + 1;
        return faceValue;
    }

    public void setFaceValue(int val) {
        if (val >= 1 && val <= 6)
            faceValue = val;
    }

    public String toString() {
        String result = "Øjne: " + faceValue;
        return result;
    }
}

