package FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Company {
	private String companyName;
	private String taxCode;
	private double monthlyRevenue = 100000;
	private static final Scanner scanner = new Scanner(System.in);
	protected List<Personal> listPersonal;
	private final check_Conditions check = new check_Conditions();

	public List<Personal> getListPersonal() {
		return listPersonal;
	}

	public void setListPersonal(List<Personal> listPersonal) {
		this.listPersonal = listPersonal;
	}
	
	public Company() {
		listPersonal = new ArrayList<>();
	}

	public Company(String companyName, String taxCode, double monthlyRevenue, ArrayList<Personal> listPersonal) {
		this.companyName = companyName;
		this.taxCode = taxCode;
		this.monthlyRevenue = monthlyRevenue;
		this.listPersonal = listPersonal;
	}

//	function 1: enter company information.
	public void inputCompanyInfo() {
		input_Name_Company();
		input_Tax_Code();
		enter_Monthly_Revenue();
		System.out.println("THONG TIN CONG TY: ");
		exportCompanyInfor(scanner);

	}

	private void input_Name_Company() {
		System.out.println("Moi ban nhap ten cong ty: ");
		companyName = scanner.nextLine();
		while (true) {
			if (check.checkEmptyString(companyName))
				break;
			else {
				System.out.println("Vui long nhap lai ten cong ty: ");
				companyName = scanner.nextLine();
				setCompanyName(companyName);
			}
		}
	}

	private void input_Tax_Code() {
		System.out.println("Moi ban nhap ma so thue: ");
		taxCode = scanner.nextLine();
		while (true) {
			if (check.checkSizeString(taxCode, 10) && check.CheckIfStringIsNumber(taxCode))
				break;
			else {
				System.out.println("Vui long nhap lai ma so thue: ");
				taxCode = scanner.nextLine();
				setTaxCode(taxCode);
			}
		}
	}

	private void enter_Monthly_Revenue() {
		System.out.println("Vui long nhap doanh thu thang: ");
		double monthly_Revenue = Double.parseDouble(scanner.nextLine());
		setMonthlyRevenue(monthly_Revenue);
	}

	// In thông tin công ty lên màn hình.
	public void exportCompanyInfor(Scanner scanner) {
		System.out.println("\t\t\t===========----- THONG TIN CONG TY -----===========\t\t\t");
		System.out.println("\t\t\tTen: " + this.companyName + "\t\t\t");
		System.out.println("\t\t\tMaSoThue: " + this.taxCode + "ơ\t\t\t");
		System.out.println("\t\t\tDoanh thu: " + String.format("%10.0f", this.monthlyRevenue) + "\t\t\t");
		System.out.println("\t\t\t===========-----  -----===========\t\t\t");
	}

	// Function 2: Allocate employees to department heads
	public void add_Employee_For_Manager() {
		list_Employees_Not_Manager();
		System.out.println("Vui long nhap Id nhan vien can duoc phan bo cho cac Truong Phong: ");
		String IDEmployee = scanner.nextLine();
		Employee staff_Found = (Employee) find_Employee_By_ID(IDEmployee);
		if (staff_Found == null)
			System.out.println("\t Khong tim thay nhan vien thuong co ID la: " + IDEmployee);
		else {
			list_Manager();
			System.out.println("\t Vui long nhap ma trương phong duoc phan bo nhan vien: \t");
			String IDmanager = scanner.nextLine();
			Manager manager_Found = (Manager) find_Manager_By_ID(IDmanager);
			if (manager_Found == null) {
				System.out.println("\t Khong tim thay truong phong co ID la: " + IDmanager);
			} else {
				staff_Found.setId_Manager(IDmanager);
				manager_Found.receiving_Staff(staff_Found);
			}
		}
	}

	// The list of employees does not have a manager
	private void list_Employees_Not_Manager() {
		System.out.println("\t DANH SACH NHAN VIEN THUONG CO QUAN LY: \t");
		System.out.printf("%-10s | %-20s | %-10s | %-10s\n", "Ma So", "Ho Ten", "SDT", "Ma TrPh");
		for (Personal employee : listPersonal) {
			if (employee instanceof Employee) {
				System.out.printf("%-10s | %-20s | %-10s | %-10s\n", employee.getEmployeeID(), employee.getFullName(),
						employee.getPhoneNumber(), ((Employee) employee).getId_Manager());
			}
		}
	}

	private void list_Manager() {
		System.out.println("\t DANH SACH TRUONG PHONG \t");
		System.out.printf("%-10s | %-20s | %-10s\n", "Ma So", "Ho Ten", "SDT");
		for (Personal employee : listPersonal)
			if (employee instanceof Manager)
				System.out.printf("%-10s | %-20s | %-10s\n", employee.getEmployeeID(), employee.getFullName(),
						employee.getPhoneNumber());
	}

	// Find Employee by ID to add listMananger.
	private Personal find_Employee_By_ID(String id_Staff) {
		for (Personal staff : listPersonal)
			if (staff instanceof Employee && staff.getEmployeeID().equalsIgnoreCase(id_Staff)) {
				System.out.println("Da tim thay: " + staff.employeeID + " " + staff.fullName );
				return staff;}
		return null;
	}

	private Personal find_Manager_By_ID(String id_Staff) {
		for (Personal staff : listPersonal)
			if (staff instanceof Manager && staff.getEmployeeID().equalsIgnoreCase(id_Staff)) {	
				System.out.println("Da tim thay: " + staff.employeeID + " " + staff.fullName );
				return staff;
			}
		return null;
	}
	
	

	// Function 3: Add, delete information of an employee
	public void addOrRemoveEmployee() {
		Personal employee_To_Add = null;
		int lua_Chon = 0;
		System.out.println("\t\t\t Vui long nhap su lua chon cua ban: \t\t\t");
		System.out.println("\t\t\t 1. Them nhan vien thuong. \t\t\t");
		System.out.println("\t\t\t 2. Them Truong phong. \t\t\t");
		System.out.println("\t\t\t 3. Them Giam doc. \t\t\t");
		System.out.println("\t\t\t 4. Xoa nhan vien. \t\t\t");
		System.out.println("\t\t\t Vui long nhap vao lua chon: \t\t\t");
		lua_Chon = Integer.parseInt(scanner.nextLine());
		switch (lua_Chon) {
		case 1: {
			add_New_Employee(employee_To_Add);
			break;
		}
		case 2: {
			add_New_Manager(employee_To_Add);
			break;
		}
		case 3: {
			add_New_Director(employee_To_Add);
			break;
		}
		case 4: {
			delete_Employee(employee_To_Add);
			break;
		}
		default:
			System.out.println("Khong co loai chuc nang nay!");
			break;
		}
	}

	// Thêm nhân viên thường
	private void add_New_Employee(Personal employee_To_Add) {
		employee_To_Add = new Employee();
		((Employee) employee_To_Add).inputInforEmployee();
		if (Check_Employee_Exist(employee_To_Add)) {
			System.out.println("\t\t\tNhan vien co ma ID: " + employee_To_Add.getEmployeeID() + " da ton tai.! \t\t\t");
			System.out.println("\n\t\t\tKhong the them nhan vien nay! \t\t\t");
		} else {
			listPersonal.add(employee_To_Add);
		}
	}

	// Thêm nhân viên quản lý
	private void add_New_Manager(Personal employee_To_Add) {
		employee_To_Add = new Manager();
		((Manager) employee_To_Add).inputInformationEmployee();
		if (Check_Employee_Exist(employee_To_Add)) {
			System.out.println(
					"\t\t\tTruong phong co ma ID: " + employee_To_Add.getEmployeeID() + " da ton tai.! \t\t\t");
			System.out.println("\n\t\t\tKhong the them Truong phong nay! \t\t\t");
		} else {
			listPersonal.add(employee_To_Add);
		}
	}

	// Thêm Giám đốc
	private void add_New_Director(Personal employee_To_Add) {
		employee_To_Add = new Director();
		((Director) employee_To_Add).inputInforEmployee();
		if (Check_Employee_Exist(employee_To_Add)) {
			System.out.println("\t\t\tGiam doc co ma ID: " + employee_To_Add.getEmployeeID() + " da ton tai.! \t\t\t");
			System.out.println("\t\t\tKhong the them Giam doc nay! \t\t\t");
		} else {
			listPersonal.add(employee_To_Add);
		}
	}

	// Xóa một nhân viên.
	private void delete_Employee(Personal employee_To_Add) {
		System.out.println("\t\t\t Vui long nhap ID nhan su can xoa: \t\t\t");
        String ID_Employee_Delete = scanner.nextLine();
        Personal employee_Needs_Delete = find_Employee_By_ID_Employee(ID_Employee_Delete);
        if(employee_Needs_Delete == null) {
            System.out.println("Khong tim thay nhan su co ma " + ID_Employee_Delete);
        } else {
            if(employee_Needs_Delete instanceof Manager) {
            	delete_Manager((Manager) employee_Needs_Delete);
            } else if (employee_Needs_Delete instanceof Employee) {
            	delete_Employee((Employee) employee_Needs_Delete);
            } else {
            	delete_Director((Director) employee_Needs_Delete);
            }
        }
	}	
    private Personal find_Employee_By_ID_Employee(String maNV) {
        for (Personal personal: listPersonal)
            if(personal.getEmployeeID().equalsIgnoreCase(maNV))
                return personal;
        return null;
    }

    private void delete_Manager(Manager manager) {
            for (Personal personal: listPersonal)
                if(personal instanceof Employee && ((Employee) personal).getId_Manager() != null && ((Employee) personal).getId_Manager().equalsIgnoreCase(manager.getEmployeeID()))
                    ((Employee) personal).setId_Manager(null);
        listPersonal.remove(manager);
    }

    private void delete_Employee(Employee staff) {
        if(staff.getId_Manager() != null) {
            Manager manager_department = (Manager) find_Manager_By_ID(staff.getId_Manager());
            if (manager_department != null)
            	manager_department.eliminate_Employees(staff);
        }
        listPersonal.remove(staff);
    }

    private void delete_Director(Director director) {
        listPersonal.remove(director);
    }

	// Function 4: Export information about all people in the company.
	public void export_Infor_All_People_Company() {
		System.out.printf("%-10s | %-14s | %-10s | %-10s | %-10s | %-10s | %-10s\n","Employee ID", "Full Name", "Phone Number", "Number workingday","Position", "Daily Salary", "SalaryOf Month");
		for (Personal employee : listPersonal) {
			employee.prints_Employee_Infor();
			}
	}
	
	// Function 5: Calculate and export total salary for the entire company.
	public double Calculate_Export_Total_Salary_Entire_Company() {
		double total_Salary_Company = 0;
		for (Personal personal : listPersonal) {
			total_Salary_Company += personal.calculates_Employee_Salary();
		}
		return total_Salary_Company;
	}

	// Function 6: Find Employees who usually have the highest salary.
	public void find_Employees_Highest_Salary() {

		String format = "%-10s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s\n";
		System.out.printf(format, "Employee ID", "Full Name", "Phone Number", "Working Days","Position" ,"Salary Basic", "Food Received");
		for (Personal personal : listPersonal) {
			if (personal instanceof Employee
					&& ((Employee) personal).calculates_Employee_Salary() == highest_Salary_Of_Employee()) {
				personal.prints_Employee_Infor();
			}
		}
		System.out.println("\t\t\t Nhan vien nay thuong co so tien luong cao nhat la:  " + highest_Salary_Of_Employee()
				+ "\t\t\t");
	}

	public double highest_Salary_Of_Employee() {
		double highest_Salary_Of_Employee = 0.0;
		for (Personal personal : listPersonal) {
			if (personal instanceof Employee
					&& ((Employee) personal).calculates_Employee_Salary() > highest_Salary_Of_Employee) {
				highest_Salary_Of_Employee = personal.calculates_Employee_Salary();
			}
		}
		return highest_Salary_Of_Employee;
	}

	// Function 7: Find the Department Head with the largest number of employees
	// under him
	public void find_Manager_With_Largest_Number_Employee() {
	    String format = "%-10s | %-19s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s\n";
	    System.out.printf(format, "Employee ID ", "Full Name", "Phone Number", "Working day", "Position","Salary Basic", "Received", "Number Employee");
	    
	    int maxEmployees = 0;
	    String managerWithMostEmployees = "";

	    for (Personal personal : listPersonal) {
	        if (personal instanceof Manager) {
	            Manager manager = (Manager) personal;
	            int employeeCount = countEmployeesUnderManager(manager.getEmployeeID());

	            if (employeeCount > maxEmployees) {
	                maxEmployees = employeeCount;
	                managerWithMostEmployees = manager.getEmployeeID();
	            }
	        }
	    }

	    // Now, print the manager information who has the most employees
	    for (Personal personal : listPersonal) {
	        if (personal instanceof Manager && ((Manager) personal).getEmployeeID().equals(managerWithMostEmployees)) {
	            personal.prints_Employee_Infor();
	        }
	    }
	}
	
	public int countEmployeesUnderManager(String managerID) {
	    int count = 0;

	    for (Personal personal : listPersonal) {
	        if (personal instanceof Employee) {
	            Employee employee = (Employee) personal;
	            String empManagerID = employee.getId_Manager();

	            if (empManagerID != null && empManagerID.equals(managerID)) {
	                count++;
	            }
	        }
	    }

	    return count;
	}

	
	// Function 8: Arrange company-wide employees alphabetically.
	public void Arrange_Employee_By_Name_ABC() {
		Collections.sort(listPersonal,
				(employee1, employee2) -> employee1.get_User_Name().compareTo(employee2.get_User_Name()));
		export_Infor_All_People_Company();
	}

//	Function 9: Arrange employees throughout the company in descending order of salary	
	public void Arrange_Employee_By_Salary_Descending() {
		Collections.sort(listPersonal, (employee1,
				employee2) -> (int) (employee2.calculates_Employee_Salary() - employee1.calculates_Employee_Salary()));
		export_Infor_All_People_Company();
	}

	// Function 10: Find the director with the most shares.
	public void find_Director_Most_Shares() {
		String format = "%-10s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s\n";
	    System.out.printf(format, "Employee ID ", "Full Name", "Phone Number", "Working day", "Position","Salary Basic", "Received");
		for (Personal personal : listPersonal) {
            if(personal instanceof Director && ((Director)personal).getShares() == most_Shares_Percent()) {
				personal.prints_Employee_Infor();
			}
		}
		System.out.println("Phan tram co phan cao nhat la: " + most_Shares_Percent());
	}

	public double most_Shares_Percent() {
		double most_Shares_Percent = 0;
		for (Personal personal : listPersonal) {
			if (personal instanceof Director && ((Director) personal).getShares() > most_Shares_Percent) {
				most_Shares_Percent = ((Director) personal).getShares();
			}
		}
		return most_Shares_Percent;
	}

	// Function 11: Calculate and export the total income of each director.
	public void total_Income_Each_Director() {
		System.out.printf("%-10s | %-20s | %-10s | %-10s\n", "Director ID", "Full Name", "Phone Number", "income");
		for (Personal personal : listPersonal) {
			if (personal instanceof Director) {
				System.out.printf("%-10s | %-20s | %-10s |%-10.2f\n", personal.getEmployeeID(), personal.getFullName(),
						personal.getPhoneNumber(), personal.calculates_Employee_Salary() + ((Director) personal).getShares() / 100 * company_Profits());
			}
		}
	}
	public double company_Profits() {
		return getMonthlyRevenue() - Calculate_Export_Total_Salary_Entire_Company();
	}

	public boolean Check_Employee_Exist(Personal checkStaff) {
		for (Personal staff : listPersonal)
			// equalsIgnoreCase: compares two ID strings without regard to upper and lower case.
			if (staff.getEmployeeID().equalsIgnoreCase(checkStaff.getEmployeeID()))
				return true;
		return false;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public double getMonthlyRevenue() {
		return monthlyRevenue;
	}

	public void setMonthlyRevenue(double monthlyRevenue) {
		this.monthlyRevenue = monthlyRevenue;
	}

}
