package app;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int totalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];

            System.out.println((i + 1)+ ") Num is " + numbers[i] + ", sum is " + totalSum);

        }
        System.out.println("Sum of numbers is " + totalSum);
    }

}
