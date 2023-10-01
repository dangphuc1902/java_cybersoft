package cauDieuKien;
import java.util.Scanner;
public class find_max {
//	/**
//	 * Điểm trung bình 9 => 10 điểm: Học sinh giỏi
//	 * Điểm trung bình 8 => 9 điểm: Học sinh khá giỏi
//	 * Điểm trung bình 7 => 8 điểm: Học sinh khá
//	 * Điểm trung bình 6 => 7 điểm: Học sinh tiên tiến
//	 * Điểm trung bình 5 => 6 điểm: Học sinh trung bình
//	 * Điểm trung bình dưới 5 điểm: Học sinh yếu
//	 */
//	public static void main(String[] args) {
//		System.out.print("Mời bạn nhập điểm của học sinh: ");
//		Scanner sc = new Scanner(System.in);
//		double diemTrungBinh = sc.nextDouble();
//		if(diemTrungBinh > 5){
//			if(diemTrungBinh <= 6){
//				System.out.println("Học sinh trung bình");
//			}
//			else if(diemTrungBinh <= 7){
//				System.out.println("Học sinh tiên tiến");
//			}
//			else if(diemTrungBinh <= 8){
//				System.out.println("Học sinh khá");
//			}
//			else if(diemTrungBinh <= 9){
//				System.out.println("Học sinh khá giỏi");
//			}
//			else if(diemTrungBinh <= 10){
//				System.out.println("Học sinh giỏi");
//			}}else {
//			System.out.println("Học sinh yếu");
//		}
//	}
//	
	public static void main(String [] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Mời bạn nhập lần lượt 2 số:");
		byte a = sc.nextByte();
		byte b = sc.nextByte();
		if(a >= b) {
			System.out.printf("Giữa 2 số %d và %d bạn vừa nhập thì số lớn nhất là %d ", a, b, a);
		}
		else {
			System.out.printf("Giữa 2 số %d và %d bạn vừa nhập thì số lớn nhất là %d", a, b, b);
		}

		
	}
}