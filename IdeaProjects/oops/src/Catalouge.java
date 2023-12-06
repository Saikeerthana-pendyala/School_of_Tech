import java.util.HashMap;
import java.util.Map;



public class Catalouge {
    /*private static Map<String, Product> productMap=Map.of(
            "Toothbrush",new Product("Toothbrush",55),
            "Cycle",new Product("Cycle",3500)
    );*/
    public final static int SHIPPING_RATE = 5;
    private static Map<String, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put("Toothbrush", new Product("Toothbrush", 55, ProductType.PHYSICAL,50));
        productMap.put("Cycle", new Product("Cycle", 3500, ProductType.PHYSICAL,800));
        productMap.put("ebook",new Product("ebook",500,ProductType.DIGITAL,0));
    }

    public static Product getProduct(String productName){
        return productMap.get(productName);
    }
}
