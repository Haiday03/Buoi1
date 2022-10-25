package test;

import java.util.Scanner;

public class NinhVanHai_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap 4 so nguyen a,b,c,d lan luot la:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		int[] so = {a,b,c,d};
		for(int i = 0;i <= so.length - 1;i++) {
			for(int j = i + 1;j <= so.length - 1;j++) {
				if(so[i] < so[j]) {
					int tmp = so[i];
					so[i] = so[j];
					so[j] = tmp;
				}
			}
		}
		if(so[0] != so[1]) System.out.println(so[1]);
		else if(so[0] == so[1] && so[1] != so[2]) System.out.println(so[2]);
		else if(so[0] == so[1] && so[1] == so[2] && so[2] != so[3]) System.out.println(so[3]);
		else System.out.println("Khong ton tai so lon thu hai");
	}

}
