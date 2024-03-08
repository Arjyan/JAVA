public class BankAccount {
    private double accountNumber = 0;
    private double accountBalance = 0;
    private String customerName = "";
    private String email = "";
    private long phoneNumber = 0;

    public void depositingFunds(double depositAmount) {
        try {
            if (depositAmount <= 0) {
                System.out.println(depositAmount + " Can not be deposited please Enter a valid amount.");
            } else {
                accountBalance += depositAmount;
                accountBalance=Math.floor(accountBalance * 100) / 100;
                System.out.println("Deposited amount " + depositAmount + " New balance is " + accountBalance);
            }

        } catch (NumberFormatException e) {
            System.out.println("Charecter not supported.");
        }

    }

    public void withdrawingFunds(double withdrawingAmount) {
        try {
            if ((accountBalance - withdrawingAmount) < 0) {
                System.out.println(
                        "Insufficient Balance, You have only can withdraw Rs" + accountBalance + "/- in your account.");
            } else {
                accountBalance -= withdrawingAmount;
                accountBalance=Math.floor(accountBalance * 100) / 100;
                System.out.println("Rs " + withdrawingAmount
                        + "/- Withdrawed from your account New account balance is Rs " + accountBalance + "/-");
            }
        } catch (NumberFormatException e) {
            System.out.println("Charecter not supported please Enter a valid number to withdraw");
        }

    }

    // Setting private variable through setter method
    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // closing starter.

    // Getting all the private variable.
    public double getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    // closing getter.

}
