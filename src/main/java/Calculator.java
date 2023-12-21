public class Calculator {
    double totalAmount;
    String allProducts;

    public double getTotalAmount() {
        String totalAmountforPrint = String.format("Общая сумма товаров: %.2f₽.", totalAmount);
        System.out.println(totalAmountforPrint);
        return totalAmount;
    }

    void printAllProducts() {
        System.out.println("\nСписок добавленных товаров:\n" + allProducts);
    }
}
