/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package grocery;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HouseHold essential = new HouseHold();
        System.out.println("What roommates would you like to add (type done when finished)");
        boolean h = true;
        while (h) {
            String romnew = in.nextLine();
            if(romnew.equals("done")) {
                h = false;
            } else {
                essential.addRoomy(romnew, new Roommate());
            }
        }
        essential.addRoomy("Amy", new Roommate());
        essential.addRoomy("Violet", new Roommate());
        essential.addRoomy("Elaine", new Roommate());
        essential.addRoomy("Kam", new Roommate());
        essential.addItem(new Item(29.99, new String[] { "Amy", "Kam" }, "Beans", essential));
        essential.addItem(new Item(83.99, new String[] { "Elaine", "Violet" }, "Eggs", essential));
        essential.addItem(new Item(12.99, new String[] { "Amy", "Kam", "Elaine", "Violet" }, "Butter", essential));
        essential.addItem(new Item(4.68, new String[] { "Amy" }, "Chips", essential));
        essential.printHouse();
        essential.resetHouse();
        essential.printHouse();
        /*
         * Total - 131.65
         * Amy - 22.9225
         * Kam - 18.2425
         * Elaine - 45.2425
         * Violet - 45.2425
         */
    }
}