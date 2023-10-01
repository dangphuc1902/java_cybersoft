package cauDieuKien;

import java.util.Scanner;

/*
 * Hãy viết chương trình "Chào hỏi" các thành viên của gia đình có đặc điểm sau đây: 
 * Máy sẽ hỏi ai đang sử dụng máy. Sau đó căn cứ câu trả lời nhận được mà máy cần đưa ra một câu chào hợp lý. Giả sử trong gđ có 4 thành viên:
 * Bố(B), Mẹ(M), Anh trai (A), Em gái (E)
 * 		// Phân Tích:
 * 	đầu vào: Nhập vào B, M, A, E
 * 	Đầu ra: Lời chào cho từng thành viên.
 * 	Nghiệp vụ:
 * 		- Máy đưa ra câu hỏi về người đang sử dụng máy.
 * 		- Máy căn cứ vào kết quả là chữ cái đầu. 
 * 		- Đưa ra câu chào.
 * */
public class helloMemberInFamily {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Xin chào. Cho hỏi ai đang sử dụng máy này: ");
		 char member = sc.next().charAt(0);
		 switch (member) {
		case 'B': {
			 System.out.println("Xin chào Ông chủ (Bố) đã đăng nhập vào máy! Chúc bố có ngày mới tốt lành");
			 break;
		}
		case 'M':{
			System.out.println("Xin chào Bà chủ (Mẹ) đã đăng nhập vào máy! Chúc Mẹ có ngày mới tốt lành");
			break;
		}
		case 'A':{
			System.out.println("Xin chào Cậu chủ (Anh Trai)đã đăng nhập vào máy! Chúc Anh Trai có ngày mới tốt lành");
			break;
		}
		case 'E':{
			System.out.println("Xin chào Cô chủ (Em gái) đã đăng nhập vào máy! Chúc Em gái có ngày mới tốt lành");
			break;
		}
		default:
			System.out.println("Vui lòng nhập vào kí tự B M A E");
			break;
		 }
	}
}
