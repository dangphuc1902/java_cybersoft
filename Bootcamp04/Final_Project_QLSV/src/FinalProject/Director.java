package FinalProject;

public class GiamDoc extends NhanVienCongTy {
    private int soCoPhan;

    public GiamDoc() {
    }

    public GiamDoc(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, float luongMotNgay, String cachTinhLuong, int soCoPhan) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec, luongMotNgay, cachTinhLuong);
        this.soCoPhan = soCoPhan;
    }

    public int getSoCoPhan() {
        return soCoPhan;
    }

    public void setSoCoPhan(int soCoPhan) {
        this.soCoPhan = soCoPhan;
    }

    @Override
    public float tinhLuongThang() {
        return super.tinhLuongThang() + (soCoPhan * 1000000);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Số cổ phần: " + soCoPhan;
    }
}
