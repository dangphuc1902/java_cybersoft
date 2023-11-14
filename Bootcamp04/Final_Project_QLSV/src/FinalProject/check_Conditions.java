package FinalProject;

public class check_Conditions {
	public  boolean checkEmptyString(String chuoi) {
	    if(chuoi.isEmpty()) {
            System.out.println("Chuoi nhap vao khong duoc de trong, nhap lai:");
            return false;
        } else return true;
    }
	public boolean checkSizeString(String chuoi, int size) {
		if(chuoi.length() == size) {
			return true;			
		}else {
			System.out.println("Ban nhap vao chua dung!");
			System.out.println("Vui long xem lai chieu dai cua ban, Chuoi nhap vao phai co do dai: " + size + " ki tu. Vui long nhap lai.");
			return false;
		}
	}

    public boolean check_Voting_Percentage(float ptCoPhieu) {
        if(ptCoPhieu >= 0 && ptCoPhieu <= 100) return true;
        else {
            System.out.println("Phan tram co phieu trong khoang 0 - 100");
            return false;
        }
    }
	
	public boolean CheckIfStringIsNumber(String inputString) {
	    // Kiểm tra xem chuỗi đầu vào có phải là một số không
	    if (inputString == null || inputString.equals("")) {
	        // Nếu chuỗi là null hoặc rỗng, in ra thông báo lỗi và trả về giá trị false
	        System.out.println("Chuỗi là giá trị null hoặc không chứa ký tự, vui lòng nhập lại:");
	        return false;
	    }
	    try {
	        // Cố gắng chuyển đổi chuỗi thành một số long
	        long numericValue = Long.parseLong(inputString);
	        // Nếu chuyển đổi thành công, trả về giá trị true
	        return true;
	    } catch (NumberFormatException e) {
	        // Nếu xảy ra lỗi NumberFormatException, đây là do chuỗi chứa ký tự không phải số.
	        // In ra thông báo lỗi và trả về giá trị false
	        System.out.println("Chuỗi chứa ký tự không phải số, vui lòng nhập lại:");
	        return false;
	    }
	}
	
	public boolean check_Working_Days(int soNgayLamViec, int thang, int nam) {
        int soNgayCuaThang = DateInMonth(thang, nam);
        if(soNgayLamViec >= 0 && soNgayLamViec <= soNgayCuaThang) return true;
        else {
            System.out.println("So ngay lam viec cua thang " + thang + " tu 0 - " + soNgayCuaThang + ", nhap lai:");
            return false;
        }
    }

    private int DateInMonth(int thang, int nam) {
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) return 29;
                else return 28;
            default:
                return -1;
        }
    }

}
