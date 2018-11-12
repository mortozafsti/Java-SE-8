
package InventoryExample;

public class Summary {
    
    private int id;
    private Product product;
    private int totalQty;
    private int soldQty;
    private int availableQty;
    

    public Summary() {
    }

    public Summary(Product product, int totalQty, int soldQty, int availableQty) {
        this.product = product;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availableQty = availableQty;
    }

    public Summary(int id, int totalQty, int soldQty, int availableQty) {
        this.id = id;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availableQty = availableQty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public int getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(int soldQty) {
        this.soldQty = soldQty;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }
 
    
}
