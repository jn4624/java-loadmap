package ref.ex;

import java.util.Scanner;

public class ProductOrderMainRef2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");

        int orderCount = scanner.nextInt();
        ProductOrder[] productOrders = new ProductOrder[orderCount];

        for(int i = 0; i < orderCount; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            scanner.nextLine();
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);
        int totalPrice = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalPrice);
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += (order.price * order.quantity);
        }
        return totalPrice;
    }
}
