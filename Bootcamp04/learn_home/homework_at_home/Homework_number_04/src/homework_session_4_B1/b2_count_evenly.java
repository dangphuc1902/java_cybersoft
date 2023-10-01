package homework_session_4_B1;

import java.util.Iterator;
import java.util.Scanner;

/*
 * Cho 3 số nguyên. Hãy viết chương trình xuất ra có bao nhiêu số lẻ và bao nhiêu số chẵn.
 * 	Phân tích bài toán:
 * 		- Đầu vào:
 * 			+ Nhập vào 3 số nguyên soA, soB, soC.
 * 		- Nghiệp vụ:
 * 			+ Tạo 2 biến đếm số chẵn lẻ: count_Even.count_odd
 * 			+ Kiểm tra từng số nếu số nào chẵn hoặc lẻ thì 2 biến trên sẽ tăng lên.
 * 		- Đầu ra:
 * 			+ Bao nhiêu Số lẻ và số chẵn
 * 		 
 * */

public class b2_count_evenly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên A: ");
		int number_A = sc.nextInt();
		
		System.out.println("Nhập số nguyên B: ");
		int number_B = sc.nextInt();
		
		System.out.println("Nhập số nguyên C: ");
		int number_C = sc.nextInt();
		
		int count_Even = 0;
		int count_Odd = 0;
	
		if(number_A % 2 == 0) {
			count_Odd++;
		}else {
			count_Even++;
		}
		
		if(number_B % 2 == 0) {
			count_Odd++;
		}else{
			count_Even++;
		}
		
		if(number_C % 2 == 0) {
			count_Odd++;
		}
		else{
			count_Even++;
		}
		System.out.println("Có tổng: " + count_Odd + " số chẵn " + "Và có tổng: " + count_Even + " số lẻ " );
		
	}
}
