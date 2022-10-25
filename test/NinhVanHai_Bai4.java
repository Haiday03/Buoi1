package test;

import java.util.Scanner;

public class NinhVanHai_Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		do {
			System.out.println("Nhap n=");
			Scanner input = new Scanner(System.in);
			n = input.nextInt();
		}while(n <=0 );
		int b;
		float m,dem = 0;
		System.out.print("Cac so chinh phuong co trong " + n + " la:");
		while(n / 10 != 0 || n > 0) {
			b = n % 10;
			m = (float) Math.sqrt(b);
			if(m == (int)m) {
				System.out.println(" " + b );
				dem++;
			}
			n = n / 10;
			
		}
		if(dem == 0)  System.out.print("No");
	}

}
