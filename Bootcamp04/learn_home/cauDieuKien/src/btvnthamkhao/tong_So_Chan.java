package btvnthamkhao;

import java.util.Scanner;

public class tong_So_Chan {
	private static int sum_odd(int n) {
		int tong  = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				tong += i;
			}
		}
		return tong;
	}
	private static int nhapLieu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n: " );
		int n;
		do {
			System.out.println("Vui lòng nhập số lớn hơn 1: "); 
			n = sc.nextInt();
		} while (n < 1);
		return n;
	}
	private static void xuatDuLieu(int tong) {
		System.out.println("Tổng các số chẵn là : " + tong);
		
	}
	public static void main(String[] args) {
		// Code đầu vào
		int n = nhapLieu();
		// Code xử lý:
		int kq = sum_odd(n);
		//	code đầu ra
		xuatDuLieu(kq);
	}
}
