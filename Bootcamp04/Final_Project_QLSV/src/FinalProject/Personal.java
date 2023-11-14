package FinalProject;
import java.util.Scanner;

public abstract class Personal extends Company{
	protected static final Scanner scanner = new Scanner(System.in);
	protected static final check_Conditions check = new check_Conditions();
	protected String employeeID;
	protected String fullName;
	protected String phoneNumber;
	protected int workingDays = 0;
	protected double dailySalary = 0.0;
	protected static int working_Month = 10;
	protected static int years_Of_Work = 2023;
	protected String position;

	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	// Xuất thông tin nhân viên: 
	public Personal() {
		
	}

// 	Nhập thông tin nhân viên.
	public void inputInformationEmployee() {
		input_ID_Employee();
		input_Name_Employee();
		input_Phone_Number();
	}
	private void input_ID_Employee() {
		System.out.println("Nhap ID nhan vien: ");
		String employeeID = scanner.nextLine();
		while (true) {
			if (check.checkSizeString(employeeID, 8)) {
				break;
			} else {
				System.out.println("Vui long nhap lai ma ID nhan vien: ");
				employeeID = scanner.nextLine();
			}
		}
		setEmployeeID(employeeID);
	}
	private void input_Name_Employee() {
		System.out.println("Nhap ho ten: ");
		String fullName = scanner.nextLine();
		while (true) {
			if (check.checkEmptyString(fullName)) {
				break;
			} else {
				System.out.println("Vui long nhap lai ma fullName nhan vien: ");
				fullName = scanner.nextLine();
			}
		}
		setFullName(fullName);
	}
	private void input_Phone_Number() {
	
		System.out.println("Nhap so dien thoai: ");
		String phoneNumber = scanner.nextLine();
		while (true) {
			if (check.CheckIfStringIsNumber(phoneNumber) && check.checkSizeString(phoneNumber, 10)) {
				break;
			} else {
				System.out.println("Vui long nhap lai ma SDT nhan vien: ");
				phoneNumber = scanner.nextLine();
			}
		}
		setPhoneNumber(phoneNumber);
	}
	// Nhap so ngay lam viec
	protected void enter_Number_Working_Days() {
		System.out.println("Vui long nhap so ngay lam viec cua thang: " + getWorking_Month()  + " nam: " + getYears_Of_Work());
		int number_Working_Day = Integer.parseInt(scanner.nextLine());
		while(true) {
			if(check.check_Working_Days(number_Working_Day, getWorking_Month(), getYears_Of_Work())) 
				break;
			else
				number_Working_Day = Integer.parseInt(scanner.nextLine());
		}
		setWorkingDays(number_Working_Day);
	}

	public void prints_Employee_Infor() {
		System.out.printf("%-11s | %-20s | %-10s | %-15d | %-10s | %-10.2f  | %-10.2f\n", employeeID, fullName, phoneNumber, workingDays,position, dailySalary, calculates_Employee_Salary());
	}	

	
	public String get_User_Name() {
		String[] fullName = getFullName().split(" ");
        return fullName[fullName.length-1];
	}
	
	// Cách tính lương. 
	public double calculates_Employee_Salary () {
		return getDailySalary() * getWorkingDays();
	}
	public static int getWorking_Month() {
		return working_Month;
	}
	public static void setWorking_Month(int working_Month) {
		Personal.working_Month = working_Month;
	}
	public static int getYears_Of_Work() {
		return years_Of_Work;
	}
	public static void setYears_Of_Work(int years_Of_Work) {
		Personal.years_Of_Work = years_Of_Work;
	}
	// Lấy tên nhân viên
	public String getNameEmployee() {
		String[] fullName = getFullName().split(" "); 
		return fullName[fullName.length-1];
	}

	public Personal(String employeeID, String fullName, String phoneNumber, int workingDays, double dailySalary) {
		this.employeeID = employeeID;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.workingDays = workingDays;
		this.dailySalary = dailySalary;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public double getDailySalary() {
		return dailySalary;
	}

	public void setDailySalary(double dailySalary) {
		this.dailySalary = dailySalary;
	}


}
