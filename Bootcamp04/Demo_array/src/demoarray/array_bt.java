package demoarray;

import java.util.Iterator;
import java.util.Scanner;

public class array_bt {
	public static int[] nhapMang(int[] mangSo, int n) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập giá trị cho phần tử: " + i);
			// Gán giá trị cho phần tử duyệt được bằng giá trị người dùng nhập vào.
			mangSo[i] = scanner.nextInt();
		}
		return mangSo;
	}

	public static void xuatMang(int[] mangSO, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Vị trí " + i + " có giá trị là " + mangSO[i]);
		}
	}

	public static void soLonNhat(int[] mangSo, int n) {
		int max = mangSo[0];
		int viTri = 0;
		for (int i = 1; i < n; i++) {
			if (max < mangSo[i]) {
				max = mangSo[i];
				viTri = i;
			}
		}
		System.out.println("Số lớn nhất: " + max + " Vị trí của nó là " + viTri);
	}

	public static int soAmDauTien(int[] mangSo, int n) {
		int soAm = 0;
		int viTri = 0;

		for (int i = 0; i < n; i++) {
			if (mangSo[i] < 0) {
				soAm = mangSo[i];
				viTri = i;
				break;
			}
		}
		if (soAm < 0) {
			System.out.println("Số âm đầu tiên: " + soAm + " Và vị trí i là: " + viTri);
		} else {
			System.out.println("Không có số âm trong mảng!");
		}
		return soAm;
	}

	public static void soAmLonNhat(int[] mangSo, int n, int soAm) {
		int soAmLonNhat = soAm;
		int viTri = 0;

		for (int j = 0; j < n; j++) {
			if (soAmLonNhat <= mangSo[j] && mangSo[j] < 0) {
				soAmLonNhat = mangSo[j];
				viTri = j;
			}
		}
		System.out.println("Số âm lớn nhất nằm ở vị trí: " + viTri + " Và có giá trị là: " + soAmLonNhat);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập số phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] mangSo = new int[n];
		nhapMang(mangSo, n);
		xuatMang(mangSo, n);
		soLonNhat(mangSo, n);
		int soAm = soAmDauTien(mangSo, n);
		soAmLonNhat(mangSo, n, soAm);
	}
}
