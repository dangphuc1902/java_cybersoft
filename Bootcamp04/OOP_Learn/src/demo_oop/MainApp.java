package demo_oop;

public class MainApp {
    public static void main(String[] args) {

        // Cách 1: Phương thức khởi tạo để gắn giá trị. 
        NhanVien nhanVien = new NhanVien("Nguyen Van A", 21, "Nam");
        nhanVien.xuatThongTin();
        // Cách 2: Sử dụng setter, getter.
        NhanVien nhanVien2 = new NhanVien();
        nhanVien2.setHoTen("Tran Van B");
        System.out.println(nhanVien2.getHoTen());
        nhanVien2.setTuoi(19);
        nhanVien2.setGioiTinh("Nam");
        nhanVien2.xuatThongTin();

        // HSLopPhoHocTap lopPhoHocTap = new HSLopPhoHocTap();
        // lopPhoHocTap.coGiuSoDauBai = true;
        // lopPhoHocTap.xuatThongTin();

        // LopTruong lopTruong = new LopTruong();
        // lopTruong.hoTen = "Nguyen Lop Truong";
        // lopTruong.coGiuSoDauBai = false;
        // lopTruong.mecCoGiao = true;
        // lopTruong.xuatThongTin();
    }
}
