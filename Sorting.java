import java.util.Random;

public class Sorting {

    private int[] array; // Instance variable to hold the array

    // Constructor
    public Sorting(int size) {
        array = new int[size]; // Initialize the array with the given size
        fillArrayWithRandomNumbers(); // Populate the array with random integers

        System.out.println("Original Array:");
        printArray();

        // Sort the array
        BubbleSort();

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

        for (int n = 0; n < array.length - 1; n++) { //0 to 8

            int minIndex = n;

            for (int i = n; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }

            int temp = array[n];
            array[n] = array[minIndex];
            array[minIndex] = temp;

        }
    }

    // bubble sort method
    public void BubbleSort() {
        for (int r = 0; r < array.length - 1; r++) {

            for (int m = 0; m < array.length - r - 1; m++) {
                if (array[r] > array[r + 1]) {


                }

            }

        }

        public void instertSort() {
            for (int j = 1; j < array.length; j++) {

                        int key = array[k];
                        int i = k-1;
                        while ( (i > -1) && ( array [i] > key ) ) {
                            array [i+1] = array [i];
                            i--;
                        }
                        array[i+1] = key;
                    }
                }

                }
            }


                // Main method
                public static void main (String[]args){
                    Sorting sorter = new Sorting(10);

                }



