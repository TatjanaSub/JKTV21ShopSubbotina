/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Customer;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CustomerManager {
    private final Scanner scanner;

    public CustomerManager() {
        scanner = new Scanner(System.in);
    }

    public Customer createCustomer() {
        Customer customer = new Customer();
        System.out.print("Vvedite imja pokupatelja: ");
        customer.setFirstname(scanner.nextLine());
        System.out.print("Vvedite familiju pokupatelja: ");
        customer.setLastname(scanner.nextLine());
        System.out.print("Telefon pokupatelja: ");
        customer.setPhone(scanner.nextLine());
        System.out.println("Vvedite kolichestvo deneg: ");
        customer.setMoney(scanner.nextInt());
        return customer;
    }

    public void printListCustomers(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            System.out.printf("%d. %s  %s. Telefon: %s Money: %d%n",
                    i+1,
                    customers[i].getFirstname(),
                    customers[i].getLastname(),
                    customers[i].getPhone(),
                    customers[i].getMoney()
            );
        }
    }

    public void addBalance(Customer[] customers) {
        System.out.println("Spisok pokupateley: ");
        printListCustomers(customers);
        System.out.println("Vyberite nomer pokupatelja iz spiska: ");
        int numberCustomer = scanner.nextInt(); scanner.nextLine();
        
        System.out.printf("U pokupatelja %d eur%n",customers[numberCustomer - 1].getMoney());
        System.out.println("Vvedite kolichestvo dobavljaemyh deneg: ");
        int addBalance = scanner.nextInt(); scanner.nextLine();
        customers[numberCustomer - 1].setMoney(customers[numberCustomer - 1].getMoney() + addBalance);
    }
    
    
    
}
