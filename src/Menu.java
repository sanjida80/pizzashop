import java.util.ArrayList;



public class Menu {


    private int menuId;
    private String menuItem;
    private float menuPrice;

    //Constructor Method
    public Menu(int _menuId, String _menuItem, float _menuPrice){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.menuPrice = _menuPrice;
    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public float getMenuPrice() { return menuPrice; }
    public void setMenuPrice(float _menuPrice) { this.menuPrice = _menuPrice;
    }

    public static void listMenu(ArrayList<Menu> mList) {
        for (Menu menu : mList) {
            System.out.println("Item ID: " + menu.getmenuId());
            System.out.println("Item Name: " + menu.getmenuItem());
            System.out.println("Item Unit Price : $" + menu.getMenuPrice());
        }
    }
    public Menu menuInfo() {
        System.out.printf("%-1s | %-12s | %-12s\n,", getmenuItem(), "$" + getMenuPrice());
        return null;
    }
}
