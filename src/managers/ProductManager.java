/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ProductManager {
    private final Scanner scanner;

    public ProductManager() {
        scanner = new Scanner(System.in);
    }

    public Product createProduct() {
        Product product = new Product();
        System.out.println("Vvedite naimenovanije produkta: ");
        product.setTitle(scanner.nextLine());
        System.out.println("Vvedite proizvoditelja: ");
        product.setManufacturer(scanner.nextLine());
        System.out.println("Vvedite kolichestvo tovara: ");
        product.setAmountShop(scanner.nextInt());
        System.out.println("Vvedite chenu prodaznuju: ");
        product.setPrice(scanner.nextInt());
        return product;
    }
    
    public void printListProducts(Product[] products ){
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. %s Manufacturer: %s. Count: %d Price: %d%n",
                    i+1,
                    products[i].getTitle(),
                    products[i].getManufacturer(),
                    products[i].getAmountShop(),
                    products[i].getPrice()
            );
        }
    }
    
}
