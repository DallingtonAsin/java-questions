package preparations;
import java.util.*;
public class ReverseInteger {
	
	public int f(int n) {
		int reverse = 0;
		while(n != 0) {
			   int remainder = n%10;
			   reverse = reverse*10 + remainder;
			   n = n/10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		ReverseInteger obj = new ReverseInteger();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to reverse:");
		int num = input.nextInt();
		int reverse = obj.f(num);	
		System.out.println("The reverse of number "+num+" is "+reverse);
        input.close();
	}

}
