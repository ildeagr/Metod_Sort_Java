package Type_sorts;

import java.util.ArrayList;
import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {

	ArrayList<Integer> arraynumbers = new ArrayList<>();
	int[] arraynum = new int[7];
	
	arraynum[0] = 5;
	arraynum[1] = 10;
	arraynum[2] = 3;
	arraynum[3] = 4;
	arraynum[4] = 8;
	arraynum[5] = 6;
	arraynum[6] = 6;
	
	arraynumbers.add(5);
	arraynumbers.add(10);
	arraynumbers.add(3);
	arraynumbers.add(4);
	arraynumbers.add(8);
	arraynumbers.add(6);
	arraynumbers.add(6);
	arraynumbers.add(10);
	
	
	for (int i = 0; i < arraynum.length; i++) {
		System.out.print(arraynum[i] + " ,");
	}
	System.out.println(arraynumbers);
	
	
	
	int[] SOL1 = Bubblesort(arraynum);
	ArrayList<Integer> SOL2 = BubblesortList(arraynumbers);
	
	for (int i = 0; i < SOL1.length; i++) {
		System.out.print(SOL1[i] + " ,");
	}
	System.out.println(SOL2);
	
	}
	

	private static int[] Bubblesort(int[] num ) {
		int numLow =num[0];
		int numHigh =num[1];
		int j = num.length-1;
		
		while(j>1){
			for(int i=0; i<j; i++) {
				if(num[i]>num[i+1]) {
					num[i]=numHigh;
					num[i+1]=numLow;
					
					if((i+2)<= j) {
						numHigh=num[i+2];
					}
				}
				else {
					numLow=num[i+1];
					
					if((i+2)<= j) {
						numHigh=num[i+2];
					}
				}
			}
			j--;
			numLow =num[0];
			numHigh =num[1];
		}
		
		return num;
	}
	
	private static ArrayList<Integer> BubblesortList(ArrayList<Integer> num){
		int numLow =num.get(0);
		int numHigh =num.get(1);
		int j = num.size()-1;
		
		while(j>1){
			for(int i=0; i<j; i++) {
				if(num.get(i)>num.get(i+1)) {
					num.set(i, numHigh);
					num.set(i+1,numLow);
					
					if((i+2)<= j) {
						numHigh=num.get(i+2);
					}
				}
				else {
					numLow=num.get(i+1);
					
					if((i+2)<= j) {
						numHigh=num.get(i+2);
					}
				}
			}
			j--;
			numLow =num.get(0);
			numHigh =num.get(1);
		}
		
		return num;
	}
}
