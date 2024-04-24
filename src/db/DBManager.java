package db;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Item> items = new ArrayList<>();
    private static int id = 6;
    static {
      items.add( new Item(1, "Iphone 13 pro max", 450000, 10));
      items.add( new Item(2, "Xiaomi Redmi Note 8", 82000, 20));
      items.add( new Item(3, "Oppo 3 Model X", 350000, 15));
      items.add( new Item(4, "Macbook Pro M1 13", 750000, 15));
      items.add( new Item(5, "ASUS TUF Gaming ", 340000, 7));
    }
    public static void addItems(Item item){
        item.setId(id);
        id++;
        items.add(item);
    }
    public static ArrayList<Item> getItems(){
        return items;
    }

    public static Item getId(int id) {
        return items.stream().filter(s->s.getId() == id).findFirst().orElse(null);
    }

}
