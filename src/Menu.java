import java.util.HashMap;

public class Menu {

//    String dishName;
//    int dishPrice;
    HashMap list = new HashMap<String, Integer>();

    public Menu() {
//        dishName = dish;
//        dishPrice = price;
        HashMap<String,Integer> list = new HashMap<String, Integer>();
//
    }

    public static void main(String[] args){
        Menu menu = new Menu();
        menu.list.put("Noddle",8);
        menu.list.put("Rice",5);
        System.out.println(menu.list);

        for (Object i : menu.list.keySet()){
            System.out.println("Dish name: " + i + ", Dish price: " + menu.list.get(i));
        }
    }
}
