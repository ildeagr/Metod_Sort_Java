package Type_sorts;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		/*int[] arr = new int[9];
		
		arr[0] = -5;
		arr[1] = 1;
		arr[2] = 3;
		arr[3] = 7;
		arr[4] = -8;
		arr[5] = 1;
		arr[6] = 300;
		arr[7] = -12;
		arr[8] = 4;
		//arr[9] = 9;
		*/
		
		int max = 1000;
        int min = -1000;
        int length = 133701;

        int arr[] = new int[length]; 
        Random rand = new Random();

        for (int i = 0; i < length; i ++){
            arr[i] = (int)Math.floor(Math.random() * (max - min + 1) + min);
        }
		
		//mergeSort(arr);
		quickSort(arr);
		System.out.println("Sorted array: " + Arrays.toString(arr));

	}
	
	public static void mergeSort(int[] arr){
    	
    	mergeSort(arr, 0, (arr.length-1));
    	
    }

    public static void merge(int[] arr, int left, int mid, int right) {
    	int low = mid - left + 1;
    	int high = right - mid;
    	
    	
    	int[] midleft = new int[low];
		int[] midright = new int[high];
		
		for(int i=0 ;i<low;i++) {
			midleft[i]=arr[left + i];
		}
				
		for(int i=0 ;i<high;i++) {
			midright[i]=arr[i+mid+1];
		}
		
    	
		int i=0, j=0, z=left;
		
		while (i < low && j < high) {
			if (midleft[i] > midright[j]) {
				arr[z++] = midright[j++];

			} else {
				arr[z++] = midleft[i++];
			}
		}
	
		    while (i < midleft.length) {
		    	arr[z++] = midleft[i++];
		    }
	
		    while (j < midright.length) {
		    	arr[z++] = midright[j++];
		    }
    }

    public static void mergeSort(int[] arr, int left, int right) {
    	if(left < right){
    		System.out.println(right + " " + left);
	    	int mid = (left + right)/2;
	    	
	    	mergeSort(arr, left, mid);
	        mergeSort(arr, mid+1, right);
	    	
	       merge(arr, left, mid, right);
    	}
    }
    
    public static void quickSort(int[] arr){
    	quickSort(arr, 0, arr.length-1);
    }

    public static void quickSort(int[] arr, int low, int high){
    	if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
    	int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, (i + 1), high);
        return i + 1;
    }

    public static void swap(int [] arr, int i, int j){
    	int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

