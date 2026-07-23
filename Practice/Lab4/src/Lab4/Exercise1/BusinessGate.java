package Lab4.Exercise1;

// gate này cần money để qua

public class BusinessGate extends Gate {

    private int unitPrice;
    private int quantity;

    public BusinessGate(int unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    boolean passGate(Prince prince) {

        int totalMoney = unitPrice * quantity;

        // check đủ tiền ko
        if (prince.getMoney() >= totalMoney) {

            // qua gate thì bị trừ tiền
            prince.setMoney(prince.getMoney() - totalMoney);

            System.out.println("Pass Business Gate");
            return true;
        }
        else {
            System.out.println("Not enough money");
            return false;
        }
    }
}