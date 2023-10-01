package btvnthamkhao;
/*
 * Viết chương trình nhập vào 3 số thực. Hãy thay tất cả các số âm bằng trị tuyệt đối của nó.
 *	Phân tich:
 * 		- Đầu vào:
 * 			- Nhập 3 số thực.
 * 		- Đầu ra: 3 số thực không âm.
 * 		- Xử lý code:
 * 			-  Nếu số thực < 0 thì thay thế nó bằng giá trị tuyệt đối của nó.
 * */

import java.util.Scanner;

public class thay_So_Am_Tri_Tuyet_Doi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập số thực thứ nhất: ");
		double soA = sc.nextDouble();
		System.out.println("Vui lòng nhập số thực thứ hai: ");
		double soB = sc.nextDouble();
		System.out.println("Vui lòng nhập số thực thứ ba: ");
		double soC = sc.nextDouble();
		if(soA < 0) {
			soA = Math.abs(soA);
		}
		if(soC < 0) {
			soB = Math.abs(soB);
		}
		if(soC < 0) {
			soC = Math.abs(soC);
		}
		System.out.println("Các số thực đều dương" + soA + " " + soB + " " + soC);
	}
}
