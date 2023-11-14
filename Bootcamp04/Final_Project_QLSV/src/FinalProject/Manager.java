package FinalProject;

import java.util.ArrayList;
public class Manager extends Personal {
    private int numberEmployee = 0;
    private ArrayList<Employee> listStaff;

    public Manager() {
        super();
        listStaff = new ArrayList<>();
        setDailySalary(200);
		setPosition("Manager");
    }

    @Override
    public void inputInformationEmployee() {
        super.inputInformationEmployee();
        enter_Number_Working_Days();
        calculates_Employee_Salary();
    }
	public Manager(String employeeID, String fullName, String phoneNumber, int workingDays, double dailySalary) {
		this.setEmployeeID(employeeID);
		this.setFullName(fullName);
		this.setPhoneNumber(phoneNumber);
		this.setWorkingDays(workingDays);
		this.setDailySalary(dailySalary);
	}
	

    @Override
    public double calculates_Employee_Salary() {
        return super.calculates_Employee_Salary() + 100 * listStaff.size();
    }

    public void receiving_Staff(Employee nv) {
    	listStaff.add(nv);
    	numberEmployee++;
        setNumberEmployee(getListStaff().size());
    	setNumberEmployee(numberEmployee);
    }

    public void eliminate_Employees(Employee nv) {
    	listStaff.remove(nv);
    	numberEmployee--;
//        setNumberEmployee(getListStaff().size());
    	setNumberEmployee(numberEmployee);
    }

    public ArrayList<Employee> getListStaff() {
        return listStaff;
    }

    public void setListStaff(ArrayList<Employee> ListStaff) {
        this.listStaff = ListStaff;
    }

	public int getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		this.numberEmployee = numberEmployee;
	}



}