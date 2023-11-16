package array_homework;

import java.util.Scanner;

public class menuHomeWork {
	public static int[] nhapThongTin(int[] mangSo) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < mangSo.length; i++) {
			System.out.println("Nhập giá trị cho phần tử: " + i);
			// Gán giá trị cho phần tử duyệt được bằng giá trị người dùng nhập vào.
			mangSo[i] = scanner.nextInt();
		}
		return mangSo;
	}

	public static void tongCacSoDuong(int[] mangSo) {
		int tong = 0;
		for (int i = 0; i < mangSo.length; i++) {
			if (mangSo[i] > 0) {
				tong += mangSo[i];
			}
		}
		System.out.println("Tổng các số Dương trong mảng: " + tong);
	}

	public static void tongCacSoLe(int[] mangSo) {
		int tong = 0;
		for (int i = 0; i < mangSo.length; i++) {
			if (mangSo[i] % 2 != 0) {
				tong += mangSo[i];
			}
		}
		System.out.println("Tổng các số lẻ trong mảng: " + tong);
	}

	public static void demSoDuong(int[] mangSo) {
		int count = 0;
		for (int i = 0; i < mangSo.length; i++) {
			if (mangSo[i] > 0) {
				count++;
			}
		}
		System.out.println("Có tổng " + count + " số Dương ");
	}

	public static void timSoNhoNhat(int[] mangSo) {
		int min = mangSo[0];
		for (int i = 0; i < mangSo.length; i++) {
			if (min > mangSo[i]) {
				min = mangSo[i];
			}
		}
		System.out.println("Số bé nhất là: " + min);
	}

	public static void soDuongBeNhat(int[] mangSo) {
		int soDuong = 0;
		for (int i = 0; i < mangSo.length; i++) {
			if (mangSo[i] > 0)
				soDuong = mangSo[i];
		}
		int soDuongBeNhat = soDuong;
		for (int i = 0; i < mangSo.length; i++) {
			if (soDuongBeNhat > mangSo[i] && mangSo[i] > 0) {
				soDuongBeNhat = mangSo[i];
			}
		}
		System.out.println("Số bé nhất là: " + soDuongBeNhat);
	}

	public static void soChanCuoiCung(int[] mangSo) {
		int soChanCuoiCung = -1;
		for (int i = 0; i < mangSo.length; i++) {
			if (mangSo[i] % 2 == 0) {
				soChanCuoiCung = mangSo[i];
			}
		}
		if(soChanCuoiCung == -1) {
			System.out.println("Mảng không có giá trị chẵn " + soChanCuoiCung);			
		}else {
			System.out.println("Số chẵn cuối cùng trong mảng: " + soChanCuoiCung);			
		}
	}

	public static int soChanDauTien(int[] mangSo) {
		int soChanDauTien = -1;
		for (int i = 0; i < mangSo.length; i++) {
			if (mangSo[i] % 2 == 0) {
				soChanDauTien = mangSo[i];
				break;
			}
		}
		String ketQua = (soChanDauTien != -1) ? "Số chẵn đầu tiên trong mảng:" : "Không có giá trị chẵn: ";
		System.out.println(ketQua + soChanDauTien);
		return soChanDauTien;
	}

	public static boolean kiemTraSoNguyenTo(int number) {
		if (number < 2) {
			return false;
		}
		for (int j = 2; j <= Math.sqrt(number); j++) {
			if (number % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void soNguyenToDauTien(int[] mangSo) {
		int soNguyenToDauTien = -1;
		for (int i = 0; i < mangSo.length; i++) {
			if (kiemTraSoNguyenTo(mangSo[i])) {
				soNguyenToDauTien = mangSo[i];
				break;
			}
		}
		String ketQua = (soNguyenToDauTien == -1) ? "Không tìm thấy số nguyên tố trong mảng! " : "Số nguyên tố đầu tiên là: ";

		System.out.println(ketQua + soNguyenToDauTien);
	}
	
	public static void soDuongCuoiCung(int[] mangSo) {
		int soDuongCuoiCung = -1;
		for(int i = 0; i < mangSo.length; i++) {
			if(mangSo[i] > 0 ) {
				soDuongCuoiCung = mangSo[i];
			}
		}
		String ketQua = (soDuongCuoiCung == -1) ? "Không tìm thấy số dương cuối cùng trong mảng! " : "Số dương cuối cùng trong mảng là: ";

		System.out.println(ketQua + soDuongCuoiCung);		
	}
	
	public static void soChanNhoNhat(int[] mangSo) {
		int soChanNhoNhat = soChanDauTien(mangSo);
		for(int i = 0; i < mangSo.length; i++) {
			if(mangSo[i] % 2 == 0 && mangSo[i] < soChanNhoNhat) {
				soChanNhoNhat = mangSo[i];
			}
		}
		int ketQuaSoChanNhoNhat = (soChanNhoNhat % 2 == 0) ? soChanNhoNhat : -1;
		String textKetQua = (soChanNhoNhat % 2 == 0) ? "Số chẵn nhỏ nhất trong mảng là: " : "Không tìm  thấy số chẵn trong mảng";
		System.out.println(textKetQua + ketQuaSoChanNhoNhat);
	}
	public static void main(String[] args) {
		System.out.println("Mời bạn nhập số phần tử của mảng: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n < 0){
			System.out.println("Mời bạn nhập lại số phần tử mảng!, số phần tử nên lớn hơn 0.");
		}else {
		}
		int[] mangSo = new int[n];
		nhapThongTin(mangSo);
		while (true) {
			System.out.println("\n\n\t\t======================== Menu ========================");
			System.out.println("1. Tổng các số dương ");
			System.out.println("2. Tổng các số lẻ ");
			System.out.println("3. Đếm có bao nhiêu số dương ");
			System.out.println("4. Số nhỏ nhất trong mảng "); 
			System.out.println("5. Số dương nhỏ nhất trong mảng ");
			System.out.println("6. Số chẵn cuối cùng trong mảng 1 chiều các số nguyên.");
			System.out.println("7. Só chẵn đầu tiên trong mảng các số nguyên.");
			System.out.println("8. Số nguyên tố đầu tiên trong mảng 1 chiều các số nguyên.");
			System.out.println("9. Số dương cuối cùng trong mảng số nguyên.");
			System.out.println("10. Phần tử có giá trị chẵn nhỏ nhất trong mảng 1 chiều các số nguyên. ");
			System.out.println("\n\n\t\t ==================== END ====================");
			System.out.println("Nhập lựa chọn: ");
			int option = scanner.nextInt();

			switch (option) {
			case 0:{
				System.out.println("Kết thúc chương trình!");
				break;
			}
			case 1: {
				tongCacSoDuong(mangSo);
				break;
			}
			case 2: {
				tongCacSoLe(mangSo);
				break;
			}
			case 3: {
				demSoDuong(mangSo);
				break;
			}
			case 4: {
				timSoNhoNhat(mangSo);
				break;
			}
			case 5: {
				soDuongBeNhat(mangSo);
				break;
			}
			case 6: {
				soChanCuoiCung(mangSo);
				break;
			}
			case 7:{
				soChanDauTien(mangSo);
				break;
			}
			case 8:{
				soNguyenToDauTien(mangSo);
				break;
			}
			case 9:{
				soDuongCuoiCung(mangSo);
				break;
			}
			case 10:{
				soChanNhoNhat(mangSo);
				break;
			}
			default:
				System.out.println("Không có tính năng bạn chọn. Vui lòng chọn lại.");
				break;
			}
		}

	}
}
