import java.util.Scanner;

public class b1_buoi5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 1 số bất kì: ");
		int soA = sc.nextInt();
		if(soA == 0) {
			System.out.println("Nhập lại số A: ");
		}else {
			if(soA % 5 == 0) {
				System.out.println("Số " + soA + " chia hết cho 5");
				
			}else {
				System.out.println("Số " + soA + " không chia hết cho 5");
			}
		}
	}
}
