package btvnthamkhao;

import java.util.Scanner;

public class so_Nguyen_Duong_Chan_Le_nho_100 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui lòng nhập số nguyên n(1 để in số lẻ, 2 để in số chẵn ):");
		int n = scanner.nextInt();
		if(n == 1) {
			System.out.println("số nguyên dương lẻ là: ");
//			while(n < 100) {
//				System.out.print(n + " ");
//				n += 2;
//			}
			for(int i = 1; i < 100; i+=2) {
				System.out.print(i + " ");
			}
		}
		else if(n == 2){
			System.out.println("số nguyên dương chẵn là: ");
			for(int i = 2; i < 100; i+=2) {
				System.out.print(i + " ");
			}
		}
	}
}
