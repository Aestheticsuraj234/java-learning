package packages;

import packages.app.model.Product;
import packages.app.service.ShopService;

public class PackageDemo {
    public static void main(String[] args) {
        Product laptop = new Product("P-1", "Laptop", 899.99);
        Product mouse = new Product("P-2", "Mouse", 29.99);

        ShopService shop = new ShopService();
        shop.printCatalog(new Product[] { laptop, mouse });

        // Fully qualified name — no import needed for one-off use
        System.out.println();
        System.out.println(
                packages.app.util.Formatter.formatProduct(laptop));
    }
}
