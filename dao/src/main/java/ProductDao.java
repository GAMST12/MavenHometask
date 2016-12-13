public class ProductDao {
    public static void showProduct(Product product) {
        System.out.println(product.name);
    }

    public static void main(String[] args) {
        Product product = new Product("Rich product");

        showProduct(product);


    }
}
