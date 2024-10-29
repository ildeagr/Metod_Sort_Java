package Type_sorts;

public class MergeSort {
public static void mergeSort(int[] arr){
    	
    	mergeSort(arr, 0, arr.length-1);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
    	
    	
    	int[] midleft = new int[mid]; //n1
		int[] midright = new int[arr.length-mid];//n2
		
		for(int i=0 ;i<mid;i++) {
			midleft[i]=arr[i];
		}
				
		for(int i=0 ;i<arr.length-mid;i++) {
			midright[i]=arr[i+mid];
		}
		
    	
		int i=0, j=0, z=0;
		
		while (i < mid && j < (arr.length-mid)) {
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
	    	int mid = (left + right)/2;
	    	
	    	mergeSort(arr, left, mid);
	        mergeSort(arr, mid+1, right);
	    	
	        merge(arr, left, mid, right);
    	}
    }
}

