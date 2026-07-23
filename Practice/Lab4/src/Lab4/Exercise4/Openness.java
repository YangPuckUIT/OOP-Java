package Lab4.Exercise4;

// trait O

public class Openness extends Trait {

    public Openness(int score) {
        super(score);
    }

    @Override
    void describe() {

        if (getLevel().equals("High")) {
            System.out.println(score +
                    " Openness (O): High - Curious, creative, likes new ideas");
        }

        else if (getLevel().equals("Low")) {
            System.out.println(score +
                    " Openness (O): Low - Conservative, dislikes changes");
        }

        else {
            System.out.println(score +
                    " Openness (O): No specific conclusion");
        }
    }
}