package test;

import java.util.Scanner;

public class aaa {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		System.out.println("Hello Hải");
		
		//Nhap a
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a:");
		int a = scanner.nextInt();
		//Hien thi a
		System.out.println("a=" + a);
		
		//Nhap Chuoi
//		System.out.println("Nhap chuoi b la:");	
//		scanner.nextLine();
//		String b = scanner.nextLine();
		
		//Hien thi chuoi
		//System.out.println("Chuoi vua nhap la:" + b);
		//Nhap b
		System.out.println("Nhap b=");
		int b = scanner.nextInt();
		
		//int c = a + b;
		
		//Hien thi tong cua a va b
		//System.out.println("Tong cua a va b la:" + c);
		
		System.out.println("Nhap c=");
		int c = scanner.nextInt();
		
		//Tim gt lon nhat trong ba chu so a b c
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c)
			max = c;
		System.out.println("So lon nhat trong ba chu so a,b,c la:" + max);
		//Tim gt nho nhat trong ba chu so a b c
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c)
			min = c;
		System.out.println("So nho nhat trong ba chu so a,b,c la:" + min);
		*/
		/*
		Scanner x = new Scanner(System.in);
		System.out.println("Nhap thang va nam:");
		int month = x.nextInt();
		int year = x.nextInt();
		
		switch(month) {
		case 1:case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("Thang " + month + " co 31 ngay");
			break;
		case 9:case 4:case 6:case 11:
			System.out.println("Thang " + month + " co 30 ngay");
			break;
		case 2:
			if(year % 4 == 0 && year % 100 != 0) {
				System.out.println("Thang " + month + " co 29 ngay");
				break;	
			}else {
				System.out.println("Thang " + month + " co 28 ngay");
				break;	
			}
		default:
			System.out.println("Nhap so k thoa man");
		}
		*/
		
		System.out.println("Nhap a:");
		Scanner x = new Scanner(System.in);
		int dem = 0;

		int a = x.nextInt();
		if(a < 2) System.out.println("Yes");
		else {
			for(int i = 2;i <= Math.sqrt(a);i++) {
				if(a % i == 0) {
					System.out.println("Yes");
					dem++;
				}
			}
			if(dem == 0) System.out.println("No");
		}
	}

}
