package grocery;
public class Roommate {
    private double owe = 0;
    public double getOwe() {
        return owe;
    }
    public void addOwe(double n) {
        owe += n;
    }
    public void resetOwe() {
        owe = 0;
    }
}