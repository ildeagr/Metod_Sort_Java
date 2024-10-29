package Type_sorts;

import java.util.Arrays;

public class Merge {

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
		
		int[] SOL =divList(arraynum);
		System.out.println("Sorted array: " + Arrays.toString(SOL));
	}

	private static int[] divList(int[] arraynum) {
		if(arraynum.length <=1) {
			return arraynum;
		}
		
		int mid = arraynum.length/2;
		
		int[] midleft = new int[mid];
		int[] midright = new int[arraynum.length-mid];
		

		
		for(int i=0 ;i<mid;i++) {
			midleft[i]=arraynum[i];
		}
				
		for(int i=0 ;i<arraynum.length-mid;i++) {
			midright[i]=arraynum[i+mid];
		}
		
		
		int[] left = divList(midleft);
		int[] right = divList(midright);
		
		return sortList(left, right);
	}
	
	private static int[] sortList(int[] left, int[] right) {
		int[] sortnum =new int[left.length + right.length];
		int i=0, j=0, z=0;
		
		while (i < left.length && j < right.length) {
			if (left[i] > right[j]) {
				sortnum[z++] = right[j++];

			} else {
				sortnum[z++] = left[i++];
			}
		}
	
		    while (i < left.length) {
		    	sortnum[z++] = left[i++];
		    }
	
		    while (j < right.length) {
		    	sortnum[z++] = right[j++];
		    }
		return sortnum;
	}
}
