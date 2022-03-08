public class Item {
    String dishname;
    double dishprice;

    public Item(String dishname) {
        this.dishname = dishname;
    }

    public String getItemName() {
        return this.dishname;

    }

    public void setItemPrice(double dishprice) {
        this.dishprice = dishprice;
    }
    

    public double getItemPrice() {
        return this.dishprice;
    }
}
