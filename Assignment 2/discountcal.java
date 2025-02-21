class discountcal {
    public static void main(String[] args) {
        double totalPurchase = 850; 
        boolean hasMembershipCard = true;

        double discount = 0.0;

        if (totalPurchase >= 1000) {
            discount = 20.0;
        } else if (totalPurchase >= 500 && totalPurchase < 1000) {
            discount = 10.0;
        } else if (totalPurchase < 500) {
            discount = 5.0;
        }

   
        if (hasMembershipCard) {
            discount += 5.0;
        }

        double discountAmount = (discount / 100) * totalPurchase;
        double finalAmount = totalPurchase - discountAmount;

        System.out.println("Total purchase amount : " + totalPurchase + ", discount amount : " + discountAmount + ", Final amount : " + finalAmount) ; 
    }
}
