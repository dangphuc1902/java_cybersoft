package FinalProject;

import java.util.ArrayList;

public class QuanLyNhanSu {
    private String tenCongTy;
    private String maSoThue;
    private float doanhThuThang;
    private ArrayList<NhanVienCongTy> danhSachNhanVien;

    public QuanLyNhanSu() {
        setDanhSachNhanVien(new ArrayList<>());
    }

    public QuanLyNhanSu(String tenCongTy, String maSoThue, float doanhThuThang) {
        this.tenCongTy = tenCongTy;
        this.maSoThue = maSoThue;
        this.doanhThuThang = doanhThuThang;
        setDanhSachNhanVien(new ArrayList<>());
    }
    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public float getDoanhThuThang() {
        return doanhThuThang;
    }

    public void setDoanhThuThang(float doanhThuThang) {
        this.doanhThuThang = doanhThuThang;
    }

	public ArrayList<NhanVienCongTy> getDanhSachNhanVien() {
		return danhSachNhanVien;
	}

	public void setDanhSachNhanVien(ArrayList<NhanVienCongTy> danhSachNhanVien) {
		this.danhSachNhanVien = danhSachNhanVien;
	}
}
