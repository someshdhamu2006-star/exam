
package com.example;

public class App {

    public int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException(
                "Array must not be null or empty"
            );
        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        App app = new App();
        int[] numbers = {10, 25, 7, 40, 15};

        System.out.println(
            "Maximum element: " + app.findMax(numbers)
        );
    }
}
