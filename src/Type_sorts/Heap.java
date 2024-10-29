package Type_sorts;

import java.util.Arrays;

public class Heap {

    public static void main(String args[]) {
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
		
        heapSort(arraynum);
        System.out.println("Array: " + Arrays.toString(arraynum));
    }
    
    
    static void heapSort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0]; 
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    
	static void heapify(int arr[], int n, int i) {	 
		int largest = i; 

	        int l = 2 * i + 1; 
	        int r = 2 * i + 2;

	        if (l < n && arr[l] > arr[largest]) {
	            largest = l;
	        }

	        if (r < n && arr[r] > arr[largest]) {
	            largest = r;
	        }

	        if (largest != i) {
	            int temp = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = temp;
	            
	            heapify(arr, n, largest);
	        }
	    }
}

