import java.util.Scanner;

public class b3_buoi5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào số nguyên a: ");
	int soA = sc.nextInt();
	System.out.println("Nhập vào số nguyên b: ");
	int soB = sc.nextInt();
	int tong = soA + soB;
	if(soA == 0 && soB == 0) {
		System.out.println("Vui lòng nhập");
	}
	System.out.println("Tổng 2 số nguyên: " + tong);
}
}
