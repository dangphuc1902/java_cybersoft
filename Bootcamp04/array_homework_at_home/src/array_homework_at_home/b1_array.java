package array_homework_at_home;

import java.net.Socket;
import java.util.Iterator;
import java.util.Scanner;
/*Viết chương trình nhập vảo một mảng số nguyên có n phần tử và thực hiện các công việc sau:
 * Xuất giá trị các phần tử của mảng.
 * Tìm phần tử có giá trị lớn nhất, nhớ nhất.
 * Đếm số phần tử là số chẵn.
 * Sắp xếp mảng tăng dần.
 * */
public class b1_array {
	public static void nhapThongTin(int[] mangSo) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập các phần tử cho mảng: ");
		for(int i = 0; i < mangSo.length; i++) {
			mangSo[i] = scanner.nextInt();
		}
	}
	public static void xuatThongTin(int[] mangSo) {
		for (int i = 0; i < mangSo.length; i++) {
			System.out.println("Phần tử thứ " + i + " trong mảng có giá trị: " + mangSo[i]);			
		}
	}
	public static void maxAndMin(int[] mangSo) {
		int max = mangSo[0];
		int min = mangSo[0];
		for (int i = 0; i < mangSo.length; i++) {
			if (max < mangSo[i]) {
				max = mangSo[i];
			}
		}
		for (int i = 0; i < mangSo.length; i++) {
			if (min > mangSo[i]) {
				min = mangSo[i];
			}
		}
		System.out.println("Số lớn nhất là: " + max + "\nSố bé nhất là: " + min);
	}
	public static void demSoChan(int[] mangSo) {
		int count = 0;
		for (int i = 0; i < mangSo.length; i++) {
			if(mangSo[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Có: "+ count + " chẵn có trong mảng: ");
	}
	 public static void sapXepTangDan(int[] mangSo) {
		 int temp = 0;
		 for (int i = 0; i < mangSo.length; i++) {
			for (int j = i + 1; j < mangSo.length; j++) {
				if(mangSo[i] > mangSo[j]) {
					temp = mangSo[j];
					mangSo[j] = mangSo[i];
					mangSo[i] = temp;
				}
			}
		}
	 }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số lượng phần tử n của mảng: ");
		int n = scanner.nextInt();
		int[] mangSo = new int[n];
		nhapThongTin(mangSo);
		xuatThongTin(mangSo);
		maxAndMin(mangSo);
		demSoChan(mangSo);
		sapXepTangDan(mangSo);
	}
}
