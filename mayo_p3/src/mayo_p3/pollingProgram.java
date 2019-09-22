package mayo_p3;

import java.util.Scanner;

public class pollingProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] topics = { "Politics", "Environment", "Food       ", "Videogames", "Programming "};
		int[][] responses = new int[5][10];
		int[] avg = new int[5];
		int i, j;
		int p = -1;
		int r = 0;
		int sum = 0;
		String con;
		
		//poll intro
		System.out.println("Importance Poll");
		System.out.println("*************");
		
		System.out.println("Would you like to participate? Enter (yes/no).");
		con = scnr.next();
		p++;
		
		
		
		
		
		//poll
		while(con.indexOf("yes") != -1) {
			System.out.println("Rate from 1 (least important) to 10 (most important)");
			for(i = 0; i < topics.length; ++i) {
				System.out.print(topics[i] + ":");
				r = scnr.nextInt();
				r--;
				responses[i][r]++;
			}
			
			System.out.println("Would you like to participate again? Enter (yes/no).");
			con = scnr.next();
			System.out.println();
			p++;
		}
		
		System.out.println("Amount of people who took the poll: " + p);
		System.out.println();
		
		//average
		for(i = 0; i < topics.length; ++i) {
			int n = 0;
			for(j = 0; j < 10; ++j) {
				n++;
				sum = sum + (responses[i][j] * n); 	
			}
			avg[i] = sum / p;
			sum = 0;
		}	
		
		//max
		int max = 0;
		int temp = 0;
		int sum1 =0;
		for(i = 0; i < topics.length; ++i) {
			int n = 0;
			for(j = 0; j < 10; ++j) {
				n++;
				sum1 = sum1 + (responses[i][j] * n);
			}
			if(sum1 > max) {
					max = sum1;
					temp = i;
				}
			sum1 = 0;
		}
		System.out.println("The "+ topics[temp] + " topic has the most points with " + max + ".");
		System.out.println();
		
		//min
		int sum2 = 0;
		int min = 5 * p;
		int temp2 = 0;
		for(i = 0; i < topics.length; ++i) {
			int n = 0;
			for(j = 0; j < 10; ++j) {
				n++;
				sum2 = sum2 + (responses[i][j] * n);
			}
			if(sum2 < min) {
					min = sum2;
					temp2 = i;
				}
			sum2 = 0;
		}
		System.out.println("The "+ topics[temp2] + " topic has the least points with " + min + ".");
		System.out.println();
		
		//table
		System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAverage");
		System.out.println("\t\t---------------------------------------------------------------------------------------");
		for(i = 0; i < topics.length; ++i) {
			System.out.print(topics[i] + "\t");
			for(j = 0; j < 10; ++j) {
				System.out.print(responses[i][j] + "\t");
			}
			System.out.print(avg[i]);
			System.out.println();
			
		}
		
	}
}
