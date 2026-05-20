package packages.app.util;

import packages.app.model.Product;

public class Formatter {
    public static String formatProduct(Product product) {
        String prefix = InternalHelper.tag("product");
        return prefix + " " + product.getId() + " — " + product.getName()
                + " ($" + product.getPrice() + ")";
    }
}
