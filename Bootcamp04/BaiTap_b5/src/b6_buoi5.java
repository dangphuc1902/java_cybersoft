import java.util.Scanner;

public class b6_buoi5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập số nguyên A: ");
		int a = sc.nextInt();
		System.out.println("Vui lòng nhập số nguyên B: ");
		int b = sc.nextInt();
		if(a != 0) {
			double nghiem = (double) -b / a;
			System.out.println("Phương trình có nghiệm là: " + nghiem);			
		}
		else {
			System.out.println("Vui lòng nhập lại số A");
		}
		
	}
}
