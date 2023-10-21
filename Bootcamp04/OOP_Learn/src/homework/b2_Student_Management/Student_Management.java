package homework.b2_Student_Management;

import java.util.Scanner;

class Student {
	private int maSV;
	private String hoten;
	private float diemLyThuyet;
	private float diemThucHanh;
	public Student(){}
	public Student(int maSV, String hoten, float diemLyThuyet, float diemThucHanh){
		this.maSV = maSV;
		this.hoten = hoten;
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [ Ma SV=" + maSV + "\nHo ten = " + hoten + "\nDiem Ly Thuyet = " + diemLyThuyet
				+ "\nDiem Thuc Hanh=" + diemThucHanh + "]";
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public float getDiemLyThuyet() {
		return diemLyThuyet;
	}
	public void setDiemLyThuyet(float diemLyThuyet) {
		this.diemLyThuyet = diemLyThuyet;
	}
	public float getDiemThucHanh() {
		return diemThucHanh;
	}
	public void setDiemThucHanh(float diemThucHanh) {
		this.diemThucHanh = diemThucHanh;
	}
	public float CalculateAverageScore(float diemLyThuyet, float diemThucHanh){
		return (diemLyThuyet + diemThucHanh)/2;
	}

}

public class Student_Management{
	// public void outputInformation(){

	// }
	public static void main(String[] args) {
			
		Student Student_01 = new Student(1, "DangTrongPhuc", 7.5f, 8.7f);
		Student Student_02 = new Student(1, "NguyenVanA", 7.8f, 8.2f);
		Student Student_03 = new Student();

		Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban ma SV: ");
        int maSv = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap ho ten SV: ");
        String hoTen = scanner.nextLine();
		// System.out.println();
        System.out.println("Moi ban nhap diemLT: ");
        float diemLT = scanner.nextFloat();
		System.out.println("Moi ban nhap diemTH: ");
        float diemTH = scanner.nextFloat();
		
		Student_03.setMaSV(maSv);	
		Student_03.setHoten(hoTen);
		Student_03.setDiemLyThuyet(diemLT);
		Student_03.setDiemThucHanh(diemTH);
		System.out.println("\nThong tin sinh vien 1:");
        System.out.println(Student_01.toString());
        System.out.println("Diem trung binh: " + Student_01.CalculateAverageScore(diemLT,diemTH));

        System.out.println("\nThong tin sinh vien 2:");
        System.out.println(Student_02.toString());
        System.out.println("Diem trung binh: " + Student_02.CalculateAverageScore(diemLT,diemTH));

        System.out.println("\nThong tin sinh vien 3:");
        System.out.println(Student_03.toString());
        System.out.println("Diem trung binh: " + Student_03.CalculateAverageScore(diemLT,diemTH));
	}
}