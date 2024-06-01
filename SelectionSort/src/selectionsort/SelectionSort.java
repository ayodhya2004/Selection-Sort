package selectionsort;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

           
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            
            System.out.println("Iteration " + (i + 1) + ": " + java.util.Arrays.toString(array));
        }
    }

  
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Unsorted array: " + java.util.Arrays.toString(array));

        selectionSort(array);

        System.out.println("Sorted array: " + java.util.Arrays.toString(array));
    }
}
