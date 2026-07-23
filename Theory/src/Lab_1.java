import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
                            // Bài 1
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: "); // ko dùng println vì lúc nhập nó sẽ xuống dòng ko giống format đề
        int number1 = sc.nextInt();

        for (int i = 1; i <= number1; i++)
        {
            if (i % 2 == 0)
                System.out.println(i + " - Even");
            else
                System.out.println(i + " - Odd");
        }

                            // Bài 2
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = sc.nextInt();

        int largestNumber = firstNumber;

        if (secondNumber > largestNumber)
            largestNumber = secondNumber;

        if (thirdNumber > largestNumber) // dùng 'if' thay vì 'else if'. Vì nếu nó check 'if' ở trên xong thì sẽ không
            largestNumber = thirdNumber; // check 'else if' nữa. Nên phải dùng if để nó check cả second và third number
        System.out.println("The largest number is: " + largestNumber);

                            // Bài 3
        System.out.print("Enter a number: ");
        int number3 = sc.nextInt();
        sc.nextLine();              // dòn này để bỏ ký tự enter (\n) để string (bải 4) không bị lỗi
        int sumOfDigits = 0;

        for (int i = number3; i != 0; i /= 10)
        {
            sumOfDigits += (i % 10);
        }

        System.out.println("Sum of digits: " + sumOfDigits);

                            // bài 4
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        String reverse = "";
        for (int i = original.length()-1; i >= 0; i--) // độ dài của string -1 vì string cũng giống array nên length -1
        {
            reverse += original.charAt(i);
        }
        System.out.println("Reversed String: " + reverse);

                            // bài 5
        System.out.print("Enter a number: ");
        int number5 = sc.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number5 + " x " + i + " = " + number5*i);
        }

                            // bài 6
        int lengthOfArray = sc.nextInt();   // nhập độ dài array
        int[] array = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) // nhập các phần tử của mảng
        {
            array[i] = sc.nextInt();
        }

        int target = sc.nextInt();  // nhập số cần tìm

        int result = -1;

        for (int i = 0; i < lengthOfArray; i++) // dùng linear search cho dễ
        {
            if (array[i] == target)
            {
                result = i;
                break;
            }
        }
        System.out.println(result);

                            // Bài 7
        // Nhập số phần tử mảng 1
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
        }

        // Nhập số phần tử mảng 2
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++)
        {
            arr2[i] = sc.nextInt();
        }

        // Mảng kết quả
        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Trộn hai mảng
        while (i < n && j < m)
        {
            if (arr1[i] <= arr2[j])
            {
                merged[k] = arr1[i];
                i++;
            }
            else
            {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Thêm phần còn lại của mảng 1
        while (i < n)
        {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Thêm phần còn lại của mảng 2
        while (j < m)
        {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        // In mảng kết quả
        for (int x = 0; x < merged.length; x++)
        {
            System.out.print(merged[x] + " ");
        }


    }
}
