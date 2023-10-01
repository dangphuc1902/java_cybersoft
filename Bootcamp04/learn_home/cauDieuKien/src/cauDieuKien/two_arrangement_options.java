package cauDieuKien;

import java.util.Scanner;

public class two_arrangement_options {

		// Cho người dùng nhập vào 3 số nguyên. Nhưng cho phép hỏi người dùng muốn xuất theo thứ tự nào? nếu người dùng chọn 1: Xuất tăng dần, chọn 2 xuất giảm dần.
		/*
		 * Phân tích yêu cầu bài toán:
		 * Nhập vào 3 số nguyên A, B , C
		 * Nhập vào chế độ sắp xếp 1 or 2
		 * Thông tin cần xuất:
		 * 		thứ tự tăng dần của 3 số hoặc giảm dần.
		 * Nghiệp vụ: 
		 * 		- Kiểm tra từng số với nhau sau đó sắp xếp tăng dần hoặc giảm dần.
		 * */
		
		public static void tangDan(int soA, int soB, int soC) {
			if(soA > soB) {
				int temp = soA;
				soA = soB;
				soB = temp;
			}
			else if(soA > soC) {
				int temp = soA;
				soA = soC;
				soC = temp;
			}
			
			else if(soB > soC){
				int temp = soB;
				soB = soC;
				soC = temp;
			}
			System.out.println("Dãy số sau khi đã sắp xếp tăng dần: " + " số A " + soA + " Số B " + soB + " số C " + soC);
		
	}
		public static void giamDan(int soA, int soB, int soC) {
			if(soA < soB) {
				int temp = soA;
				soA = soB;
				soB = temp;
			}
			else if(soA < soC) {
				int temp = soA;
				soA = soC;
				soC = temp;
			}
			
			else if(soB < soC){
				int temp = soB;
				soB = soC;
				soC = temp;
			}
			System.out.println("Dãy số sau khi đã sắp xếp tăng dần: " + " số A " + soA + " Số B " + soB + " số C " + soC);
		
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Mời bạn nhập số A = ");
			byte soA = sc.nextByte();
			System.out.println("Mời bạn nhập số B = ");
			byte soB = sc.nextByte();
			System.out.println("Mời bạn nhập số C = ");
			byte soC = sc.nextByte();
			System.out.println("Mời bạn nhập lựa chọn sắp xếp số 1 là tăng dần và số 2 là giảm dần: ");
			byte options = sc.nextByte();
//			if(options == 1) {
//				System.out.println("Kết quả: ");
//				tangDan(soA, soB, soC);
//			}
//			else if (options == 2){
//				System.out.println("Kết quả: ");
//				giamDan(soA, soB, soC);
//			}
			switch (options) {
			case 1: {
				System.out.println("Kết quả: ");
//				tangDan(soA, soB, soC);
				break;
			}
			case 2: {
				System.out.println("Kết quả: ");
				giamDan(soA, soB, soC);
				break;
			}
			default:
				System.out.println("Vui long nhap lai");
				break;
			}
		}
}
