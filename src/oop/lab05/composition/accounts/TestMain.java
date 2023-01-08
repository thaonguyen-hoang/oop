package oop.lab05.composition.accounts;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer (88 , "Tan Ah Teck" , 'm') ;
        System.out.println(customer1);

        System.out.println("id is: " + customer1.getId());
        System.out.println("name is: " + customer1.getName());
        System.out.println("gender is: " + customer1.getGender());

        Account account1 = new Account(101, customer1, 888.8);
        System.out.println(account1);

        account1.setBalance(999.9);
        System.out.println(account1);
        System.out.println("id is: " + account1.getId());
        System.out.println("customer is: " + account1.getCustomer());
        System.out.println("balance is: " + account1.getBalance());
        System.out.println("customer's name is: " + account1.getCustomerName());

        account1.deposit(500);
        System.out.println(account1);
        account1.withdraw(1000);
        System.out.println(account1);
        account1.withdraw(500);
        System.out.println(account1);
    }
}

