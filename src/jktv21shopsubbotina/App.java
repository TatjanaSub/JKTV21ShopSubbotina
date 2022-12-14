/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21shopsubbotina;

import java.util.Arrays;
import java.util.Scanner;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import managers.CustomerManager;
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
    private Purchase[] purchases;
    private Customer[] customers;
    private Product[] products;
    

    public App() {
        scanner = new Scanner(System.in);
        customerManager = new CustomerManager();
        purchaseManager = new PurchaseManager();
        productManager = new ProductManager();
        
        purchases = new Purchase[0];
        customers = new Customer[0];
        products = new Product[0];
        testAddCustomer();
        testAddProduct();
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
                    addProduct(productManager.createProduct()) ;
                    break;
                case 2:
                    System.out.println("2. Список продавемых продуктов");
                    productManager.printListProducts(products);
                    break;
                case 3:
                    System.out.println("3. Добавить покупателя");
                    addCustomer(customerManager.createCustomer());
                    break;
                case 4:
                    System.out.println("4. Список зарегистрированных покупателей");
                    customerManager.printListCustomers(customers);
                    break;
                case 5:
                    System.out.println("5. Покупка покупателем продукта");
                    addPurchase(purchaseManager.createPurchase(products, customers));
                    break;
                case 6:
                    System.out.println("6. Оборот магазина за все время работы");
                    shopMoney();
                    break;
                case 7:
                    System.out.println("7. Добавить денег покупателю");
                    customerManager.addBalance(customers);
                    break;
                default:
                    System.out.println("Выберите номер функции из списка!");
            }
        }while(repeat);
        System.out.println("Пока!");
    }
    
    private void addCustomer(Customer customer){
        customers = Arrays.copyOf(customers, customers.length + 1);
        customers[customers.length - 1] = customer;
    }
     
    private void addProduct(Product product){
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
    }
    
    private void addPurchase(Purchase purchase){
        purchases = Arrays.copyOf(purchases, purchases.length + 1);
        purchases[purchases.length - 1] = purchase;
    }
    
    private void shopMoney() {
        int shopMoney = 0; // беру цену из purchases
//        int shopMoney = 0; // беру цену из product
        
        for (int i = 0; i < purchases.length; i++) {
            shopMoney = shopMoney + purchases[i].getAmountCustomer() * purchases[i].getPriceCustomer();
//            shopMoney = shopMoney + purchases[i].getAmountCustomer() * purchases[i].getProduct().getPrice();
        }
        System.out.printf("%nОборот магазина за все время работы: %d eur%n",shopMoney);
        System.out.println();
    }

    private void testAddCustomer() {
        Customer customer = new Customer("Ivan", "Ivanov","53912939", 350);
        customers = Arrays.copyOf(customers, customers.length + 1);
        this.customers[this.customers.length - 1] = customer;
    }

    private void testAddProduct() {
        Product product = new Product("Milk", "Farmi", 20, 1);
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
    }

    
}
