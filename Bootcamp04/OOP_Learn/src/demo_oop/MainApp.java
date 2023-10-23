package demo_oop;

public class MainApp {
    public static void main(String[] args) {

//        // Cách 1: Phương thức khởi tạo để gắn giá trị.
//        NhanVien nhanVien = new NhanVien("Nguyen Van A", 21, "Nam");
//        nhanVien.xuatThongTin();
//        // Cách 2: Sử dụng setter, getter.
//        NhanVien nhanVien2 = new NhanVien();
//        nhanVien2.setHoTen("Tran Van B");
//        System.out.println(nhanVien2.getHoTen());
//        nhanVien2.setTuoi(19);
//        nhanVien2.setGioiTinh("Nam");
//        nhanVien2.xuatThongTin();
//
//         HSLopPhoHocTap lopPhoHocTap = new HSLopPhoHocTap();
//         lopPhoHocTap.coGiuSoDauBai = true;
//         lopPhoHocTap.xuatThongTin();
//
//         LopTruong lopTruong = new LopTruong();
//         lopTruong.hoTen = "Nguyen Lop Truong";
//         lopTruong.coGiuSoDauBai = false;
//         lopTruong.mecCoGiao = true;
//         lopTruong.xuatThongTin();
//
//        HSLopPhoHocTap hocTap = new HSLopPhoHocTap();
//        hocTap.hoTen = "Nguyen Van A";
//        hocTap.xuatThongTin();
    	
    	// Tính đa hình: Lớp cha khởi tạo bằng lớp con(Cha dùng phương thức khởi tạo của con). Nhưng lớp con ko khởi tạo về lớp cha.  
//    	HocSinh hocSinh = new HSLopPhoHocTap();
//    	hocSinh.hoTen = "Dang Trong Phuc";
//    	HSLopPhoHocTap lopPhoHocTap = (HSLopPhoHocTap) hocSinh;
//    	lopPhoHocTap.coGiuSoDauBai = true;
//    	hocSinh.xuatThongTin();
    	// đối tượng sẽ tìm và ưu tiên thực thi phương thức ở bên con (new) thì nó sẽ được thực thi. 
    	// Kết quả chạy nó sẽ hiện thi chạy của Class cha trc, sau đó chạy tiếp hàm ở class con. 
    	
    	// sử dụng Interface để chỉ phải gọi tới hàm, không cần khởi tạo các biến
    	TinhNang lopTruong = new LopTruong();
    	lopTruong.xuatThongTin();
 
    }
}
