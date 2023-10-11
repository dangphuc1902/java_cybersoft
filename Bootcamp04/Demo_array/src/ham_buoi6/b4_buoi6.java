package ham_buoi6;

import java.util.Scanner;

public class b4_buoi6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập lựa chọn phép tính: 1. + , 2. - , 3. *, 4. / ");
		int luaChon = sc.nextInt();
		System.out.println("Nhập số A: ");
		int a = sc.nextInt();
		System.out.println("Nhập số B: ");
		int b = sc.nextInt();
		if(a != 0 && b != 0) {
			switch (luaChon) {
			case 1: {
				System.out.println("Kết quả phép cong "+ cong(a, b));
				break;
			}
			case 2:{
				System.out.println("Kết quả phép chia "+ tru(a,b));
				break;
			}
			case 3:{
				System.out.println("Kết quả phép nhân "+ nhan(a,b));
				break;
			}
			case 4:{
				System.out.println("Kết quả phép chia: "+ chia(a,b));
				break;
			}
			default:
				System.out.println("Nhập lựa chọn phép tính không hợp lệ. Vui lòng lựa chọn lại");
				break;
			}	
		}
		else {
			System.out.println("Vui lòng nhập lại 2 số nguyên!");
		}
	}
	public static int cong(int a, int b) {
		return a + b;
	}
	public static int tru(int a, int b) {
		return a - b;
	}
	public static int nhan(int a, int b) {
		return a * b;
	}
	public static double chia(int a, int b) {
		return (double) (a / b);
	}
}
