package Lab3.Exercise4;

public class FamousSinger extends Singer {  // thêm 1 thuoocj tính vs overrride
    private int gameShows;

    public FamousSinger(String fullName, int years, int albumsSold, int performances, int gameShows) {
        super(fullName, years, albumsSold, performances);
        this.gameShows = gameShows;
    }

    // override tính lương
    @Override
    public double calculateSalary() {
        return 5000000 + 500000*years + 1200*albumsSold + 500000*performances + 500000*gameShows;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Game shows: " + gameShows);
        System.out.println("Type: Famous Singer");
        System.out.println("Salary: " + calculateSalary());
    }
}