package demo_oop;

//import demo_oop.homework.quanLySinhVien;
import java.text.DecimalFormat;

class Account {
    private long accountNumber;
    private String accountName;
    private double balance;
    
    private static final double INTEREST_RATE = 0.035;
    
    public Account() {
        // constructor mặc định
    }
    
    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 50;
    }
    
    public long getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getAccountName() {
        return accountName;
    }
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp tiền thành công!");
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
    }
    
    public void withdraw(double amount, double fee) {
        if (amount > 0 && amount + fee <= balance) {
            balance -= (amount + fee);
            System.out.println("Rút tiền thành công!");
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc không đủ số dư!");
        }
    }
    
    public void calculateInterest() {
        balance += balance * INTEREST_RATE;
        System.out.println("Đáo hạn thành công!");
    }
    
    public void transfer(Account destinationAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            destinationAccount.deposit(amount);
            System.out.println("Chuyển khoản thành. công!");
        } else {
            System.out.println("Số tiền chuyển khoản không hợp lệ hoặc không đủ số dư!");
        }
    }
    
    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        return "Số tài khoản: " + accountNumber +
                "\nTên tài khoản: " + accountName +
                "\nSố tiền trong tài khoản: " + decimalFormat.format(balance) + " VND";
    }
}
public class demo_oop {

//	public static void main(String[] args) {
//		// Khởi tạo đối tượng bằng "new"
//		NhanVien nhanVienA = new NhanVien();
//		// Gán giá trị cho thuộc tính bên trong.
//		nhanVienA.hoTen = "Nguyen Van A";
//		nhanVienA.tuoi = 21;
//		nhanVienA.gioiTinh = " Nam";
//		
//		NhanVien nhanVienB = new NhanVien();
//		nhanVienB.hoTen = "Nguyen Van B";
//		nhanVienB.tuoi = 32;
//		nhanVienB.gioiTinh = " Nữ";
//		
//		// Gọi phương thức(method của class)
//		nhanVienA.xuatThongTin();
		
		
//		HinhChuNhat HinhChuNhatA = new HinhChuNhat();
//		HinhChuNhatA.nhapThongTin();
////		HinhChuNhatA.chieuDai = 6.6;
////		HinhChuNhatA.chieuRong = 5.2;
//		
//		HinhChuNhat HinhChuNhatB = new HinhChuNhat();
//		HinhChuNhatB.nhapThongTin();
////		HinhChuNhatB.chieuDai = 4.4;
////		HinhChuNhatB.chieuRong = 3.1;
//		
//		HinhChuNhatA.xuatThongTin();
//		HinhChuNhatB.xuatThongTin();
		
//		QuanLySV QuanLySVA = new QuanLySV(); 
//		// QuanLySVA.gioiTinh = "Nam";
//		
//		QuanLySVA.nhapThongTin();
//		QuanLySVA.xuatThongTin();
		
//		import java.text.DecimalFormat;
//
		
		public static void main(String[] args) {
			 Account account1 = new Account(123456789, "Nguyen Van A");
		        System.out.println(account1.toString());
		        
		        account1.deposit(1000000);
		        System.out.println(account1.toString());
		        
		        account1.withdraw(500000, 5000);
		        System.out.println(account1.toString());
		        
		        account1.calculateInterest();
		        System.out.println(account1.toString());
		        
		        Account account2 = new Account(987654321, "Nguyen Thi B");
		        System.out.println(account2.toString());
		        
		        account1.transfer(account2, 200000);
		        System.out.println(account1.toString());
		        System.out.println(account2.toString());
		}
}
