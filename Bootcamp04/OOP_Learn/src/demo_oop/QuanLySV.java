package demo_oop;

import java.util.Scanner;

public class QuanLySV {
	// class trong java: Đại diện cho một đối tượng.
	// Biến khai báo bên trong đối tượng sẽ được gọi là thuộc tính.
	String hoTen;
	String maSV;
	double diemToan;
	double diemLy;
	double diemHoa;
	double diemTrungBinh;
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào họ tên sinh viên: ");
		hoTen = scanner.nextLine();
		System.out.println("Mời bạn nhập vào mã SV : ");
		maSV = scanner.nextLine();
		System.out.println("Mời bạn nhập vào điểm Toán : ");
		diemToan = scanner.nextDouble();
		System.out.println("Mời bạn nhập vào điểm Lý : ");
		diemLy = scanner.nextDouble();
		System.out.println("Mời bạn nhập vào điểm Hóa : ");
		diemHoa = scanner.nextDouble();
	}
	
	public double diemTrungBinh() {
		diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
		return diemTrungBinh;
	}
	public void xepLoatSV() {
		diemTrungBinh = diemTrungBinh();
		if(diemTrungBinh >= 9.0 && diemTrungBinh < 10.0) {
			System.out.println(" Xuất sắc ");
		}else if(9.0 > diemTrungBinh && diemTrungBinh >= 8.0) {
			System.out.println(" Giỏi ");
		} else if(8.0 > diemTrungBinh && diemTrungBinh >= 7.0) {
			System.out.println(" Khá ");
		}else if(7.0 > diemTrungBinh && diemTrungBinh >= 6.0) {
			System.out.println(" Trung bình khá ");
		}
		else if(6.0 > diemTrungBinh && diemTrungBinh >= 5.0) {
			System.out.println(" Trung bình ");
			}
		else if(5.0 > diemTrungBinh && diemTrungBinh > 0.0 ){
			System.out.println(" Yếu ");
		}
	}
	
	public void xuatThongTin() {
		System.out.println("Họ tên: " + hoTen + " Mã Sinh viên: " + maSV + " Điểm toán: " + diemToan + " Điểm Lý " + diemLy + " Điểm Hóa: " + diemHoa);
		System.out.println("Điểm trung bình: " + diemTrungBinh());
		System.out.println("Xếp loại: ");
		 xepLoatSV();
	}
}
