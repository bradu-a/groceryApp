package grocery;
public class Item {
    private double price;
    private String[] ids;
    private String name;
    public Item(double p, String[] a, String n, HouseHold s) {
        price = p;
        ids = a;
        name = n;
        double indiv = p / a.length;
        for (String i : a) {
            try {
                s.getHouse().get(i).addOwe(indiv);
            } catch (Exception e) {
                System.out.println("That guy doesn't live with you bucko");
            }
        }
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}