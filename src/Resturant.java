import java.util.ArrayList;

public class Resturant {
    private String name;
    private String imageurl;
    private ArrayList<Menu> menulist = new ArrayList();

    public Resturant(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getImageurl() {
        return this.imageurl;
    }
    public void addMenu(Menu menu){
        menulist.add(menu);
    }

    public ArrayList<Menu> getMenuList() {
        return this.menulist;
    }
}
