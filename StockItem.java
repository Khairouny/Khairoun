
/**
 * Write a description of class StockItem here.
 *
 * @author (Bita/6/22/019/tz)
 * @version (Q2)
 */
public class StockItem
{
    private int stockNumber;
    private String name;
    private double price;
    private int totalItemsInStock;
    public StockItem(int stockNumber, String name, double price) {
        this.stockNumber = stockNumber;
        this.name = name;
        this.price = price;
        this.totalItemsInStock = 0;
    }
    public void setPrice(double newPrice) {
        this.price=newPrice;
    }
    public void addToStock(int quantity) {
        this.totalItemsInStock += quantity;
    }
    public double calculateTotalValue() {
        return this.price * this.totalItemsInStock;
    }
    public int getStockNumber() {
        return stockNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getTotalItemsInStock() {
        return totalItemsInStock;
    }
}
