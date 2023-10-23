package homework.b3_DataOfABCBank;

import java.text.DecimalFormat;

/**
 * AccountOfABCBank
 */
class AccountOfABCBank {
    private long accountNumber;
    private String accountName;
    private double moneyNumber;
    private double accountMoneyInput;
    private double WithdrawalCharges;
    private final double interestRate = 0.035;

    public AccountOfABCBank() {
    }

    public AccountOfABCBank(long accountNumber, String accountName) {
        this.moneyNumber = 50000;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    DecimalFormat formatter = new DecimalFormat("###,###,###.00 VND");

    public AccountOfABCBank(long accountNumber, String accountName, double moneyNumber) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.moneyNumber = moneyNumber;
    }

    public double getWithdrawalCharges() {
        return WithdrawalCharges;
    }

    public void setWithdrawalCharges(double withdrawalCharges) {
        WithdrawalCharges = withdrawalCharges;
    }

    public double getAccountMoneyInput() {
        return accountMoneyInput;
    }

    public void setAccountMoneyInput(double accountMoneyInput) {
        this.accountMoneyInput = accountMoneyInput;
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

    public double getMoneyNumber() {
        return moneyNumber;
    }

    public void setMoneyNumber(double moneyNumber) {
        this.moneyNumber = moneyNumber;
    }

    @Override
    public String toString() {
        return "AccountOfABCBank: accountNumber= " + accountNumber + ", accountName= " + accountName + ", moneyNumber= "
                + formatter.format(moneyNumber) + " VND ";
    }

    public void accountMoneyInput(double accountMoneyInput) {
        if (accountMoneyInput > 0) {
            moneyNumber += accountMoneyInput;
            System.out.println("Nap tien thanh cong! " + formatter.format(accountMoneyInput));
        } else {
            System.out.println(" So tien nap vao khong hop le! ");
        }
    }

    public void accountMoneyOutput(double accountMoneyOutput, double WithdrawalCharges) {
        if (accountMoneyOutput > 0 && accountMoneyOutput + WithdrawalCharges < moneyNumber) {
            moneyNumber -= (accountMoneyOutput + WithdrawalCharges);
            System.out.println("Rut tien thanh cong! Ban da rut: " +  formatter.format(accountMoneyOutput + WithdrawalCharges));
            System.out.println("So du hien tai: " +formatter.format(moneyNumber) );
        } else {
            System.out.println("So tien ban rut khong hop le, hoac so du khong du");
        }
    }

    public void calculateInterest() {
        if (moneyNumber >= 1000) {
        double interest = moneyNumber * interestRate;
        moneyNumber += interest;
        System.out.println("Dao han thanh cong! Da them " + formatter.format(interest) + " lai vao so tai khoan: " + accountNumber);
        System.out.println("So tien hien tai: " + formatter.format(moneyNumber)); 
    } else {
        System.out.println("Khong the them lai vao so tai khoan " + accountNumber + " voi so du nho hon 1000");
    }
    }

    public void transfer(AccountOfABCBank destinationAccount, double accountMoneyInput) {
        if (accountMoneyInput > 0 && accountMoneyInput <= moneyNumber) {
            moneyNumber -= accountMoneyInput;
            destinationAccount.accountMoneyInput(accountMoneyInput);
            System.out.println("Chuyen khoan thanh cong! Toi so tai khoan: " + destinationAccount.accountNumber + " So tien chuyen khoan thanh cong la: "  + formatter.format(accountMoneyInput));
            System.out.println("So tien hien tai trong tai khoan cua " + accountName + " la: " + formatter.format(moneyNumber));
        } else {
            System.out.println("So tien chuyen khoan khong hop le! ");
        }
    }
}

public class DataOfABCBank {
    public static void main(String[] args) {
        AccountOfABCBank account1 = new AccountOfABCBank(123456789, " Nguyen Van An: ");
        System.out.println(account1.toString());
        AccountOfABCBank account2 = new AccountOfABCBank(123412345, "Dang Trong Phuc");
        
        
        
        account1.accountMoneyInput(1000000);
        System.out.println(account1.toString());
        account1.accountMoneyOutput(530000, 5500);
        account1.calculateInterest();
        account1.transfer(account2, 500000);
        System.out.println(account2.toString());
        
        account2.accountMoneyInput(3000000);
        System.out.println(account2.toString());
        account2.accountMoneyOutput(555555, 1100);
        account2.calculateInterest();
        account2.transfer(account1, 500000);
        System.out.println(account2.toString());

    }
}
