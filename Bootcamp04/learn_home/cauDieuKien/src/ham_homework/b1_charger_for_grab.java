package ham_homework;

import java.util.Scanner;
/* sơ đồ 3 khối:
 * - Đầu vào:
 * 		+ Loại Grab
 * 		+ số Km
 * 		+ Thời gian chờ.
 * - Nghiệp vụ:
 * 		+ Lấy dữ liệu người dùng chọn xe.
 * 		+ Lấy số KM người dùng nhập vào
 * 		+ Lấy thời gian chờ người dùng nhập vào
 * 		+ Xét loại xe
 * 		+ Xét số Km trong các điều kiện
 * 		+ Tính tiền tương ứng
 * 		+ Xuất tổng tiền.
 * - Đầu ra: 
 * 		+ Tổng phí
 * 		+ Chi tiết hóa đơn.
 * */
public class b1_charger_for_grab {
	public static void main(String[] args) {
		// Đầu vào:
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng chọn 1 trong 3 loại Grab bằng cách nhập 1,GrabCar: 2,GrabSUV ; 3,GrabBlack");
		int loaiXe = sc.nextInt();
		double giaKmDauTien = 0.0;
		double giaKmTu1den19 = 0.0;
		double giaKmTu19TroDi = 0.0;
		double giaChoThem = 0.0;
		switch (loaiXe) {
		case 1: {
			System.out.println("Bạn đã chọn xe Grab Car");
			giaKmDauTien = 8000;
			giaKmTu1den19 = 7500;
			giaKmTu19TroDi = 7000;
			giaChoThem = 2000;
			break;
		}
		case 2: {
			System.out.println("Bạn đã chọn xe Grab SUV");
			giaKmDauTien = 9000;
			giaKmTu1den19 = 8500;
			giaKmTu19TroDi = 8000;
			giaChoThem = 3000;
			break;
		}
		case 3: {
			System.out.println("Bạn đã chọn xe Grab Black");
			giaKmDauTien = 10000;
			giaKmTu1den19 = 9500;
			giaKmTu19TroDi = 9000;
			giaChoThem = 3500;
			break;
		}
		default:
			System.out.println("Không có loại xe bạn chọn. Hãy chọn lại xe bạn đi!");
			break;
		}
		System.out.println("Số km đi được: ");
		double soKm = sc.nextDouble();
		System.out.println("Nhập thời gian tài xế chờ: ");
		double thoiGianCho = sc.nextDouble();
		double tongTien = tinhTienGrab(soKm, thoiGianCho, loaiXe,giaKmDauTien,giaKmTu1den19,giaKmTu19TroDi,giaChoThem);
		System.out.println("Giá tiền grab car: " + tongTien);
		System.out.println("Hóa đơn chi tiết: ");
		inHoaDonChiTiet(soKm, thoiGianCho, loaiXe, giaKmDauTien, giaKmTu1den19, giaKmTu19TroDi, giaChoThem,tongTien);
	}
	public static double tinhTienGrab(double soKm, double thoiGianCho, int loaiXe,double giaKmDauTien, double giaKmTu1den19, double giaKmTu19TroDi, double giaChoThem) {
		double tongTien = 0.0;
		if(soKm > 0 && soKm < 1) {
			tongTien = (soKm * giaKmDauTien);
		}else if(soKm >= 1 && soKm < 19) {
			tongTien = giaKmDauTien + (soKm - 1) * giaKmTu1den19;
		}
		if(soKm >= 19) {
			tongTien = giaKmDauTien + 17 * giaKmTu1den19;
			tongTien += (soKm - 18) * giaKmTu19TroDi;
		}
		tongTien += (thoiGianCho * giaChoThem)/3;
		return tongTien;
		}	
	public static void inHoaDonChiTiet(double soKm, double thoiGianCho, int loaiXe,double giaKmDauTien, double giaKmTu1den19, double giaKmTu19TroDi, double giaChoThem, double tongTien) {
		double hoaDonKmDauTien = 0.0;
		
		System.out.println("======================================== CHI TIẾT HÓA ĐƠN ========================================");
		System.out.println("CHI TIẾT =================== SỬ DỤNG ================ ĐƠN GIÁ(1000Đ =============== THÀNH TIỀN(1000Đ)");
		if(soKm > 0 && soKm < 1) {
			hoaDonKmDauTien = (soKm * giaKmDauTien)/1000;
			System.out.println("KM đầu tiên ===================" + soKm + "===================" + giaKmDauTien + "===================" + hoaDonKmDauTien);			
		}else if(soKm >= 1 && soKm < 19) {
			hoaDonKmDauTien = giaKmDauTien / 1000;
			double hoaDonTien17KmTiep = ((soKm - 1) * giaKmTu1den19)/1000;			
			System.out.println("KM đầu tiên ===================" + 1 + "===================" + giaKmDauTien + "===================" + giaKmDauTien / 1000);			
			System.out.println("KM 1 đến 19 ===================" + (soKm - 1) + "===================" + giaKmTu1den19 + "===================" + hoaDonTien17KmTiep);			
		}else if(soKm >= 19) {
			hoaDonKmDauTien = giaKmDauTien / 1000;
			double hoaDonTien17KmTiep = 0.0;
			hoaDonTien17KmTiep = (17 * giaKmTu1den19) / 1000;
			double hoaDonTienTren19Km = ((soKm - 18) * giaKmTu19TroDi)/1000;
			System.out.println("KM đầu tiên =================== 1 ===================" + giaKmDauTien + "===================" + hoaDonKmDauTien);	
			System.out.println("KM 1 đến 19 =================== 17 ===================" + giaKmTu1den19 + "===================" + hoaDonTien17KmTiep);
			System.out.println("KM từ 19 trở đi ===================" + (soKm - 18) + "===================" + giaKmTu19TroDi + "===================" + hoaDonTienTren19Km);
		}
		double hoaDonTienChoDoi = ((thoiGianCho * giaChoThem)/3)/1000;
		System.out.println("Thời gian chờ: ===================" + thoiGianCho + "===================" + giaChoThem + "===================" + hoaDonTienChoDoi);
		System.out.println("Tổng tiền: " + tongTien);
	}
	
	
}
	
