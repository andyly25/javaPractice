package com.ajl;

public class Main {

    public static void main(String[] args) {

        // a constructor is created for you from the start
        // Note: (String accountNumber, double balance, String customerName, String email, String PhoneNumber)
        BankAccount mines = new BankAccount("123412", 11111, "Bob McSchnieder",
                "yolo@hasme.moc", "12231232");

//        mines.setBalance(11000);
//        mines.setAccountNumber("1122334455");
//        mines.setCustomerName("Bob Schnieder");
//        mines.setEmail("applejack@hook.moc");
//        mines.setPhoneNumber("1112229999");

        System.out.println("balance is: " + mines.getBalance() + ", account num: " + mines.getAccountNumber() +
            ", customer name: " + mines.getCustomerName() + ", e-mail: " + mines.getEmail() + ", phone:" +
            mines.getPhoneNumber());

        mines.withdraw(12000);
        mines.deposit(3000);
        mines.withdraw(2000);

        // test using another constructor


        BankAccount bobAccount = new BankAccount("Tom", "Bobby@asd.xig", "1234");
        System.out.println(bobAccount.getAccountNumber() + " Name " + bobAccount.getCustomerName() );

        VipCustomer sam = new VipCustomer();
        System.out.println(sam.getName());

        VipCustomer vip2 = new VipCustomer("Sam", 800000);
        System.out.println(vip2.getName());
    }
}
