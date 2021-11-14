package preparations;
import java.util.*;
public class CommonItemsInArrays {
	
	public int[] f(int[] first, int[] second) {
		int[] commons = null;
		try {
		 for(int i=0; i<first.length; i++) {
			 for(int j=0; j<second.length; j++) {
				 if(first[i] == second[j]) {
					 commons = addItem(commons, first[i]);				 }
//				     break;
			 }
		 }
		 return commons;
		}catch(NullPointerException e) {
			return commons;
		}
		
	}
	
	static int[] addItem(int[] a, int e) {
		a = Arrays.copyOf(a, a.length+1);
		a[a.length - 1] = e;
		return a;
	 }
	
	public static void main(String[] args) {
		CommonItemsInArrays obj = new CommonItemsInArrays();
		int [] arr1 = null;
		int [] arr2 = {1, 2, 3};
		int [] commonItemArr = obj.f(arr1, arr2);
		System.out.println("The items common to 2 arrays are "+Arrays.toString(commonItemArr)+".");

	}

}
