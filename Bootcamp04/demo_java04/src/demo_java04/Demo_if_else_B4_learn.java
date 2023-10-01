package demo_java04;

import java.util.Scanner;

public class Demo_if_else_B4_learn {
	public static void soNguyenLonNhat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập số nguyên: ");
		System.out.println("Nhập số A: ");
		int soA = sc.nextInt();
		System.out.println("Nhập số B: ");
		int soB = sc.nextInt();
		System.out.println("Số nguyên lớn nhất là: " + ((soA > soB) ? soA : soB));
	}
	public static void chaoHoi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin chào. Cho hỏi ai là người đang sử dụng máy tính: ");
		String thanhVien = sc.nextLine();
		switch (thanhVien.toUpperCase()) {
		case "B": {
			 System.out.println("Xin chào Ông chủ (Bố) đã đăng nhập vào máy! Chúc bố có ngày mới tốt lành");
			 break;
		}
		case "H":{
			System.out.println("Xin chào Bà chủ (Mẹ) đã đăng nhập vào máy! Chúc Mẹ có ngày mới tốt lành");
			break;
		}
		case "A":{
			System.out.println("Xin chào Cậu chủ (Anh Trai)đã đăng nhập vào máy! Chúc Anh Trai có ngày mới tốt lành");
			break;
		}
		case "E":{
			System.out.println("Xin chào Cô chủ (Em gái) đã đăng nhập vào máy! Chúc Em gái có ngày mới tốt lành");
			break;
		}
		default:
			System.out.println("Vui lòng nhập vào kí tự B M A E");
			break;
		 }
	}
	public static void main(String[] args) {
		soNguyenLonNhat();
		chaoHoi();

	}
}
