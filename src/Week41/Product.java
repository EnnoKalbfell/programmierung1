package Week41;

public class Product {

    private int ID;
    private String name;
    private ProductType productType;
    private int price;
    private int inventory;

    public Product(int id) {
        this.ID = id;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3) {
            this.name = name;
        }
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        if (inventory >= 0) {
            this.inventory = inventory;
        }
    }

    public enum ProductType {
        electronics,  // Elektronik
        food,         // Lebensmittel
        clothing      // Kleidung
    }
}