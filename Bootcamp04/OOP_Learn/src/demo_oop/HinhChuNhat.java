package demo_oop;

import java.util.Scanner;

public class HinhChuNhat {
	double chieuDai;
	double chieuRong;
	double	 chuVi;
	double dienTich;
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào chiều dài: ");
		chieuDai = scanner.nextDouble();
		System.out.println("Mời bạn nhập vào chiều rộng : ");
		chieuRong = scanner.nextDouble();
	}
	public double chuVi() {
		 chuVi = (chieuDai + chieuRong) * 2;			
		return chuVi;
	}
	public double dienTich() {
		dienTich = chieuDai * chieuRong;
		return dienTich;
	}
	
	public void xuatThongTin() {
		System.out.println("Chu vi hinh chu nhat: " + chuVi());
		System.out.println("Dien tich hinh chu nhat: " + dienTich());
	}
}
