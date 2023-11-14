package FinalProject;

public class Director extends Personal {
    private double shares;
    public Director() {
		super();
		setDailySalary(300);
		setPosition("Director");
    }
    
    public void inputInforEmployee() {
    	super.inputInformationEmployee();
    	enter_Number_Working_Days();
    	calculates_Employee_Salary();
    	enter_Shares_In_Company();
    }
    public void outputInforEmployee() {
    	String format = "%-10s | %-20s | %-10s | %-10i | %-10.2f | %-10.2f\n";
    	System.out.printf(format, "Mã số", "Họ tên", "Số điện thoại", "Số ngày làm việc", "Lương một ngày", "Tính Lương: ");
    	System.out.printf(format, employeeID, fullName, phoneNumber, workingDays, dailySalary, calculates_Employee_Salary());
    }

	public Director(String employeeID, String fullName, String phoneNumber, int workingDays, double dailySalary) {
		this.setEmployeeID(employeeID);
		this.setFullName(fullName);
		this.setPhoneNumber(phoneNumber);
		this.setWorkingDays(workingDays);
		this.setDailySalary(dailySalary);
	}
	
	private void enter_Shares_In_Company() {
		System.out.println("Vui long nhap phan tram co phieu ban co: ");
		float percent_Of_Shares = Float.parseFloat(scanner.nextLine());
		while(true) {
			if(check.check_Voting_Percentage(percent_Of_Shares)) break;
			else percent_Of_Shares = Float.parseFloat(scanner.nextLine());
		}
	}

	public double getShares() {
        return shares;
    }

    public void setShares(double shares) {
        this.shares = shares;
    }
}