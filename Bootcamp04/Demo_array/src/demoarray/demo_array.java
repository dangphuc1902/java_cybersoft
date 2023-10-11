package demoarray;

import java.util.Scanner;

public class demo_array {
	public static void main(String[] args) {
		// Cú pháp: kiểu dữ liệu[] tên biến = new int[số ô lưu trữ dữ liệu];
		// số ô lưu trữ dữ liệu: phần tử mảng. 
		
//		int[] mangSO = new int[5];
//		// Vị trí mỗi ô bắt đầu bằng số: 0 - 1 -2 - 3 - 4.
//		int [] numStudents = {1,2,3,4,5};
//		// Gán giá tị cho phần tử trong mảng : tên_biến[vị trí] = giá trị;
//		mangSO[0] = 5;	// Gán giá trị cho mảng ở vị trí số 0.
//		mangSO[4] = 3;
//		
		// Xuất vị trí
//		System.out.println(mangSO[0] + mangSO[4]);
		
		// Khi chưa gán giá trị thì giá trị mặc định cho nó sẽ là số 0 hoặc chuỗi rỗng " "
		
//		int [] mangSo = {1,3,5,7,9};// Các ô trống tạo ra được gọi là phần tử.
//		int tong = 0;
//		for(int i = 0; i < mangSo.length;i++) {
//			tong += mangSo[i];
//		}
//		System.out.println("Giá trị tổng: " + tong);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui lòng nhập số phần tử của mảng: ");
		
		int n = scanner.nextInt();
		// Khai báo nhập số phần tử cho mảng. ví dụ n = 10 thì tạo ra mảng 10 phần tử. 
		int [] mangSo = new int[n];
		
		// Nhập từng giá trị cho mảng.(Duyệt qua từng phần tử của mảng và gán giá trị cho các phần tử) 
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập giá trị cho phần tử: " + i);
			// Gán giá trị cho phần tử duyệt được bằng giá trị người dùng nhập vào.
			mangSo[i] = scanner.nextInt();
		}
		System.out.println("Giá trị của mảng: " + "{" + mangSo + "}");
		int tong = 0;
		// Tính tổng. Duyệt lại mảng mà người dùng đã nhập được trước đó và tính tổng, 
		for(int j = 0; j < n;j++) {
			tong += mangSo[j];
		}
		System.out.println("Tổng của mảng là: " + tong);
	}
}
	