package lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;
}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="Dodo";
        MyAccount.balance=12.24;

        YourAccount.id=2;
        YourAccount.name="D";
        YourAccount.balance=121.24;

        HisAccount.id=3;
        HisAccount.name="Ddo";
        HisAccount.balance=1.24;

        System.out.println(MyAccount.name);
    }
}