package Lab4.Exercise4;

// trait E

public class Extraversion extends Trait {

    public Extraversion(int score) {
        super(score);
    }

    @Override
    void describe() {

        if (getLevel().equals("High")) {
            System.out.println(score +
                    " Extraversion (E): High - Sociable and energetic");
        }

        else if (getLevel().equals("Low")) {
            System.out.println(score +
                    " Extraversion (E): Low - Quiet and reserved");
        }

        else {
            System.out.println(score +
                    " Extraversion (E): No specific conclusion");
        }
    }
}