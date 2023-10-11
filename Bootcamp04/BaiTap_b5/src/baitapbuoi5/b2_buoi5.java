package baitapbuoi5;
import java.util.Scanner;

public class b2_buoi5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin SV: ");
		System.out.println("Nhập Họ và tên SV: ");
		String ho_Ten = sc.nextLine();
		System.out.println("Nhập Tuổi SV: ");
		int tuoi = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập Giới tínhSV: ");
		String gioi_Tinh = sc.nextLine();
		System.out.println("Nhập mã số SV: ");
		String ma_So_SV = sc.nextLine();
		
		System.out.println("Thông tin sinh viên: ");
		System.out.println("Họ tên: " + ho_Ten);
		if(tuoi > 0) {
			System.out.println(tuoi + " Tuổi");
			System.out.println(" Giới tính: " + gioi_Tinh + " Mã số SV " + ma_So_SV);
		}else {
			System.out.println("Nhập lại tuổi:");
		}
	}
}
