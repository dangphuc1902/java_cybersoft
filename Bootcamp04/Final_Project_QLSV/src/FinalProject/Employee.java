package FinalProject;

public class Employee extends Personal{
	private String id_Manager = null;
	public Employee() {
		super();
    	setDailySalary(100);
		setPosition("Employee");

    }

	public Employee(String employeeID, String fullName, String phoneNumber, int workingDays, double dailySalary) {
		this.setEmployeeID(employeeID);
		this.setFullName(fullName);
		this.setPhoneNumber(phoneNumber);
		this.setWorkingDays(workingDays);
		this.setDailySalary(dailySalary);
    }

	public String getId_Manager() {
		return id_Manager;
	}
	public void setId_Manager(String id_Manager) {
		this.id_Manager = id_Manager;
	}
	public void inputInforEmployee() {
		// TODO Auto-generated method stub
		super.inputInformationEmployee();
    	enter_Number_Working_Days();
		calculates_Employee_Salary();
		
	} 
	public void outputInforEmployee() {
	    	System.out.printf("%-10s | %-20s | %-10s | %-10d | %-10.2f | %-10.2f\n", employeeID, fullName, phoneNumber, workingDays, dailySalary, calculates_Employee_Salary());
	    }
}