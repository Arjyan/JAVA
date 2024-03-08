public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount arjyan = new BankAccount();

        arjyan.setAccountNumber(3890134890l);
        arjyan.setCustomerName("ARJYAN");
        arjyan.setEmail("arjyan@wipro");
        arjyan.setPhoneNumber(8598833797l);

        arjyan.depositingFunds(3904);
        arjyan.withdrawingFunds(1000);
        arjyan.withdrawingFunds(2500.49);
        arjyan.depositingFunds(5000);
        arjyan.depositingFunds(20020);

        arjyan.withdrawingFunds(50000);

        // System.out.println("Customer name is "+arjyan.getCustomerName());
        // System.out.println("Account number is "+arjyan.getAccountNumber());
        // System.out.println("Account balance is "+arjyan.getAccountBalance()+"/-");
        // System.out.println("Email address "+arjyan.getEmail());
        // System.out.println("phone number "+arjyan.getPhoneNumber());

    }
}