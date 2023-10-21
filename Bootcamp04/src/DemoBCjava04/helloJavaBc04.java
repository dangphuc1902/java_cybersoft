package DemoBCjava04;

import java.util.Scanner;
// Viết chương trình nhập tháng, năm. Hãy cho biết tháng đó có bao nhiêu ngày.
public class helloJavaBc04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final String TEXT_NHAP_NAM = "Mời bạn nhập năm: ";
		final String TEXT_NHAP_THANG = "Mời bạn nhập tháng: ";
		final String TEXT_THANG = " Tháng ";
		final String TEXT_SO_NGAY_1 = " có 31 ngày ";
		final String TEXT_SO_NGAY_2 = " có 30 ngày ";
		final String TEXT_SO_NGAY_3 = " có 29 ngày ";
		final String TEXT_SO_NGAY_4 = " có 28 ngày ";
		
		System.out.println(TEXT_NHAP_THANG);
		int thang = scanner.nextInt();
		System.out.println(TEXT_NHAP_NAM);
		int nam = scanner.nextInt();
		String ketQua = "";
		// Lấy số ngày trong tháng: 
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			ketQua = "Tháng " + thang + " có 31 ngày ";
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:
			ketQua = "Tháng " + thang + " có 30 ngày ";
			break;
		case 2:
			if(nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
				ketQua =  "Tháng " + thang + " có 29 ngày ";
			}else {
				ketQua =  "Tháng " + thang + " có 28 ngày ";
			}
			break;
		default:
			System.out.println("Tháng bạn nhập không đúng, vui lòng nhập lại! ");
		}
		System.out.println(ketQua);
		
	}

}
