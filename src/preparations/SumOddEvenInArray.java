package preparations;

import java.util.*;
public class SumOddEvenInArray {

    public int f(int[] a) {
        int X = 0;  // initialization for sum of odd numbers in an array
        int Y = 0; // initialization for sum of even numbers in an array
        for(int i = 0; i<a.length; i++) {
            if(a[i] % 2 == 1) {
                X+=a[i];
            }
            if(a[i] % 2 == 0) {
                Y+=a[i];
            }   
        }
        return X-Y;
    }

    public static void main(String[] args) {

    	SumOddEvenInArray obj = new SumOddEvenInArray();
        int [] A = {1};
        int [] B = {1, 2};
        int [] C = {1, 2, 3};
        int [] D = {1, 2, 3, 4};
        int [] E = {3, 3, 4, 4};
        int [] F = {3, 2, 3, 4};
        int [] G = {4, 1, 2, 3};
        int [] H = {1, 1};
        int [] I = {};

        // Printing results on the screen
        System.out.println("Result for array A "+Arrays.toString(A)+" is "+obj.f(A));
        System.out.println("Result for array B "+Arrays.toString(B)+" is "+obj.f(B));
        System.out.println("Result for array C "+Arrays.toString(C)+" is "+obj.f(C));
        System.out.println("Result for array D "+Arrays.toString(D)+" is "+obj.f(D));
        System.out.println("Result for array E "+Arrays.toString(E)+" is "+obj.f(E));
        System.out.println("Result for array F "+Arrays.toString(F)+" is "+obj.f(F));
        System.out.println("Result for array G "+Arrays.toString(G)+" is "+obj.f(G));
        System.out.println("Result for array H "+Arrays.toString(H)+" is "+obj.f(H));
        System.out.println("Result for array I "+Arrays.toString(I)+" is "+obj.f(I));

    }

}
