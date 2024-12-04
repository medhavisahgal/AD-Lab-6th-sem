import java.util.Scanner;
public class Product { 
    int product_id;
    double price;
    String name;
    int quantity;

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt(); 
        Product[] products = new Product[n]; 
        System.out.println("Enter the product details:");
        for (int i = 0; i < n; i++) {
            products[i] = new Product();
            System.out.print("Enter the product id: ");
            products[i].product_id = sc.nextInt();
            System.out.print("Enter the price: ");
            products[i].price = sc.nextDouble();
            sc.nextLine(); 
            System.out.print("Enter the name: ");
            products[i].name = sc.nextLine();
            System.out.print("Enter the quantity of the product: ");
            products[i].quantity = sc.nextInt();
        }
        int tt=0;
        System.out.println("\nProduct details with total price:");
        for (int i = 0; i < n; i++) {
            System.out.println("Product ID: " + products[i].product_id);
            System.out.println("Name: " + products[i].name);
            System.out.println("Price: " + products[i].price);
            System.out.println("Quantity: " + products[i].quantity);
            tt+=products[i].price * products[i].quantity;
            System.out.println("Total Price: " + (products[i].price * products[i].quantity));
            System.out.println("----------------------------------");
        }
        //total price
        System.out.println("Your total bill is : "+ tt);
    }
}
