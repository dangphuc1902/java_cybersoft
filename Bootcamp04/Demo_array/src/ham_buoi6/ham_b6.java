package ham_buoi6;

import java.util.Scanner;

public class ham_b6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số a để kiểm tra: ");
		int a = sc.nextInt();
		System.out.println("Nhập số b để kiểm tra: ");
		int b = sc.nextInt();
		System.out.println("Nhập số c để kiểm tra: ");
		int c = sc.nextInt();
		
		int kq = findMaxInThree(a,b,c);
		System.out.println("Số lớn nhất là: " + kq);
	}

//	public static int findMaxInThree(int a,int b, int c) {
//			if(a > b && a > c) {
//				return a;
//			}else if(b > c && b > a){
//				return b;
//			}else {
//				return c;
//			}
//	}
	public static int findMaxInThree(int a,int b, int c) {
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		return max;
	}
}
// Hàm chỉ dùng để thực thi Code. Void: Hàm không có giá trị trả về.
// Hàm thực thi code nhưng có giá trị trả về kết quả sau khi thực thi.

//	1. Khai báo: Hàm chỉ để thực thi code: Void.
//	cú pháp.
//	    echo```public void tên_hàm(thamso, thamso...);```
//
//	2. Hàm thực thi code nhưng có giá trị trả về kết quả sau thực thi.
//	    cú pháp:
//	        echo```public kieu_du_lieu_tra_ve ten_ham(thamso, thamso....)```z
//	        

//	public static int tinhTong(int soA, int soB) {
//		int kq = soA + soB;
//		System.out.println("Tong la: " + kq);
//		return kq;
//	}
//	public static void tinhTichBaSo(int soA, int soB, int soC) {
//		int kq = soA * soB * soC;
//		System.out.println("Tích là: "+ kq);
//	}
//}
