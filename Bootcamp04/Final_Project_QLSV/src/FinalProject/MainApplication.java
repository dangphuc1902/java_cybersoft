package FinalProject;
import java.util.Scanner;

public class MainApplication { public static void main(String[] args) { QuanLyNhanSu quanLyNhanSu = new QuanLyNhanSu("ABC QuanLyNhanSu", "123456789", 1000000);

	NhanVienThuong employee1 = new NhanVienThuong("EMP001", "John Doe", "1234567890", 22, 50, null, 0);
    NhanVienThuong employee2 = new NhanVienThuong("EMP002", "Jane Smith", "0987654321", 20, 45, null, 0);
    TruongPhong manager1 = new TruongPhong("MGR001", "David Johnson", "9876543210", 25, 60, null, 5);
    TruongPhong manager2 = new TruongPhong("MGR002", "Sarah Williams", "0123456789", 23, 55, null, 3);
    GiamDoc director1 = new GiamDoc("DIR001", "Michael Brown", "6789012345", 24, 70, null, 10);

//    QuanLyNhanSu.addEmployee(employee1);
//    QuanLyNhanSu.addEmployee(employee2);
//    QuanLyNhanSu.addEmployee(manager1);
//    QuanLyNhanSu.addEmployee(manager2);
//    QuanLyNhanSu.addEmployee(director1);

    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
        System.out.println("----- MENU -----");
        System.out.println("1. Print all employees");
        System.out.println("2. Calculate total salary");
        System.out.println("3. Find highest paid employee");
        System.out.println("4. Find manager with most employees");
        System.out.println("5. Sort employees by name");
        System.out.println("6. Sort employees by salary");
        System.out.println("7. Find director with most shares");
        System.out.println("8. Calculate and print director income");
        System.out.println("9. Add new employee");
        System.out.println("10. Remove employee");
        System.out.println("11. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

//        switch (choice) {
//            case 1:
//                QuanLyNhanSu.printAllEmployees();
//                break;
//            case 2:
//                double totalSalary = QuanLyNhanSu.calculateTotalSalary();
//                System.out.println("Total Salary: " + totalSalary);
//                break;
//            case 3:
//                Employee highestPaidEmployee = QuanLyNhanSu.findHighestPaidEmployee();
//                System.out.println("Highest Paid Employee: " + highestPaidEmployee.getFullName());
//                break;
//            case 4:
//                Manager managerWithMostEmployees = QuanLyNhanSu.findManagerWithMostEmployees();
//                System.out.println("Manager with Most Employees: " + managerWithMostEmployees.getFullName());
//                break;
//            case 5:
//                QuanLyNhanSu.sortEmployeesByName();
//                QuanLyNhanSu.printAllEmployees();
//                break;
//            case 6:
//                QuanLyNhanSu.sortEmployeesBySalary();
//                QuanLyNhanSu.printAllEmployees();
//                break;
//            case 7:
//                Director directorWithMostShares = QuanLyNhanSu.findDirectorWithMostShares();
//                System.out.println("Director with Most Shares: " + directorWithMostShares.getFullName());
//                break;
//            case 8:
//                QuanLyNhanSu.calculateAndPrintDirectorIncome();
//                break;
//            case 9:
//                // Add new employee logic
//                break;
//            case 10:
//                // Remove employee logic
//                break;
//            case 11:
//                System.out.println("Exiting program...");
//                break;
//            default:
//                System.out.println("Invalid choice. Please try again.");
//                break;
//        }
    } while (choice != 11);
}
}