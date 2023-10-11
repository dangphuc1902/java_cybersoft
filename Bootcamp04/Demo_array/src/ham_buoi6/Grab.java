package ham_buoi6;
import java.util.Scanner;

public class Grab {

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     // Nhập liệu
    //     System.out.println("Chọn loại xe (1: Grab Car, 2: Grab SUV, 3: Grab Black): ");
    //     int loaiXe = scanner.nextInt();

    //     System.out.println("Nhập số kilômét đi được: ");
    //     double soKm = scanner.nextDouble();

    //     System.out.println("Nhập thời gian chờ (phút): ");
    //     int thoiGianCho = scanner.nextInt();

    //     // Xử lý tính tiền
    //     double tongTien = tinhTienGrab(loaiXe, soKm, thoiGianCho);

    //     // In hóa đơn chi tiết
    //     inHoaDonChiTiet(loaiXe, soKm, thoiGianCho, tongTien);
    // }
    // import java.text.DecimalFormat;
    // import java.util.Scanner;
    
    // public class InHoaDon {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Nhập tên khách hàng: ");
            String tenKhachHang = scanner.nextLine();
    
            System.out.print("Nhập địa chỉ khách hàng: ");
            String diaChiKhachHang = scanner.nextLine();
    
            System.out.print("Nhập số điện thoại khách hàng: ");
            String soDienThoaiKhachHang = scanner.nextLine();
    
            System.out.print("Nhập ngày in hóa đơn (dd/MM/yyyy): ");
            String ngayInHoaDon = scanner.nextLine();
    
            System.out.print("Nhập số lượng dịch vụ sử dụng: ");
            int soLuongDichVu = scanner.nextInt();
    
            // Tạo một mảng lưu trữ thông tin chi tiết các dịch vụ
            String[] chiTietDichVu = new String[soLuongDichVu];
            double[] giaTienDichVu = new double[soLuongDichVu];
    
            scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số lượng dịch vụ
    
            // Nhập thông tin chi tiết và giá tiền của từng dịch vụ
            for (int i = 0; i < soLuongDichVu; i++) {
                System.out.println("Nhập thông tin chi tiết và giá tiền của dịch vụ " + (i + 1) + ":");
                System.out.print("Chi tiết: ");
                chiTietDichVu[i] = scanner.nextLine();
                System.out.print("Giá tiền (VNĐ): ");
                giaTienDichVu[i] = scanner.nextDouble();
                scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập giá tiền
            }
    
            // Tính tổng giá tiền
            double tongGiaTien = 0;
            for (double giaTien : giaTienDichVu) {
                tongGiaTien += giaTien;
            }
    
            // In ra hóa đơn
            System.out.println("------------------------------");
            System.out.println("         HÓA ĐƠN DỊCH VỤ       ");
            System.out.println("------------------------------");
            System.out.println("Tên khách hàng: " + tenKhachHang);
            System.out.println("Địa chỉ: " + diaChiKhachHang);
            System.out.println("Số điện thoại: " + soDienThoaiKhachHang);
            System.out.println("Ngày in hóa đơn: " + ngayInHoaDon);
            System.out.println("------------------------------");
            System.out.println("STT  |  Chi tiết dịch vụ  |  Giá tiền (VNĐ)  ");
            System.out.println("------------------------------");
            for (int i = 0; i < soLuongDichVu; i++) {
                System.out.printf("%-5d |  %-18s |  %,.2f%n", (i + 1), chiTietDichVu[i], giaTienDichVu[i]);
            }
            System.out.println("------------------------------");
            System.out.printf("Tổng cộng: %,.2f VNĐ%n", tongGiaTien);
            System.out.println("------------------------------");
        }
    // }
    
    public static double tinhTienGrab(int loaiXe, double soKm, int thoiGianCho) {
        double giaKmDauTien;
        double giaKmTiepTheo;
        double giaKmVuot19;
        double giaCho;

        // Thiết lập giá cước dựa trên loại xe
        if (loaiXe == 1) { // Grab Car
            giaKmDauTien = 8000;
            giaKmTiepTheo = 7500;
            giaKmVuot19 = 8000;
            giaCho = 2000;
        } else if (loaiXe == 2) { // Grab SUV
            giaKmDauTien = 9000;
            giaKmTiepTheo = 8500;
            giaKmVuot19 = 9000;
            giaCho = 3000;
        } else { // Grab Black
            giaKmDauTien = 10000;
            giaKmTiepTheo = 9500;
            giaKmVuot19 = 9000;
            giaCho = 3500;
        }

        // Tính tiền dựa trên số kilômét và thời gian chờ
        double tongTien = giaKmDauTien + (soKm - 1) * giaKmTiepTheo;
        if (soKm > 19) {
            tongTien += (soKm - 19) * giaKmVuot19;
        }
        tongTien += thoiGianCho / 3 * giaCho;
        
        return tongTien;
    }

    public static void inHoaDonChiTiet(int loaiXe, double soKm, int thoiGianCho, double tongTien) {
        String tenLoaiXe;
        if (loaiXe == 1) {
            tenLoaiXe = "Grab Car";
        } else if (loaiXe == 2) {
            tenLoaiXe = "Grab SUV";
        } else {
            tenLoaiXe = "Grab Black";
        }

        System.out.println("Hóa đơn chi tiết:");
        System.out.println("Loại xe: " + tenLoaiXe);
        System.out.println("Số kilômét đi được: " + soKm + " km");
        System.out.println("Thời gian chờ: " + thoiGianCho + " phút");
        System.out.println("Tổng tiền: " + tongTien + " đồng");
    }
}
