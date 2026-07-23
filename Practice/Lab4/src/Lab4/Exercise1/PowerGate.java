package Lab4.Exercise1;

// gate này cần power để đánh warrior

public class PowerGate extends Gate {

    private int powerIndex;

    public PowerGate(int powerIndex) {
        this.powerIndex = powerIndex;
    }

    @Override
    boolean passGate(Prince prince) {

        // check đủ power ko
        if (prince.getPower() >= powerIndex) {

            // thắng xong bị mất power
            prince.setPower(prince.getPower() - powerIndex);

            System.out.println("Pass Power Gate");
            return true;
        }
        else {
            System.out.println("Not enough power");
            return false;
        }
    }
}