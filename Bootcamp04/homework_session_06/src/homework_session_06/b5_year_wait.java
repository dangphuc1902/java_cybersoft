package homework_session_06;

import java.text.DecimalFormat;
import java.util.Iterator;
/*
 * Mô hình 3 khối:
 * 	- Đầu vào:
 * 		+ Số tiền gửi(principal)
 * 		+ Tiền lãi tiết kiệm ()
 * 		+ Số tiền X muốn có(target_Amount)
 * 	- Nghiệp vụ:
 * 		+ Tính số năm ít nhất mà anh x phải chờ. 
 * 	- Đầu ra:
 * 		- In ra số năm phải chờ 
 * */
import java.util.Scanner;

public class b5_year_wait {
	public static double calculateWaitingYears(double principal, double targetAmount, double interestRate) {
//		double waitingYears = (targetAmount - principal) / (principal * interestRate);
		int waitingYears = 0;
		double interest = 0;
	    String patternLai = "#.##";
	    String patternGui = "$#.##";
	    // làm tròn tiền lãi và tiền gửi đến 2 chữ số phần thập phân
	    DecimalFormat dcfLai = new DecimalFormat(patternLai);
	    // riêng tiền gửi có thêm dấu $ đằng trước
	    DecimalFormat dcfGui = new DecimalFormat(patternGui);
		while(targetAmount > principal) {
			waitingYears++;
			interest = principal * interestRate;
			principal += interest;
			System.out.println("Năm " + waitingYears + " tiền lãi = " + dcfLai.format(interest) + " tổng tiền gửi = " + dcfGui.format(principal));
		}
		return waitingYears;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số tiền anh X gửi:");
		double principal = sc.nextInt();
		System.out.println("Nhập số tiền anh X muốn có trong tương lai: ");
		double target_Amount = sc.nextInt();
		System.out.println("Nhập phần trăm lãi tiết kiệm");
		double interest_Rate = (sc.nextDouble())/100;
		System.out.println("Phần trăm lãi suất" + interest_Rate);
		double waitingYears = calculateWaitingYears(principal, target_Amount, interest_Rate);
		
        System.out.println("Số năm ít nhất mà anh X phải chờ đợi là: " + waitingYears);
	}
}
