package Lab4.Exercise3;

// class này xử lý blood type luôn
// tại thấy làm enum hơi dài nên làm kiểu này cho dễ hiểu

public class BloodType {

    private String abo;
    private String rh;

    public BloodType(String abo, String rh) {
        this.abo = abo;
        this.rh = rh;
    }

    public String getAbo() {
        return abo;
    }

    public String getRh() {
        return rh;
    }

    // ví dụ A+
    public String getFullType() {
        return abo + rh;
    }

    // check child blood type hợp lệ ko
    public static boolean isValidChild(BloodType father,
                                       BloodType mother,
                                       BloodType child) {

        String f = father.getAbo();
        String m = mother.getAbo();
        String c = child.getAbo();

        // làm hơi thủ công tí cho dễ nhìn
        if (f.equals("A") && m.equals("A")) {
            return c.equals("A") || c.equals("O");
        }

        if (f.equals("A") && m.equals("B") ||
                f.equals("B") && m.equals("A")) {

            return c.equals("A") || c.equals("B")
                    || c.equals("AB") || c.equals("O");
        }

        if (f.equals("A") && m.equals("AB") ||
                f.equals("AB") && m.equals("A")) {

            return c.equals("A") || c.equals("B")
                    || c.equals("AB");
        }

        if (f.equals("A") && m.equals("O") ||
                f.equals("O") && m.equals("A")) {

            return c.equals("A") || c.equals("O");
        }

        if (f.equals("B") && m.equals("B")) {
            return c.equals("B") || c.equals("O");
        }

        if (f.equals("B") && m.equals("AB") ||
                f.equals("AB") && m.equals("B")) {

            return c.equals("A") || c.equals("B")
                    || c.equals("AB");
        }

        if (f.equals("B") && m.equals("O") ||
                f.equals("O") && m.equals("B")) {

            return c.equals("B") || c.equals("O");
        }

        if (f.equals("AB") && m.equals("AB")) {

            return c.equals("A") || c.equals("B")
                    || c.equals("AB");
        }

        if (f.equals("AB") && m.equals("O") ||
                f.equals("O") && m.equals("AB")) {

            return c.equals("A") || c.equals("B");
        }

        if (f.equals("O") && m.equals("O")) {
            return c.equals("O");
        }

        return false;
    }

    // check donate được ko
    public boolean canDonateTo(BloodType receiver) {

        String donor = this.getFullType();
        String receive = receiver.getFullType();

        // làm theo bảng đề cho
        if (donor.equals("O-")) {
            return true;
        }

        if (donor.equals("O+")) {
            return receive.equals("O+") ||
                    receive.equals("A+") ||
                    receive.equals("B+") ||
                    receive.equals("AB+");
        }

        if (donor.equals("A-")) {
            return receive.equals("A-") ||
                    receive.equals("A+") ||
                    receive.equals("AB-") ||
                    receive.equals("AB+");
        }

        if (donor.equals("A+")) {
            return receive.equals("A+") ||
                    receive.equals("AB+");
        }

        if (donor.equals("B-")) {
            return receive.equals("B-") ||
                    receive.equals("B+") ||
                    receive.equals("AB-") ||
                    receive.equals("AB+");
        }

        if (donor.equals("B+")) {
            return receive.equals("B+") ||
                    receive.equals("AB+");
        }

        if (donor.equals("AB-")) {
            return receive.equals("AB-") ||
                    receive.equals("AB+");
        }

        if (donor.equals("AB+")) {
            return receive.equals("AB+");
        }

        return false;
    }
}