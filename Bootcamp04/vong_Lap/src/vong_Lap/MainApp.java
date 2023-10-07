package vong_Lap;

public class MainApp {
	public static void main(String[] args) {
		/*for(gia tri bat dau chay, điều kiện kết thúc quá trình chạy, tăng biến gia trị bắt đầu chạy lên) */
		int tong = 0;
//		for(int i = 1; i <= 5; i++) {
//			tong += i;
//		}
		
		
		int i = 0;
		/*While(Điều kiện dừng)*/
//		while(i <= 5) {
//			tong += i;
//			i ++;
//		}
		
		
		
		do {
			System.out.println("Kiểm tra i " + i);
			i++;
		} while (i <= 5);
		System.out.println("Tổng: " + tong);
	}
}
