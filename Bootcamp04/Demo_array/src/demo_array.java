
public class demo_array {
	public static void main(String[] args) {
		// Cú pháp: kiểu dữ liệu[] tên biến = new int[số ô lưu trữ dữ liệu];
		// số ô lưu trữ dữ liệu: phần tử mảng. 
		
		int[] mangSO = new int[5];
		// Vị trí mỗi ô bắt đầu bằng số: 0 - 1 -2 - 3 - 4.
		
		// Gán giá tị cho phần tử trong mảng : tên_biến[vị trí] = giá trị;
		mangSO[0] = 5;	// Gán giá trị cho mảng ở vị trí số 0.
		mangSO[4] = 3;
		
		// Xuất vị trí
		System.out.println(mangSO[0] + mangSO[4]);
		
		// Khi chưa gán giá trị thì giá trị mặc định cho nó sẽ là số 0 hoặc chuỗi rỗng " "
	}
}
	