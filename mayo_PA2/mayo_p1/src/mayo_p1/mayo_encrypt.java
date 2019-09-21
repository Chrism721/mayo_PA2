package mayo_p1;
import java.util.Scanner;
public class mayo_encrypt {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int[] data = new int[4];
		int i;
		
		System.out.println("Please enter your 4-digit number.");
		
		//reading values
		for (i = 0; i < data.length; ++i) {
			data[i] = scnr.nextInt();
			}
		
		//changing values	
		data[0] = (data[0] + 7) % 10;
		data[1] = (data[1] + 7) % 10;
		data[2] = (data[2] + 7) % 10;
		data[3] = (data[3] + 7) % 10;
			
		//switching values
		int temp = data[0];
		data[0] = data[2];
		data[2] = temp;
			
		temp = data[1];
		data[1] = data[3];
		data[3] = temp;
			
		//printing
		System.out.print("Encypted value: ");
		for (i = 0; i < data.length; ++i) {
			System.out.print(data[i]);	
			}
	}

}
