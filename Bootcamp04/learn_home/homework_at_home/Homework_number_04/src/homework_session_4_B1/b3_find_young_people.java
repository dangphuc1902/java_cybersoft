package homework_session_4_B1;

import java.time.LocalDate;
import java.util.Scanner;

/*Cho biết tên, năm sinh và giới tính của 3 cán bộ. Hãy viết chương trình tìm và in tên cán bộ Nam trẻ nhất
 * Phân tích bài toán:
 * 	- Đầu vào:
 * 		+ Nhập tên, năm sinh và giới tính của 3 can bộ.
 * 	 - Nghiệp vụ:
 * 		+ Tìm kiếm cán bộ có giới tính là Nam.
 * 		+ So sánh năm sinh của các cán bộ đó. Tìm ra cán bộ nam trẻ nhất.
 *  - Đầu ra:
 * 		+ In ra tên của cán bộ Nam trẻ nhất.
 * */
public class b3_find_young_people {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập thông tin của cán bộ: ");
		
		System.out.println("Tên của cán bộ A: ");
		String name_Person_A = sc.nextLine();
		System.out.println("Năm sinh của cán bộ A: ");
		int year_Person_A = Integer.parseInt(sc.nextLine());
		System.out.println("Giới tính của cán bộ A: ");
		String gender_Person_A = sc.nextLine();
		
		System.out.println("Tên của cán bộ B: ");
		String name_Person_B = sc.nextLine();
		System.out.println("Năm sinh của cán bộ B: ");
		int year_Person_B = Integer.parseInt(sc.nextLine());
		System.out.println("Giới tính của cán bộ B: ");
		String gender_Person_B = sc.nextLine();
		
		System.out.println("Tên của cán bộ C: ");
		String name_Person_C = sc.nextLine();
		System.out.println("Năm sinh của cán bộ C: ");
		int year_Person_C = Integer.parseInt(sc.nextLine());
		System.out.println("Giới tính của cán bộ C: ");
		String gender_Person_C = sc.nextLine();
		
        LocalDate now = LocalDate.now();
        int currentyear = now.getYear();
        String gender_New_A = gender_Person_A.toLowerCase();
        String gender_New_B = gender_Person_B.toLowerCase();
        String gender_New_C = gender_Person_C.toLowerCase();
        
		if(gender_New_A.equals("nam") || gender_New_B.equals("nam") || gender_New_C.equals("nam")) {
	        if(year_Person_A < 0 || year_Person_B < 0 || year_Person_C < 0  || year_Person_A > currentyear || year_Person_B > currentyear || year_Person_C > currentyear) {
	        	System.out.println("Năm sinh không hợp lệ. Vui lòng chạy lại và nhập đúng năm sinh!"); 
	        }else {
	        	if (year_Person_A >= year_Person_B && year_Person_A >= year_Person_C) {
		            System.out.println("Họ Tên: " + name_Person_A + "  là cán bộ Nam trẻ tuổi nhất ");
		        } else if (year_Person_B >= year_Person_A && year_Person_B >= year_Person_C) {
		            System.out.println("Họ Tên: " + name_Person_B + " là cán bộ Nam trẻ tuổi nhất");
		        } else {
		            System.out.println("Họ Tên: " + name_Person_C  + " là cán bộ Nam trẻ tuổi nhất");
		        }
	        }
		}else {
			System.out.println("Không có cán bộ Nam nào được nhập vào. Vui lòng xem lại dữ liệu nhập vào!");
		}
	}
}
