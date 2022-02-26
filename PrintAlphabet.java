package solutions;

import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
	
		/* Output Pattern: 
		A 
		B I 
		C J P 
		D K Q V 
		E L R W * 
		F M S X * * 
		G N T Y * * * 
		H O U Z * * * * 
		*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value to Generate pattern: ");
		int n=sc.nextInt(); // Input num - Get the number of row to generate a pattern
		int inc; // int Inc- increment pattern logic
		
		for(int i=1;i<=n;i++) {
			
			inc=i;
			
			for(int j=1;j<=i;j++) {
				if(inc<=26) System.out.print((char) ((char)inc+64)+" "); // Convert the int to char ASCII respective character 
				else System.out.print("*"+" ");				// Print '*' pattern exceeds more than 26 characters
				inc=inc+(n-j); 
			}
			
			System.out.println();
		}
	}

}
