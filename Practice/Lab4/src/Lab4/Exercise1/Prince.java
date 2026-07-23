package Lab4.Exercise1;
    /*
    class này lưu thông tin của prince
    hiện tại mới dùng money thôi
    */
class Prince {
    private int money;
    private int intelligence;
    private int power;

    public Prince(int money, int intelligence, int power) {
        this.money = money;
        this.intelligence = intelligence;
        this.power = power;
    }
    // getter setter generate nhanh
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}