public class MaxInArray {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] numbers = {12, 45, 7, 89, 23, 67};

        // Print the array
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Find the maximum element
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Output the result
        System.out.println("\nMaximum number in the array is: " + max);
    }
}
