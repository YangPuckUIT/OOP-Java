package Lab4.Exercise4;

// trait N

public class Neuroticism extends Trait {

    public Neuroticism(int score) {
        super(score);
    }

    @Override
    void describe() {

        if (getLevel().equals("High")) {
            System.out.println(score +
                    " Neuroticism (N): High - Emotional unstable and stressed");
        }

        else if (getLevel().equals("Low")) {
            System.out.println(score +
                    " Neuroticism (N): Low - Calm and emotionally stable");
        }

        else {
            System.out.println(score +
                    " Neuroticism (N): No specific conclusion");
        }
    }
}