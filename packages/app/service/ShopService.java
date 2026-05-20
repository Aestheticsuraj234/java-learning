package packages.app.service;

import packages.app.model.Product;
import packages.app.util.Formatter;

public class ShopService {
    public void printCatalog(Product[] products) {
        System.out.println("--- Catalog ---");
        for (Product product : products) {
            System.out.println(Formatter.formatProduct(product));
        }
    }
}
