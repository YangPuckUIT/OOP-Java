package Lab4.Exercise1;

// gate này cần intelligence

public class AcademicGate extends Gate {

    private int requiredIQ;

    public AcademicGate(int requiredIQ) {
        this.requiredIQ = requiredIQ;
    }

    @Override
    boolean passGate(Prince prince) {

        // ko bị mất intelligence
        if (prince.getIntelligence() >= requiredIQ) {
            System.out.println("Pass Academic Gate");
            return true;
        }
        else {
            System.out.println("Not enough intelligence");
            return false;
        }
    }
}