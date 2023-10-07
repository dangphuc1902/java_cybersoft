package homework_session_06;
/*Tìm số nguyên dương n nhỏ nhất sao cho: 1 + 2 + ... + n > 10000
 * - Phân tích:
 * 		+ Đầu vào:  
 * 		+ Nghiệp vụ xử lý:	
 * 			- Sử dụng vòng lặp để kiểm tra từng số nguyên cho tới khi tổng của từ 1 đến số nguyên lớn hơn 10000.
 * 			- Sau khi đạt được điều kiện tổng > 10000 thì kết thúc vòng lặp.			
 * 		+ Đầu ra: Xuất ra số nguyên đó n nhỏ nhất. 
 * */
public class b2_find_Interger_Min {
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while(sum <= 10000) {
			sum += n;
			n++;
		}
		System.out.println("Tổng là" + sum);
		System.out.println("Số nguyên dương nhỏ nhất: " + (n-1));
	}
}
