package licaoaula;

public class Product {
    
    private String productName;
    private int productQuantity;

    public String getProductName() {
        return productName;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    @Override
    public String toString() {
        return "Produto: " + productName + " || Quantidade: " + productQuantity;
    }
}
