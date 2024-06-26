package Test3;

public class Test3 {
    public static void main(String[] args) {
        Product[] productArray = new Product[3];

        Product p1 = new Product(1, "苹果", 7099.0, 1000);
        Product p2 = new Product(2, "小米", 3599, 1234);
        Product p3 = new Product(3, "vivo", 2999, 999);

        productArray[1] = p1;
        productArray[2] = p2;
        productArray[3] = p3;
    }
}
