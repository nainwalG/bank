package com.company;

import com.company.bankA.Account;
import com.company.bankA.User;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    private  static List<Account> accountsList = new ArrayList<Account>();

    public static void main(String[] args) {

        User userObj1 = new User();
        userObj1.setFirstName("UA");
        userObj1.setLastName("UAL");
        userObj1.setAddress("Stockholm");

        User userObj2 = new User();
        userObj2.setFirstName("UB");
        userObj2.setLastName("UBL");
        userObj2.setAddress("Taby");

        Account accountObj_1 = new Account();
        accountObj_1.setAccountNumber(12L);
        accountObj_1.setUser(userObj1);

        Account accountObj_2 = new Account();
        accountObj_2.setAccountNumber(99L);
        accountObj_2.setUser(userObj2);

        addAccounts(accountObj_1);
        addAccounts(accountObj_2);
        printDetails();
    }


    private static void addAccounts(Account accountReference) {
        accountsList.add(accountReference);
    }

    private static void printDetails() {
   for (int i = 0; i < accountsList.size() ; i++) {

       Account ref1 = accountsList.get(i);
       User userRef = ref1.getUser();

       System.out.println(ref1.getAccountNumber());
       System.out.println(userRef.getFirstName());
       System.out.println(userRef.getLastName());
       System.out.println(userRef.getAddress());

   }
    }

}
