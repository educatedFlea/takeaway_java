import java.util.HashMap;

public class Menu {

    String dishName;
    int dishPrice;
    HashMap list = new HashMap<String, Integer>();

    public Menu(String dish, int price) {
        dishName = dish;
        dishPrice = price;
        HashMap<String,Integer> list = new HashMap<String, Integer>();
        list.put(dish,price);
//        for (Object i : list.keySet()){
//            System.out.println("Dish name: " + i + ", Dish price: " + list.get(i));
//        }
//
    }


    public static void main(String[] args){
        Menu menu = new Menu("Carbonara", 10);
//        menu.list.put("Noddle",8);
//        menu.list.put("Rice",5);
        System.out.println(menu.list);

    }
}
