public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfPurchased;
    private double pricePreItem;

    public Invoice(String partNumber, String partDescription, int quantityOfPurchased, double pricePreItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityOfPurchased = quantityOfPurchased;
        this.pricePreItem = pricePreItem;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantityOfPurchased(int quantityOfPurchased) {
        if (quantityOfPurchased > 0) {
            this.quantityOfPurchased = quantityOfPurchased;
        } else {
            this.quantityOfPurchased = 0;
        }
    }

    public int getQuantityOfPurchased() {
        return quantityOfPurchased;
    }

    public void setPricePreItem(double pricePreItem) {
        if (pricePreItem > 0) {
            this.pricePreItem = pricePreItem;
        } else {
            this.pricePreItem = 0;
        }
    }

    public double getPricePreItem() {
        return pricePreItem;
    }

    public double getInvoiceAmount() {
        return pricePreItem * quantityOfPurchased;
    }
    
}


class InvoiceTest {
    public static void main(String[] args) {
        Invoice in = new Invoice("007A", "Bat", 10, 7.5);
        System.out.println("Part number: " + in.getPartNumber() + "; Part description: " + in.getPartDescription() +
                "; Sold: " + in.getQuantityOfPurchased() + "; Price: " + in.getPricePreItem() + "; Invoice amount: " +
                in.getInvoiceAmount());

        in.setPartNumber("002");
        in.setPartDescription("IBM");
        in.setQuantityOfPurchased(100);
        in.setPricePreItem(777.77);

        System.out.println("After changing:\n");
        System.out.println("Part number: " + in.getPartNumber() + "; Part description: " + in.getPartDescription() +
                "; Sold: " + in.getQuantityOfPurchased() + "; Price: " + in.getPricePreItem() + "; Invoice amount: " +
                in.getInvoiceAmount());
    }
}
