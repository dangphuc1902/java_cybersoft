package demo_oop;

public class HocSinh extends NhanVien{
    protected String hoTen;
    String maSo;
    String lop;
    int tuoi;

    public void xuatThongTin(){
        System.out.println("Kiem tra ho ten: " + hoTen);
    }
}
