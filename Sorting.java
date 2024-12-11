import java.util.Random;

public class Sorting2 {

    private int[] array; // Instance variable to hold the array

    // Constructor
    public Sorting2(int size) {
        array = new int[size]; // Initialize the array with the given size
        fillArrayWithRandomNumbers(); // Populate the array with random integers

        System.out.println("Original Array:");
        printArray();

        // Sort the array


        System.out.println("Sorted Array:");
        printArray();
    }

    // Method to fill the array with random integers
    private void fillArrayWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Random numbers between 0 and 99
        }
    }

    // Method to print the array
    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to sort the array using slection sort
    public void SelectionSort() {

        void insertionSort;(int Array[]  ) {
            for (int f = 1; f < Array.length; f++) {
                int k = Array[f];
                int w = f - 1;

                while (w >= 0 && Array[w] > k) {
                    Array[w + 1] = Array[w];
                    w = w - 1;


                }

        }
        }
    }


    // bubble sort method
    public void BubbleSort() {
        /*for (int r = 0; r < array.length - 1; r++) {

            for (int m = 0; m < array.length - r - 1; m++) {
                if (array[r] > array[r + 1]) {
*/

                }

            }




                // Main method
                public static void main (String[]args){
                    Sorting2 sorter = new Sorting2(10);

                }



