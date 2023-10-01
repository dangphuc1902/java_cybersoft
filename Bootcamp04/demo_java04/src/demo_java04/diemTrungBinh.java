package demo_java04;

import java.util.Scanner;

public class diemTrungBinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập thông tin sinh viên: ");
		System.out.println("Họ tên: ");
		String hoTen = sc.nextLine();
		
		System.out.println("Toán: ");
		double diemToan = sc.nextDouble();
		
		System.out.println("Lý: ");
		double diemLy = sc.nextDouble();
		
		System.out.println("Hóa: ");
		double diemHoa = sc.nextDouble();
		double diemTB = (diemToan + diemLy + diemHoa)/3;		
		
		if(diemToan > 10 || diemLy > 10 || diemHoa > 10 || diemToan < 0 || diemHoa < 0 || diemLy < 0) {
			System.out.println("Không nhận dạng được điểm. Vui lòng nhập lại");
		}else if (diemTB < 5) {
			System.out.println("Đạt loại Yếu");
		}else if( diemTB < 6.5) {
			System.out.println("Đạt loại TB");
		}else if(diemTB < 8.5) {
			System.out.println("Đạt loại Khá ");
		}else {
			System.out.println("Đạt loại Giỏi");
		}
		
//		thongBao = (soA % 2 ==) ? "Số Chẵn" : "Số lẻ";
	}
}
