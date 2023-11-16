package OOP_homework;
class inner_city_bus extends trip_management implements tinhNang{
	
	private int soTuyen;
	private int soKmdiduoc;

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKmdiduoc() {
		return soKmdiduoc;
	}

	public void setSoKmdiduoc(int soKmdiduoc) {
		this.soKmdiduoc = soKmdiduoc;
	}

	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		System.out.println("Ma so chuyen: " + maSoChuyen + " ho Ten tai xe: " + hoTenTaiXe + " So xe: " + soXe + " so tuyen: " + getSoTuyen() + " so km di duoc " + getSoKmdiduoc() );
		tinhDoanhThu();
	}

	@Override
	public double tinhDoanhThu() {
		// TODO Auto-generated method stub
		System.out.println("Tong doanh thu chuyen xe noi thanh");
		return 100000* soKmdiduoc;
	}
}

//abstract class outOfTownTrip extends inner_city_bus implements tinhNang {
//
//}
public abstract class trip_management implements tinhNang {
	protected int maSoChuyen;
	protected String hoTenTaiXe;
	protected int soXe;
	protected double doanhThu;
	public int getMaSoChuyen() {
		return maSoChuyen;
	}
	public void setMaSoChuyen(int maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}
	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public static void main(String[] args) {
		inner_city_bus inner_city = new inner_city_bus();
		inner_city.setHoTenTaiXe("Nguyen van A");
		inner_city.setMaSoChuyen(104);
		inner_city.setSoKmdiduoc(100);
		inner_city.xuatThongTin();
		
		outOfTownTrip outOfTownTrip = new outOfTownTrip();
		outOfTownTrip.setHoTenTaiXe("Nguyen van A");
		outOfTownTrip.setMaSoChuyen(104);
		outOfTownTrip.setSoKmdiduoc(100);
		outOfTownTrip.xuatThongTin();
		
	}
}


