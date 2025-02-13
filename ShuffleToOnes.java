import java.util.Random;

public class ShuffleToOnes {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        int iterations = 0;

        // Populate the array with random integers between 1 and 10 (inclusive)
        fillArray(array, random);

        // Continue shuffling the array until all elements are 1
        while (!allOnes(array)) {
            fillArray(array, random); // Re-randomize the array
            iterations++;
        }

        // Output the result
        System.out.println("Array of all 1s achieved after " + iterations + " shuffles!");
        printArray(array);
    }

    // Method to fill the array with random integers between 1 and 10
    private static void fillArray(int[] array, Random random) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1; // Random number from 1 to 10
        }
    }

    // Method to check if all elements in the array are 1
    private static boolean allOnes(int[] array) {
        for (int num : array) {
            if (num != 1) {
                return false;
            }
        }
        return true;
    }

    // Method to print the array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
