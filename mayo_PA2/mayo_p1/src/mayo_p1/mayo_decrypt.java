package mayo_p1;
import java.util.Scanner;
public class mayo_decrypt {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int[] encryption = new int[4];
		int i;
		
		System.out.println("Please enter your 4-digit encrypted number.");
			
		//reading values
		for (i = 0; i < encryption.length; ++i) {
			encryption[i] = scnr.nextInt();
			}
		
		//switching back
		int temp = encryption[2];
		encryption[2] = encryption[0];
		encryption[0] = temp;
			
		temp = encryption[3];
		encryption[3] = encryption[1];
		encryption[1] = temp;	
		
		//reverting values
		encryption[0] = (encryption[0] + 3) % 10;
		encryption[1] = (encryption[1] + 3) % 10;
		encryption[2] = (encryption[2] + 3) % 10;
		encryption[3] = (encryption[3] + 3) % 10;
			
		//printing original values
		System.out.print("Decrypted value: ");	
		for (i = 0; i < encryption.length; ++i) {
			System.out.print(encryption[i]);	
			}
	}
}
