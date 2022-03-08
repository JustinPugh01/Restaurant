import java.util.ArrayList;

public class Menu {
    private String menuname;
    private ArrayList<Item> itemlist = new ArrayList();



    public Menu(String menuname) {
        this.menuname = menuname;
    }

    public String getMenuName() {
        return this.menuname;
    }
    
    public void addItem(Item item) {
        itemlist.add(item);
    }

    public ArrayList<Item> getItemList() {
        return this.itemlist;
    }
}