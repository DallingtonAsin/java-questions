package preparations;

import java.util.*;

public class CategorizeArr {
	
	public int[] changeOrder(int[] num) {
		
		int posCount = 0, negCount = 0;
		for(int a: num) {
			if(a >= 0) {
				++posCount;
			}else {
				++negCount;
			}
		}
		int[] positives = new int[posCount];
		int[] negatives = new int[negCount];
	    int x=0, y=0;
		for(int n: num) {
			if(n >= 0) {
			 positives[x++] = n;
			}else {
			 negatives[y++] = n;
			}
		}
		
		int[] newArr = new int[num.length];
		int count = 0;
		for(int i=0; i<positives.length; i++) {
			newArr[i] = positives[i];
			count++;
		}
		
		for(int k=0; k<negatives.length; k++) {
			newArr[count++] = negatives[k];
		}
		
		return newArr;
	}
	

	public static void main(String[] args) {
		CategorizeArr obj = new CategorizeArr();
		int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
		int[] newArr = obj.changeOrder(arr);
		System.out.println("The changed array of "+Arrays.toString(arr)+" is "+Arrays.toString(newArr));

		int[] arr1 = {-5, 7, -3, -4, 9, 10, -1, 11};
		int[] newArr1 = obj.changeOrder(arr1);
		System.out.println("The changed array of "+Arrays.toString(arr1)+" is "+Arrays.toString(newArr1));

	
	
	}

}
