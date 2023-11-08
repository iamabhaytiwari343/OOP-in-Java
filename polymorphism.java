public class polymorphism {
    
}
public class Bank {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SA001", 1000.0, 2.5));
        accounts.add(new BankAccount("BA001", 500.0));

        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
        }
    }
}
