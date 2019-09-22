package mayo_p1;

import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] data = new int [4];
		int temp;
		
		System.out.println("Enter 4-digit password: ");
		
		data[0] = scnr.nextInt();
		data[1] = scnr.nextInt();
		data[2] = scnr.nextInt();
		data[3] = scnr.nextInt();
		
		data[0] = (data[0] + 7) % 10;
		data[1] = (data[1] + 7) % 10;
		data[2] = (data[2] + 7) % 10;
		data[3] = (data[3] + 7) % 10;
		
		//swapping
		
		temp = data[0];
		data[0] = data[2];
		data[2] = temp;
		
		temp = data[1];
		data[1] = data[3];
		data[3] = temp;
		
		System.out.print("Encrypted data: ");
		
		for(int i = 0; i < 4; ++i) {
			System.out.print(data[i]);
		}
		
		

	}

}
