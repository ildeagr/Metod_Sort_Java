package Type_sorts;

import java.util.Arrays;

public class Quick {

	public static void main(String[] args) {
		int[] arraynum = new int[9];
		
		arraynum[0] = 5;
		arraynum[1] = 1;
		arraynum[2] = 3;
		arraynum[3] = 7;
		arraynum[4] = 8;
		arraynum[5] = 6;
		arraynum[6] = 10;
		arraynum[7] = 12;
		arraynum[8] = 1;
		
		System.out.println("Array unsorted: " + Arrays.toString(arraynum));
		
		quickSort(arraynum, 0, arraynum.length-1);
		System.out.println("Sorted array: " + Arrays.toString(arraynum));

	}

	private static void quickSort(int[] arraynum, int low, int high) {
		
		if (low < high) {
            int pivotIndex = comparacion(arraynum, low, high);
            quickSort(arraynum, low, pivotIndex - 1);
            quickSort(arraynum, pivotIndex + 1, high);
        }
	}
	
	public static int comparacion(int[] arraynum, int low, int high) {
        int pivot = arraynum[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arraynum[j] <= pivot) {
                i++;
                swap(arraynum, i, j);
            }
        }
        swap(arraynum, (i + 1), high);
        return i + 1;
    }
	
    public static void swap(int [] arr, int i, int j){
    	int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
