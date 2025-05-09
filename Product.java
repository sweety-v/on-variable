public class Product{
     static String category="Electronics";
     String productName;
    public static void main(String [] args){
        
        System.out.println("Category: "+Product.category);
        Product product1=new Product();
         Product product2=new Product();
        product1.productName="Laptop";
        product2.productName="Smart phone";
        System.out.println("Product 1: "+product1.productName);
        System.out.println("Product 2: "+product2.productName);
    }
  }