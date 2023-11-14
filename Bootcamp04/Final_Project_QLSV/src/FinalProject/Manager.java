package FinalProject;

public class TruongPhong extends NhanVienCongTy{
	  private int soNhanVienDuoiQuyen;

	  public TruongPhong() {
	  }

	  public TruongPhong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, float luongMotNgay, String cachTinhLuong, int soNhanVienDuoiQuyen) {
	   super(maSo, hoTen, soDienThoai, soNgayLamViec, luongMotNgay, cachTinhLuong);
	   this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
	  }

	  public int getSoNhanVienDuoiQuyen() {
	   return soNhanVienDuoiQuyen;
	  }

	  public void setSoNhanVienDuoiQuyen(int soNhanVienDuoiQuyen) {
	   this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
	  }

	  @Override
	  public float tinhLuongThang() {
	   return super.tinhLuongThang() + (soNhanVienDuoiQuyen * 100000);
	  }

	  @Override
	  public String toString() {
	   return super.toString() +
	           ", Số nhân viên dưới quyền: " + soNhanVienDuoiQuyen;
	  }
}
