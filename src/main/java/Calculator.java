public class Calculator {
    double totalAmount;
    public void getTotalAmount() {
        String totalAmountforPrint = String.format("Общая сумма товаров: %.2f₽.", totalAmount);
        System.out.println(totalAmountforPrint);
    }
}
