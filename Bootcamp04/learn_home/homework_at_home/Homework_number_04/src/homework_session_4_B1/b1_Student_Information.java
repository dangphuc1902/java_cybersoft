package homework_session_4_B1;

import java.time.LocalDate;
import java.util.Scanner;
//import java.util.Scanner;

/*Nhập tên và năm sinh của 3 sinh viên. Hãy viết chương trình xuất ra tên và năm sinh của sinh viên trẻ nhất.
 *Tóm tắt:
 *	- Đầu vào:
 *		+ Nhập tên và năm sinh của 3 sinh viên. 
 *	- Nghiệp vụ:
 *		+ so sánh năm sinh của 3 sinh viên. Tìm ra năm sinh lớn nhất.
 *	- Đầu ra:
 *		+ Tên và năm sinh của sinh viên trẻ nhất. 
 * */

public class b1_Student_Information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập họ tên của SV1: ");
        String name_Student_1 = sc.nextLine();
        System.out.println("Mời bạn nhập năm sinh của SV1: ");
        int year_Student_1 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Mời bạn nhập họ tên của SV2: ");
        String name_Student_2 = sc.nextLine();
        System.out.println("Mời bạn nhập năm sinh của SV2");
        int year_Student_2 = Integer.parseInt(sc.nextLine());
         
        System.out.println("Mời bạn nhập họ tên của SV3: ");
        String name_Student_3 = sc.nextLine();
        System.out.println("Mời bạn nhập năm sinh của SV3");
        int year_Student_3 = Integer.parseInt(sc.nextLine());

        LocalDate now = LocalDate.now();
        int currentyear = now.getYear();

        if(year_Student_1 < 0 || year_Student_2 < 0 || year_Student_3 < 0  || year_Student_1 > currentyear || year_Student_2 > currentyear || year_Student_3 > currentyear) {
        	System.out.println("Năm sinh không hợp lệ. Vui lòng chạy lại và nhập đúng năm sinh!"); 
        }else {
        	if (year_Student_1 >= year_Student_2 && year_Student_1 >= year_Student_3) {
	            System.out.println("Họ Tên: " + name_Student_1);
	            System.out.println("Năm sinh : " + year_Student_1);
	        } else if (year_Student_2 >= year_Student_1 && year_Student_2 >= year_Student_3) {
	            System.out.println("Họ Tên: " + name_Student_2);
	            System.out.println("Năm sinh : " + year_Student_2);
	        } else {
	            System.out.println("Họ Tên: " + name_Student_3);
	            System.out.println("Năm sinh : " + year_Student_3);
	        }
        }
    }
}
