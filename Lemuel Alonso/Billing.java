class Billing {

    public double computeBill(double price) {
        double tax = 0.08 * price;
        double finalPrice = tax + price;
        System.out.println("The total price for the bill is: $" + finalPrice);
        return finalPrice;
    }

    public double computeBill(double price, int quantity) {
        double sum = price * quantity * 1.08;
        System.out.println("The total price for the bill is: $" + sum);
        return sum;
    }

    public double computeBill(double price, int quantity, int couponDiscount) {
        double partialTotal = price * quantity;
        double discAmount = (couponDiscount / 100.0) * partialTotal;
        double sum = (partialTotal - discAmount) * 1.08;
        System.out.println("The total price for the bill is: $" + sum);
        return sum;
    }

    public static void main(String[] args) {
        Billing billing = new Billing();

        billing.computeBill(23.2);
        billing.computeBill(24.4, 2);
        billing.computeBill(24.7, 3, 5);
    }
}