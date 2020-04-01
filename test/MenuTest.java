import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MenuTest {
    @Test
    public void itStoresListOfDishes() {
        Menu menu = new Menu();
        menu.list.put("Pasta", 5);
        menu.list.put("Rice",8);
        assertEquals(menu.list.get("Pasta"), 5);
        assertEquals(menu.list.get("Rice"),8);
        assertEquals(menu.list.size(),2);
    }
}
