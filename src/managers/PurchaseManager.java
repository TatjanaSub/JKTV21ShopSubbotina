/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class PurchaseManager {
    private final Scanner scanner;
    private ProductManager productManager;
    private CustomerManager customerManager;

    public PurchaseManager() {
        scanner = new Scanner(System.in);
        productManager = new ProductManager();
        customerManager = new CustomerManager();
    }

    public Purchase createPurchase(Product[] products, Customer[] customers) {
        
        System.out.println("Spisok pokupateley: ");
        customerManager.printListCustomers(customers);
        System.out.println("Vyberite nomer pokupatelja iz spiska: ");
        int numberCustomer = scanner.nextInt(); scanner.nextLine();
        
        System.out.println("Spisok produktov: ");
        productManager.printListProducts(products);
        System.out.println("Vyberite nomer produkta iz spiska: ");
        int numberProduct = scanner.nextInt(); scanner.nextLine();
        
        System.out.println("Vvedite kolichestvo produkta: ");
        int countProduct = scanner.nextInt(); scanner.nextLine();
        
        Purchase purchase = new Purchase();
        purchase.setCustomer(customers[numberCustomer - 1]);
        purchase.setTakeOfProduct(new GregorianCalendar().getTime());
        purchase.setProduct(products[numberProduct - 1]);
        purchase.setAmountCustomer(countProduct);
        purchase.setPriceCustomer(products[numberProduct - 1].getPrice());
        products[numberProduct - 1].setAmountShop(products[numberProduct - 1].getAmountShop() - countProduct);
        customers[numberCustomer -1].setMoney(customers[numberCustomer -1].getMoney() - countProduct * products[numberProduct - 1].getPrice());
        
        return purchase;
    }
}
