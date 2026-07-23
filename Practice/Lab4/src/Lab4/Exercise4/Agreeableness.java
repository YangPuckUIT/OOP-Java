package Lab4.Exercise4;

// trait A

public class Agreeableness extends Trait {

    public Agreeableness(int score) {
        super(score);
    }

    @Override
    void describe() {

        if (getLevel().equals("High")) {
            System.out.println(score +
                    " Agreeableness (A): High - Friendly and cooperative");
        }

        else if (getLevel().equals("Low")) {
            System.out.println(score +
                    " Agreeableness (A): Low - Competitive and selfish");
        }

        else {
            System.out.println(score +
                    " Agreeableness (A): No specific conclusion");
        }
    }
}