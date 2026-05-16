package bai4;

public class bai4 {// Thuộc tính
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public void Invoice(String partNumber, String partDescription,
                   int quantity, double pricePerItem) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;

        // Nếu số lượng âm thì gán 0
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        // Nếu giá âm thì gán 0.0
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // Getter và Setter
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // Tính tổng tiền hóa đơn
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

}
