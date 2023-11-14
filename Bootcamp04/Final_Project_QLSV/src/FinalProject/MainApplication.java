package FinalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
	public static void main(String[] args) {
		Company company = new Company();
		Scanner scanner = new Scanner(System.in);
		company.setListPersonal(createDummyData());
		int choice = 0;
		do {
			System.out.println("\t==============---------- QUAN LY NHAN SU " + company.getCompanyName() + " ----------==============\t");
			System.out.println("\t1. Nhap thong tin cong ty.");
			System.out.println("\t2. Phan bo Nhan vien vao Truong Phong");
			System.out.println("\t3. Them, xoa thong tin mot nhan su.");
			System.out.println("\t4. Xuat ra thong tin toan bo nguoi trong cong ty. ");
			System.out.println("\t5. Tinh va xuat tong luong cho toan cong ty");
			System.out.println("\t6. Tim nhan vien thuong co luong cao nhat");
			System.out.println("\t7. Tim Truong Phong co so luong nhan vien duoi quyen nhieu nhat");
			System.out.println("\t8. Sap xep nhan vien toan cong ty theo thu tuc ABC");
			System.out.println("\t9. Sap xep nhan vien toan cong ty theo thu tu luong giam dam");
			System.out.println("\t10. Tim Giam Doc co so luong co phan nhieu nhat.");
			System.out.println("\t11. Tinh va Xuat tong THU NHAP cua tung Giam Doc");
			System.out.println("\t0. ==============---------- Thoat chuong trinh ----------============== \t");

			System.out.print("Vui long chon chuc nang (0-11): ");
			choice = Integer.parseInt(scanner.nextLine());

			switch (choice) {
			case 1:
                System.out.println("\t\t NHAP THONG TIN CONG TY: \t\t");
				company.inputCompanyInfo();
				break;
			case 2:
				System.out.println("\t\t PHAN BO NHAN VIEN VAO TRUONG PHUONG: \t\t");
				company.add_Employee_For_Manager();
				break;
			case 3:
				System.out.println("\t\t THEM HOAC XOA NHAN VIEN: \t\t");
				company.addOrRemoveEmployee();
				break;
			case 4:
				System.out.println("\t\t DANH SACH TOAN BO NHAN SU CUA CONG TY: \t\t");
				company.export_Infor_All_People_Company();
				break;
            case 5:
            	System.out.println("\t\t TONG LUONG TOAN CONG TY: " + company.Calculate_Export_Total_Salary_Entire_Company()+ " \t\t");
                break;
            case 6:
            	System.out.println("\t\t NHAN VIEN THUONG CO LUONG CAO NHAT: \t\t");
            	company.find_Employees_Highest_Salary();
                break;
            case 7:
            	System.out.println("\t\t TRUONG PHONG CO SO LUONG NHAN VIEN DUOI QUYEN NHIEU NHAT LA: \t\t");
            	company.find_Manager_With_Largest_Number_Employee();
                break;
            case 8:
            	System.out.println("\t\t DANH SACH NHAN VIEN TOAN CONG TY THEO THU TU TEN ABC: \t\t");
            	company.Arrange_Employee_By_Name_ABC();
                break;
            case 9:
            	System.out.println("\t\t DANH SACH NHAN VIEN TOAN CONG TY THEO THU TU LUONG GIAM DAN: \t\t");
            	company.Arrange_Employee_By_Salary_Descending();
                break;
            case 10:
            	System.out.println("\t\t GIAM DOC CO SO LUONG CO PHAN NHIEU NHAT: \t\t");
            	company.find_Director_Most_Shares();
                break;
            case 11:
            	System.out.println("\t\t TONG THU NHAP CUA TUNG GIAM DOC: \t\t");
            	company.total_Income_Each_Director();
                break;
			case 0:
				System.out.println("\t\t THOAT CHUONG TRINH \t\t");
				break;
			default:
				System.out.println("Vui long chon chuc nang hop le");
				break;
			}
		} while (choice != 0);

	}
	public static ArrayList<Personal> createDummyData() {
        ArrayList<Personal> dataBase = new ArrayList<>();

        Personal nv1 = new Employee();
        nv1.setEmployeeID("nv000001");
        nv1.setFullName("Nguyen Van Khang");
        nv1.setPhoneNumber("0325478165");
        nv1.setWorkingDays(23);
        nv1.setPosition("Employee");
        ((Employee)nv1).setId_Manager("nv000006");
        dataBase.add(nv1);

        Personal nv2 = new Employee();
        nv2.setEmployeeID("nv000002");
        nv2.setFullName("Hoang Thi Loan");
        nv2.setPhoneNumber("0325478456");
        nv2.setPosition("Employee");
        ((Employee)nv2).setId_Manager("nv000006");
        nv2.setWorkingDays(20);

        dataBase.add(nv2);

        Personal nv3 = new Manager();
        nv3.setEmployeeID("nv000003");
        nv3.setFullName("Le Van Bo");
        nv3.setPhoneNumber("0325478456");
        nv3.setWorkingDays(25);
        nv3.setPosition("Manager");


        dataBase.add(nv3);

        Personal nv4 = new Director();
        nv4.setEmployeeID("nv000004");
        nv4.setFullName("Le Hoang Dieu");
        nv4.setPhoneNumber("0325478456");
        nv4.setWorkingDays(12);
        nv4.setPosition("Director");
        ((Director)nv4).setShares(20);

        dataBase.add(nv4);

        Personal nv5 = new Employee();
        nv5.setEmployeeID("nv000005");
        nv5.setFullName("Nguyen Van Minh");
        nv5.setPhoneNumber("0325408165");
        nv5.setWorkingDays(23);
        nv5.setPosition("Employee");

        dataBase.add(nv5);

        Personal nv6 = new Manager();
        nv6.setEmployeeID("nv000006");
        nv6.setFullName("Le Van An");
        nv6.setPhoneNumber("0325478456");
        nv6.setWorkingDays(23);
        nv6.setPosition("Manager");

        dataBase.add(nv6);

        Personal nv7 = new Director();
        nv7.setEmployeeID("nv000007");
        nv7.setFullName("Bui Viet Phuc");
        nv7.setPhoneNumber("0325478456");
        nv7.setWorkingDays(20);
        nv7.setPosition("Director");

        ((Director)nv7).setShares(40);

        dataBase.add(nv7);

        return dataBase;
    }

}