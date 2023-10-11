package baitapbuoi5;
import java.util.Scanner;

public class b5_buoi5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập con vật bạn muốn(Chó, Mèo, Chuột, Ngựa): ");
		String dong_Vat = sc.nextLine();
		switch (dong_Vat.toLowerCase()) {
		case "chó": {
			System.out.println("Gâu gâu");
			break;
		}
		case "mèo": {
			System.out.println("Meo meo");
			break;
		}
		case "chuột": {
			System.out.println("chít chít");
			break;
		}
		case "ngựa": {
			System.out.println("hí hí");
			break;
		}
		
		default:
			System.out.println("Vui lòng nhập vào động vật khác.");
			break;
		}
	}
}
