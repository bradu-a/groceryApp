package grocery;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class HouseHold {
    private Map<String, Roommate> houseHold = new HashMap<String, Roommate>();
    private List<Item> groceryList = new ArrayList<Item>();
    double total = 0;
    public void addRoomy(String a, Roommate n) {
        houseHold.put(a, n);
    }
    public Map<String, Roommate> getHouse() {
        return houseHold;
    }
    public void addItem(Item n) {
        groceryList.add(n);
        total += n.getPrice();
    }
    public void printHouse() {
        System.out.println("Your shopping list includes");
        for (Item i : groceryList) {
            System.out.println(i.getName() + ": " + i.getPrice());
        }
        System.out.println("Your total will amount to $" + total + ".  Individually,");
        for (String j : houseHold.keySet()) {
            System.out.println(j + " owes $" + houseHold.get(j).getOwe());
        }
    }
    public void resetHouse() {
        for (Roommate i : houseHold.values()) {
            i.resetOwe();
        }
        total = 0;
    }
}