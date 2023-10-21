package demo_oop;

public class NhanVien {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;

    // Hàm dùng lấy giá trị thuộc tính: getter
    public String getHoTen() {
        return hoTen;
    }

    // Hàm gán giá trị: setter
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;}
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    // Định nghĩa phương thức khởi tạo.
    // - Có thể định nghĩa được nhiều phương thức khởi tạo cho đối tượng. 
    // - OverLoading: Nhiều hàm có thể trùng tên nhưng khác nhau về số lượng tham số hoặc kiểu dữ liệu của tham số hoặc thứ tự tham số. 
    
    public NhanVien(String hoTen, int tuoi , String gioiTinh){
        this.hoTen = hoTen;     // NhanVien.hoTen = hoTen;      this. đại diện cho đối tượng của mình. 
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
    public NhanVien(){}
    public NhanVien(String hoTen,int tuoi){

    }
    public void xuatThongTin(){
        System.out.println("Ho ten: " + hoTen + " - tuoi: " + tuoi + " - gioi tinh: " + gioiTinh);
    }
}
