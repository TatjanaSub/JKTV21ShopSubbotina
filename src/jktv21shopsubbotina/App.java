/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21shopsubbotina;

import java.util.Scanner;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.List;
import managers.CustomerManager;
import managers.DataManager;
import managers.ProductManager;
import managers.PurchaseManager;

/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner;
    private final CustomerManager customerManager;
    private final PurchaseManager purchaseManager;
    private final ProductManager productManager;
    
    private final DataManager dataManager;
    
    private List<Purchase>purchases;
//    private Purchase[] purchases;
    private List<Customer>customers;
//    private Customer[] customers;
    private List<Product>products;
//    private Product[] products;
    

    public App() {
        scanner = new Scanner(System.in);
        customerManager = new CustomerManager();
        purchaseManager = new PurchaseManager();
        productManager = new ProductManager();
        
        dataManager = new DataManager();
        
        purchases = dataManager.loadPurchases();
        customers = dataManager.loadCustomers();
        products = dataManager.loadProducts();
    }
    
    public void run(){
        boolean repeat = true;
        do{
            System.out.println("Функции приложения:");
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить продукт");
            System.out.println("2. Список продавемых продуктов");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список зарегистрированных покупателей");
            System.out.println("5. Покупка покупателем продукта");
            System.out.println("6. Оборот магазина за все время работы");
            System.out.println("7. Добавить денег покупателю");
            System.out.print("Выберите номер функции: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task){
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить продукт");
                    products.add(productManager.createProduct());
                    dataManager.saveProducts(products);
                    break;
                case 2:
                    System.out.println("2. Список продавемых продуктов");
                    productManager.printListProducts(products);
                    break;
                case 3:
                    System.out.println("3. Добавить покупателя");
                    customers.add(customerManager.createCustomer());
                    dataManager.saveCustomers(customers);
                    break;
                case 4:
                    System.out.println("4. Список зарегистрированных покупателей");
                    customerManager.printListCustomers(customers);
                    break;
                case 5:
                    System.out.println("5. Покупка покупателем продукта");
                    purchases.add(purchaseManager.createPurchase(products, customers));
                    dataManager.savePurchases(purchases);
                    dataManager.saveCustomers(customers);
                    dataManager.saveProducts(products);
                    break;
                case 6:
                    System.out.println("6. Оборот магазина за все время работы");
                    purchaseManager.shopMoney(purchases);
                    break;
                case 7:
                    System.out.println("7. Добавить денег покупателю");
                    customerManager.addBalance(customers);
                    dataManager.saveCustomers(customers);
                    break;
                default:
                    System.out.println("Выберите номер функции из списка!");
            }
        }while(repeat);
        System.out.println("Пока!");
    }
    
   

    
}
