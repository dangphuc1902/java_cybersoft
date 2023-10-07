package homework_session_06;

import java.util.Random;
import java.util.Scanner;

/*
 * Xây dựng chương trình trò chơi Oẳn tù tì(Bao, Kéo, Kìm). Người và máy sẽ chơi với nhau.
 * Nhấn một số khác 0 để chơi tiếp, nhấn 0 để dừng.  Tính xem ai sẽ là người thắng nhiều nhất. Và tỉ số là bao nhiêu.
 * Phân tích bài toán: 
 * 		- Đầu vào:
 * 			+ 1 - 3: Bao Kéo Búa.
 * 		- Nghiệp vụ xử lý:
 * 			+ random cho máy ra ngẫu nhiên 1 trong 3 lựa chọn (bao, kéo, búa)
 * 			+ đưa vào vòng lặp while dk dừng: người dùng nhập vào số bằng 0.
 * 			+ tạo biến đếm số lần thắng cho cả người và máy. So sánh ai là người thắng nhiều nhất.
 * 		- Đầu ra:
 * 			+ Xuất ra ai là người thắng nhiều nhất.
 * 			+ Xuất ra tỉ số là bao nhiêu. 
 * */
public class b1_Game_Oan_Tu_Ti {
	private static int getResult(int user_input,int computer) {
		if(user_input == computer) {
			return 0;	// Hòa
		}else if((user_input == 1 && computer == 3) || (user_input == 2 && computer == 1) || (user_input == 3 && computer == 2)){
			return 1;	// Người thắng
		}else {
			return  -1; // máy thắng	
		}
	 }
	
	private static String getPlayerChoice(int choice) {
		switch (choice) {
		case 1: {
			return "Bao";
		}
		case 2:{
			return "Kéo";
		}
		case 3: 
			return "Búa";
		default:
			return "";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user_input;
		int computer = 0;
		int player_Score = 0;
		int computer_Score = 0;
		do {
			computer = (int) (Math.random()*3+1);
			System.out.println("random máy tính: " + computer);
			System.out.println("Vui lòng chọn 1 lựa chọn theo số: ");
			System.out.println("1. Bao");
			System.out.println("2. Kéo");
			System.out.println("3. Búa");
			System.out.println("0. Dừng");
			user_input = sc. nextInt();
			if(user_input > 3 || user_input < 0) {
				System.out.println("Vui lòng lựa chọn lại '1', '2' ,'3' ");
			}else {
				System.out.println("Lựa chọn của Bạn là: " + getPlayerChoice(user_input));
				System.out.println("Lựa chọn của Máy là: " + getPlayerChoice(computer));
				
				int result = getResult(user_input,computer);
				System.out.println("Kết quả: " + result);
				if (result == 1) {
					System.out.println("Bạn thắng!");
					player_Score++;
				}else if(result == -1)
				{
					System.out.println("Máy thắng!");
					computer_Score++;
				}else {
					System.out.println("Hòa !");
				}
				System.out.println("Tỉ số hiện tại là: Bạn đạt " + player_Score + " điểm." + " Máy đạt " + computer_Score + " điểm.");
				System.out.println();
			}

		} while (user_input != 0);
        System.out.println("Kết quả cuối cùng: Bạn " + player_Score + " - " + computer_Score + " Máy");
	}
}
