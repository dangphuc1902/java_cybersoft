package homework_session_06;

import java.util.Scanner;

/*
 * Viết chương trình tính tổng các số lẻ nguyên dương nhỏ hơn n được nhập từ người dùng. 
 * Chỉ cho nhập số > 0
 * Yêu cầu nhập lại nếu không đúng yêu cầu. 
 * 
 * Phân tích: 
 * - Đầu vào: 
 * 		+ Nhập vào số nguyên dương n. (n > 0)
 * - Nghiệp vụ cần xử lý:
		+ Tính tổng các số lẻ nguyên dương nhỏ hơn n.,
 * - Đầu ra: 
 * 		+ In ra kết quả tổng.
 * */
public class b3_sum_odd_int {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên dương n: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i < n; i+=2) {
			sum += i;
		}
		System.out.println("Tổng số nguyên lẻ nhỏ hơn n: " + sum);
	}
}
