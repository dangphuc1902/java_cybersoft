package cauDieuKien;
// Viết chương trình cho phép nhập vào số nguyên có hai chữ số. Hãy in ra cách đọc của số nguyên này. 
/*
 * Tóm tắt:
 * 	Thông tin nhập vào:
 * 		Nhập số nguyên a gồm 2 chữ số.
 * 	Thông tin cần xuất:
 * 		Cách đọc số nguyên vừa nhập.
 * 	
 * 	Nghiệp vụ:
 * 		- tách ra số hàng chục và số hàng đơn vị.
 * 		- Kiểm tra từng số và gán chuỗi cách đọc cho từng số.		
 * */
import java.util.Scanner;

public class howtoread {	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập số nguyên có hai chữ số: ");
		int soA = sc.nextInt();
		int donVi = soA % 10;
		int soHangChuc = soA / 10;
		String hangChuc = "";
		switch (soHangChuc) {
		case 1: {
			hangChuc = " Mười";
			break;
		}
		case 2: {
			hangChuc = " Hai mươi";
			break;
		}
		case 3: {
			hangChuc = " Ba mươi";
			break;
		}
		case 4: {
			hangChuc = " Bốn mươi";
			break;
		}
		case 5: {
			hangChuc = " Năm mươi";
			break;
		}
		case 6: {
			hangChuc = " Sáu mươi";
			break;
		}
		case 7: {
			hangChuc = " Bảy mươi";
			break;
		}
		case 8: {
			hangChuc = " Tám mươi";
			break;
		}
		case 9: {
			hangChuc = " Chín mươi";
			break;
		}
		default:
			break;
		}
		
		String hangDonVi= "";
		switch (donVi) {
		case 0: {
			hangDonVi = " Không ";
			break;
		}
		case 1: {
			if(soHangChuc > 1) {
				hangDonVi = "Mốt";
			}
			hangDonVi = " Một ";
			break;
		}
		case 2: {
			hangDonVi = " Hai ";
			break;
		}
		case 3: {
			hangDonVi = " Ba";
			break;
		}
		case 4: {
			hangDonVi = " Bốn ";
			break;
		}
		case 5: {
			if(soHangChuc > 1) {
				hangDonVi = " Lăm ";
			}
			hangDonVi = "Năm";
			break;
		}
		case 6: {
			hangDonVi = " Sáu ";
			break;
		}
		case 7: {
			hangDonVi = " Bảy ";
			break;
		}
		case 8: {
			hangDonVi = " Tám ";
			break;
		}
		case 9: {
			hangDonVi = " Chín";
			break;
		}
		default:
			break;
		}
		System.out.println("Cách đọc " + soA + " là: " + hangChuc + hangDonVi);
	}
}
