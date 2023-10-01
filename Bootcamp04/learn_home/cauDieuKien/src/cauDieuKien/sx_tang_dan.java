package cauDieuKien;

import java.util.Scanner;

public class sx_tang_dan {
	public static void sapXep(int soA, int soB, int soC) {
		if(soA > soB) {
			int temp = soA;
			soA = soB;
			soB = temp;
		}
		else if(soA > soC) {
			int temp = soA;
			soA = soC;
			soC = temp;
		}
		
		else if(soB > soC){
			int temp = soB;
			soB = soC;
			soC = temp;
		}
		System.out.println("Dãy số sau khi đã sắp xếp tăng dần: " + " số A " + soA + " Số B " + soB + " số C " + soC);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập soA = ");
		int soA = sc.nextInt();
		System.out.println("Vui lòng nhập soB = ");
		int soB = sc.nextInt();
		System.out.println("Vui lòng nhập soC = ");
		int soC = sc.nextInt();
		System.out.println("Dãy số sau khi sắp xếp theo thứ tự tăng lên: ");
		sapXep(soA, soB, soC);
		
	}
}
