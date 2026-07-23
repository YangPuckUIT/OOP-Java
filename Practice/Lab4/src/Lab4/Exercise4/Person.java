package Lab4.Exercise4;

// class lưu info person

public class Person {

    private String name;

    private Openness openness;
    private Conscientiousness conscientiousness;
    private Extraversion extraversion;
    private Agreeableness agreeableness;
    private Neuroticism neuroticism;

    public Person(String name,
                  Openness openness,
                  Conscientiousness conscientiousness,
                  Extraversion extraversion,
                  Agreeableness agreeableness,
                  Neuroticism neuroticism) {

        this.name = name;
        this.openness = openness;
        this.conscientiousness = conscientiousness;
        this.extraversion = extraversion;
        this.agreeableness = agreeableness;
        this.neuroticism = neuroticism;
    }

    public String getName() {
        return name;
    }

    public Openness getOpenness() {
        return openness;
    }

    public Conscientiousness getConscientiousness() {
        return conscientiousness;
    }

    public Extraversion getExtraversion() {
        return extraversion;
    }

    public Agreeableness getAgreeableness() {
        return agreeableness;
    }

    public Neuroticism getNeuroticism() {
        return neuroticism;
    }

    // in personality
    public void showPersonality() {

        openness.describe();
        conscientiousness.describe();
        extraversion.describe();
        agreeableness.describe();
        neuroticism.describe();
    }

    // check risk theo đề
    public boolean isHighRisk() {

        // low C
        boolean riskB =
                conscientiousness.getLevel().equals("Low");

        // high N
        boolean riskC =
                neuroticism.getLevel().equals("High");

        // low E + high N
        boolean riskD =
                extraversion.getLevel().equals("Low")
                        &&
                        neuroticism.getLevel().equals("High");

        return riskB || riskC || riskD;
    }
}