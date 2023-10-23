package OOP_homework;

public class outOfTownTrip extends inner_city_bus implements tinhNang {
	 private String noiDen;
	 private int soNgayDiDuoc;
	 
	 public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	@Override
	public double tinhDoanhThu() {
		// TODO Auto-generated method stub
		 System.out.println("Doanh thu cua chuyen xe ngoai thanh: "); 
		 return 1000000 * soNgayDiDuoc;
	}
	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		System.out.println("Ma so chuyen: " + maSoChuyen + " ho Ten tai xe: " + hoTenTaiXe + " So xe: " + soXe + " noi den: " + getNoiDen() + " so ngay di duoc " + getSoNgayDiDuoc() );
		tinhDoanhThu();
	}
}
