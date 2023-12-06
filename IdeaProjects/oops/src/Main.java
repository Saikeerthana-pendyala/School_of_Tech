import java.util.Optional;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
       // Product toothbrush=new Product("Toothbrush",55);
        //Product Cycle =new Product("Cycle",3500);

        Product toothbrush=Catalouge.getProduct("Toothbrush");
        Product Cycle=Catalouge.getProduct("Cycle");
        Product ebook=Catalouge.getProduct("ebook");

        cart.addLineItem(new LineItem(Cycle,1));
        cart.addLineItem(new LineItem(toothbrush,2));
        cart.addLineItem(new LineItem(ebook,1));
        System.out.println(cart);
        System.out.println(cart.getTotalCost());

        Customer johnDoe = new Customer("Keerthana", 5420793615183044L);
        Optional<Order> order = johnDoe.checkout(cart);
        System.out.println(order);
    }
}