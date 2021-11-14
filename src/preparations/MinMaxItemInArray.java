package preparations;

import java.util.Arrays;

public class MinMaxItemInArray {
	
	public int[] findMinMax(int[] num) {
		int min = num[0], max = 0;
		for(int i=0; i<num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
			if(num[i] < min) {
				min = num[i];
			}
		}
		int[] result = {min, max};
		return result;
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 345, 234, 21, 56789};
		MinMaxItemInArray obj = new MinMaxItemInArray();
		int[] res = obj.findMinMax(arr);
		int min = res[0];
		int max = res[1];
		System.out.println("The minimum and maximum values in array "+Arrays.toString(arr)+" are "+min+" and "+max+" respectively");
		
				
		

	}

}
