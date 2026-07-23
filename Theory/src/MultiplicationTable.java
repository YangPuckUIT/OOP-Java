// MultiplicationTable.java

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\t\tMultiplication Table");
        for (int i = 1; i < 10; i++)
        {
            System.out.print("\t" + i); // 1 to 9 (Row)
        }
        System.out.println();   // line break

        System.out.println("---------------------------------------");

        for (int i = 1; i < 10; i++)
        {
            System.out.print(i + " |"); // 1 to 9 (Column)
            for (int j = 1; j < 10; j++)
            {
                System.out.print("\t" + i*j);
            }
            System.out.println();   // line break
        }


    }
}
