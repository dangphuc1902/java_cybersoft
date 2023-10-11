package baitapbuoi5;
import java.util.Scanner;

public class b7_buoi5 {
	public static void main(String[] args) {
//	// Phương trình dạng khuyết tử: ax^2 + c = 0
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Vui lòng nhập số nguyên A: ");
//	int a = sc.nextInt();
//	System.out.println("Vui lòng nhập số nguyên B: ");
//	int b = sc.nextInt();
//	double nghiem;
//	nghiem = b*b - 4*a*0;
//	if(a != 0) {
//		if(nghiem <0) {
//			System.out.println("Phương trình vô nghiệm ");			
//		}
//		else if(nghiem == 0) {
//			System.out.println("Phương trình có nghiệm kép: " + (-b/2*a));
//		}
//		else {
//			System.out.println("Phương trình có 2 nghiệm: " + (- b + Math.sqrt(nghiem))/2*a +  (- b - Math.sqrt(nghiem))/2*a);
//		}
//		System.out.println("Phương trình có nghiệm là: " + nghiem);	
//		}
//	else{
//		System.out.println("Nhập lại số a");
//	}

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Giải phương trình ax^2 + b = 0");
		System.out.println("Vui lòng nhập số nguyên A: ");
		double a = sc2.nextDouble();
		System.out.println("Vui lòng nhập số nguyên B: ");
		double b = sc2.nextDouble();
		double delta = -b / a;
		if (a != 0) {
			if (delta > 0) {
				double nghiemso1 = Math.sqrt(delta);
				double nghiemso2 = -Math.sqrt(delta);
				System.out.println("Phương trình có 2 nghiệm x1 = " + nghiemso1 + "x2 = " + nghiemso2);
			} else if (delta == 0) {
				System.out.println("Nghiệm x = 0");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		} else if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Vô nghiệm");
		}
	}
}
