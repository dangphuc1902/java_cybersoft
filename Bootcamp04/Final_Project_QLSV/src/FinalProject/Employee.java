package FinalProject;

public class NhanVienThuong extends NhanVienCongTy {
    private float luongThuong;
    private TruongPhong truongPhong;
    public NhanVienThuong() {
    }

    public NhanVienThuong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, float luongMotNgay, String cachTinhLuong, float luongThuong, TruongPhong truongPhong) {
        super();
        this.luongThuong = luongThuong;
        this.truongPhong = null;
    }

    public float getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(float luongThuong) {
        this.luongThuong = luongThuong;
    }
    public TruongPhong getTruongPhong() {
        return truongPhong;
    }
    
    public void setTruongPhong(TruongPhong truongPhong) {
        this.truongPhong = truongPhong;
    }
    
    @Override
    public float tinhLuongThang() {
        return super.tinhLuongThang() + luongThuong;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Lương thưởng: " + luongThuong;
    }
}
