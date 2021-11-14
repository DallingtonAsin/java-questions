package preparations;
import java.util.*;
public class KthSmallestInArr {
	
	int kthSmallest(int[] arr, int k) {
	    Arrays.sort(arr);
		return arr[k-1];
	}

	public static void main(String[] args) {
		KthSmallestInArr obj = new KthSmallestInArr();
		int[] num = {7, 10, 4, 3, 20, 15};
	    int k = 4;
	    int smallest = obj.kthSmallest(num, k);
	    System.out.println("The "+k+"th smallest number in array "+Arrays.toString(num)+" is "+smallest);
	}

}
