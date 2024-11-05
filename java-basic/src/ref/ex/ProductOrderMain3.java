package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[num];
        for (int i=0; i<num; i++) {
            System.out.printf("%d번째 주문 정보를 입력하세요.%n", i+1);
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            ProductOrder order = createOrder(productName, price, quantity);
            orders[i] = order;
        }
        printOrders(orders);
        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }

    static public ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static public void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static public int getTotalAmount(ProductOrder[] orders) {
        int totalAmout = 0;
        for (ProductOrder order : orders) {
            totalAmout += order.price * order.quantity;
        }
        return totalAmout;
    }
}
