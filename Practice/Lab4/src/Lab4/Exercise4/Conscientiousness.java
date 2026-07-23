package Lab4.Exercise4;

// trait C

public class Conscientiousness extends Trait {

    public Conscientiousness(int score) {
        super(score);
    }

    @Override
    void describe() {

        if (getLevel().equals("High")) {
            System.out.println(score +
                    " Conscientiousness (C): High - Hardworking and disciplined");
        }

        else if (getLevel().equals("Low")) {
            System.out.println(score +
                    " Conscientiousness (C): Low - Careless and irresponsible");
        }

        else {
            System.out.println(score +
                    " Conscientiousness (C): No specific conclusion");
        }
    }
}