import java.util.Scanner;

public class b4_b_buoi5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n: ");
		int soN = scanner.nextInt();
		String kiemtra = (soN % 2 == 0) ? (soN + " là số chẵn") : (soN + " là số lẻ");
		System.out.println(kiemtra);
	} 
}
