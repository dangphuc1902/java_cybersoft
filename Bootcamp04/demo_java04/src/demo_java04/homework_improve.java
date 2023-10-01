package demo_java04;

import java.util.Scanner;

public class homework_improve {
	public static void helloUsers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập họ tên của bạn: ");
		String hoTen = sc.nextLine();
		System.out.println("Xin chào... " + hoTen);
		System.out.println("Đã viết chương trình này");
	}
	public static void canhHuyen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập chiều dài cạnh A =");
		double canhA = sc.nextDouble();
		System.out.println("Vui lòng nhập chiều dài cạnh B =");
		double canhB = sc.nextDouble();
		double canhHuyen = Math.sqrt((canhA*canhA) + (canhB * canhB));
		System.out.println("Kết quả cạnh huyền = " + canhHuyen);
	}
	public static void sumNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập số vào: ");
		int n = sc.nextInt();
		int a = n % 10;
		int b = n / 10;
		int ketQua = a + b;
		System.out.println("Kết quả: " + ketQua);
		 
	}
	
	public static void donThuc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập số thực a: ");
		double a = sc.nextDouble();
		System.out.println("Vui lòng nhập số n: ");
		int n = sc.nextInt();
		double p = a * Math.pow(8, n);
		System.out.println("kết quả đơn thức: " + p);
	}
	public static void main(String[] args) {
//		helloUsers();
//		canhHuyen();
//		sumNumber();
//		donThuc();
	}
}
