package bank;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount();
        BankAccount myAccount = new BankAccount();
        myAccount.setBankAccount(
                "12345",
                "banan@as.banas.com",
                "123-456-7890",
                400.00);
        System.out.println(myAccount.getAccountNum());
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getEmail());
        System.out.println(myAccount.getPhoneNum());
        System.out.println(myAccount.getBalance());
        myAccount.depositFunds(500.00);
        System.out.println(myAccount.getBalance());
        myAccount.withdrawFunds(560.00);
        myAccount.withdrawFunds(300.00);
        myAccount.withdrawFunds(40);
        myAccount.withdrawFunds(1);
        myAccount.depositFunds(600);

        System.out.println(myAccount.getAccountNum());

    }
}

