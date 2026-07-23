package Lab4.Exercise4;

// abstract trait cha
// mấy trait khác extends từ đây

public abstract class Trait {

    protected int score;

    public Trait(int score) {
        this.score = score;
    }

    // high low hay bình thường
    public String getLevel() {

        if (score >= 70) {
            return "High";
        }

        if (score <= 30) {
            return "Low";
        }

        return "Normal";
    }

    abstract void describe();
}