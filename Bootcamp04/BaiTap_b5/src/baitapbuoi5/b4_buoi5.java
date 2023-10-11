package baitapbuoi5;
import java.util.Scanner;

public class b4_buoi5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên soA: ");
		int soA = sc.nextInt();
		System.out.println("Nhập vào số nguyên soB: ");
		int soB = sc.nextInt();
		System.out.println("Nhập vào số nguyên soC: ");
		int soC = sc.nextInt();
		System.out.println("Nhập vào số nguyên soD: ");
		int soD = sc.nextInt();
		
		int tong = soA + soB + soC + soD;
		int hieu = soA - soB - soC - soD;
		int tich_SoA_SoB = soA * soB;
		int tich_SoC_SoD = soC * soD;
		int tinh_ket_qua = soA - soB + soC + soD;
		System.out.println("Tổng của 4 số nguyên : " + tong);
		System.out.println("Hiệu của 4 số nguyên : " + hieu);
		System.out.println("Tích của 2 số nguyên a,b : " + tich_SoA_SoB);
		System.out.println("Tích của 2 số nguyên c,d : " + tich_SoC_SoD);
		System.out.println("Kết quả của a - b + c + d: " + tinh_ket_qua);

	}
}
