package homework_session_4_B1;

import java.text.DecimalFormat;
import java.util.Scanner;

/*	Viết chương trình nhập vào thông tin 1 mặt hàng Tên, số lượng, đơn giá. 
 * Tính và xuất tiền phải trả dựa theo quy tắc:
 * 		- Nếu mua với số lượng từ 50 đến 100 sẽ được giảm 8%,
 * 		- Nếu mua với số lượng trên 100 thì số lượng từ 100 trở đi sẽ được giảm 12%.
 * 
 * Phân tích và sơ đồ 3 block. 
 * 		- Đầu vào:
 * 			+ Thông tin 1 mặt hàng (Tên, số lượng, đơn giá)
 * 		- Phân tích nghiệp vụ:
 * 			+ Tính tiền theo các mức giá được discount theo số lượng với 3 trường hợp:
 * 				- Mua từ 1 - 49 sp: Không được giảm giá.
 * 				- Mua từ 50 - 100 sp: Được giảm giá 8%.
 * 				- Mua từ 101 trở đi sẽ được giảm 12 %.
 * 		- Đầu ra:
 * 			+ Số tiền cần thanh toán.
 * */
public class b5_issue_invoices {
	public static void calculate_Bill(String product_Name, int number_Of_Items, long unit_Price) {
		long total_Payment = 0;
		if(number_Of_Items <= 0 || unit_Price <= 0) {
			System.out.println("Thông tin mặt hàng không đúng vui lòng nhập lại!");
		}else {
			if(number_Of_Items > 0 && number_Of_Items < 50) {
				total_Payment = number_Of_Items * unit_Price;
			}else if(number_Of_Items >= 50 && number_Of_Items <=  100) {
				total_Payment = (number_Of_Items * unit_Price)* 8 / 100;
			}else if(number_Of_Items > 100) {
				total_Payment = (number_Of_Items * unit_Price)* 12 / 100;
			}
			DecimalFormat formatter = new DecimalFormat("###,###,###,###,###");
			System.out.println("Tổng số tiền phải trả cho đơn hàng này là: " + formatter.format(total_Payment));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập thông tin hàng hóa: ");
		System.out.println("Tên mặt hàng: ");
		String product_Name = sc.nextLine();
		System.out.println("Số lượng: ");
		int number_Of_Items = Integer.parseInt(sc.nextLine());
		System.out.println("Đơn giá: ");
		long unit_Price = sc.nextLong();
		calculate_Bill(product_Name, number_Of_Items, unit_Price);
	}
}
