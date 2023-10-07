package loop_src;

import java.util.Scanner;

public class while_loop {
	public static void main(String[] args) {
//		// BT1: Khi nào điểm thi còn bế hơn 5 thì nhập lại điểm thi. 
//		double diemThi = 0;
//		=================================== VÒNG LẶP WHILE ===================================
//		// Khi nào còn thõa điều kiện thì còn lặp lại code. 
//		while(diemThi < 5) {	
//			// Code sẽ thực thi khi thõa điều kiện của vòng lặp while 
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Vui lòng nhập điểm thi: ");
//			// Gán giá trị của biến diemThi bằng giá trị người dùng nhập ở màn hình console. 
//			diemThi = scanner.nextDouble();
//			// Tới đây chạy lại xét điều kiện xem còn thõa mãn điều kiện ko. Còn thõa mãn thì tiếp tục chạy lại
//		}
//		// Vòng lặp sẽ kết thúc khi không còn thõa mãn điều kiện. 
//		System.out.println("Điểm thi: " + diemThi);
		
		
//		Bt2: Điều kiện dùng vòng lặp: Số người dùng nhập vào bằng 0 hoặc là số âm. => đk: <= 0
//		int soNhap;
//		int tong = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Vui lòng nhập vào số bất kì: ");
//		soNhap = sc.nextInt();
//		// Khi nào soNhap còn lớn hơn 0 thì chạy code trong vòng lặp. 
//		while(soNhap > 0) {
//			tong += soNhap; 	// tong = tong + soNhap;
//			System.out.println("Vui lòng nhập vào số bất kì: ");
//			soNhap = sc.nextInt();
//
//		}
//		System.out.println("Tổng số người dùng nhập: " + tong);
		
//		=================================== VÒNG LẶP DO WHILE ===================================
		// do while : Chạy trước 1 lần code bên trong vòng lặp rồi mới xét điều kiện. 
//		int soNhap;
//		int tong = 0;
//		do {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Vui lòng nhập vào số bất kì: ");
//			soNhap = sc.nextInt();
//			if(soNhap > 0)
//				tong += soNhap;	// tong = 3 - 1;
//		} while (soNhap > 0);
//		System.out.println("Tổng số người dùng nhập: " + tong);
		
//		=================================== TRÒ CHƠI ĐOÁN SỐ ===================================
//// TRÒ CHƠI ĐOÁN SỐ: (Điều kiện lặp: int != ngẫu nhiên.)
//		int soNgauNhien = (int)(Math.random()*999 + 1);	// Phát sinh số ngẫu nhiên. 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Số ngẫu nhiên: " + soNgauNhien);
//		int soNhap;
//		String ketQua = " ";
//		do {
//			System.out.println("Bạn vui lòng nhập một số: ");
////			soNhap = sc.nextInt();
//			soNhap = Integer.parseInt(sc.nextLine());
//			if(soNhap > soNgauNhien) {
//				System.out.println("Bạn đang nhập số lớn hơn");
//			}else if(soNhap < soNgauNhien) {
//				System.out.println("Bạn đang nhập số bé hơn");
//			}
////			if(soNhap != soNgauNhien)
////				ketQua = (soNhap > soNgauNhien) ? "Bạn đang nhập số lớn hơn" : "Bạn đang nhập số bé hơn";
//			System.out.println("Kết quả: "  + ketQua);				
//			
//		} while (soNhap != soNgauNhien);
//		System.out.println("Bạn đã nhập đúng số." + soNgauNhien);
		
		
//		=================================== VÒNG LẶP FOR (Cho biết trước số lần lặp lại) ===================================
//		1. Khai báo
/* for(khởi tạo;điều kiện dừng;bước nhảy)
 * {
 * 	Thực thi khi đk đúng. 
 * */
//		for(int i = 1; i <= 100; i++) {
//			//Thõa mãn điều kiện thì sẽ thực thi code. 
//			System.out.println("Hello Java" + i);
//		}
		
//		=================================== example ===================================
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Vui lòng nhập số muốn tính: ");
//		int n = sc.nextInt();
//		int tong = 0;
//		for(int i = 1; i <= n;i++) {
//			tong += i;
//		}
//		System.out.println("Tổng : " + tong);
		
//		=================================== in số nguyên dương nhỏ hơn 100 ===================================
//		System.out.println("số nguyên dương lẽ là: ");
//		for(int i = 1; i <= 100; i+=2) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\nSố nguyên dương chẵn là: ");
//		for(int i = 2; i < 100; i+=2) {
//			System.out.print(i + " ");
//		}
		
		
		String soChan = " ";
		String soLe = " ";
		
		for(int i = 1; i < 100; i++) {
			if(i % 2 == 0) {
				soChan += i + " ";
			} else {
				soLe += i + " ";
			}
		}
		System.out.println(soChan);
		System.out.println(soLe);
		

	}
}
