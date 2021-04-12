package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount swapAccount = new BankAccount();
	    BankAccount bobsAccount = new BankAccount("12345",2000,"swapnil","sappu@gmail.com","6477859034");
	    /*bobsAccount.setAccountNumber("12345SP");
	    bobsAccount.setCustomerName("Swapnil Patel");
	    bobsAccount.setBalance(0);
	    bobsAccount.setPhoneNumber("6477859034");
*/
        System.out.println(swapAccount.getEmail());
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getCustomerName());
        bobsAccount.withdrawal(100);
        bobsAccount.deposit(50);

        VipCustomer swapnil = new VipCustomer();
        System.out.println(swapnil.getCreditLimit());
        System.out.println(swapnil.getName());

        VipCustomer person2 = new VipCustomer(8000,"sappu@abc");
        System.out.println(person2.getCreditLimit());

        VipCustomer person3 = new VipCustomer("Swap",5000,"dsc@gmail");
        System.out.println(person3.getEmail());



    }
}
