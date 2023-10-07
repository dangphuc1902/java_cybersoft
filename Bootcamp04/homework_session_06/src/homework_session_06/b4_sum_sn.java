package homework_session_06;

import java.util.Scanner;

/*
 * Viết chương trình nhập n và tính tổng:
 * 	S(n) = x + x^2 + x^3 + ... + x^n (Sử dụng vòng lặp + hàm)
 * 
 * Phân tích:
 * 	- Đàu vào: Nhập vào số nguyên dương n và x. 
 * 	- Nghiệp vụ:
 * 		+ 
 * 	- Đầu ra:
 * 		+ In ra màn hình tổng S(n) 
 * */
public class b4_sum_sn {
	public static int tong(int x, int n) {
		int sum = 0;
		int temp = 0;
		for(int i = 1; i < n; i++) {
			temp = (int)(Math.pow(x,i));
			sum += temp;
			System.out.println("Sum " + i + " " + temp + " "+ sum);
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mời bạn nhập n: ");
		int n = sc.nextInt();
		System.out.println("Mời bạn nhập x: ");
		int x = sc.nextInt();
		System.out.println("Tổng số S(n) " + tong(x,n));
		
	}
}
