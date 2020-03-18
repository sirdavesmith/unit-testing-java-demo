import lombok.Getter;

import java.util.HashMap;

public class NamesCount {
    private int count;

    @Getter
    private HashMap<String, Double> counts = new HashMap<String, Double>();

    /*** Adds the name.
     * @param name Name.
     */
    public void addName(String name) {
        Double nameCount = counts.get(name);
        if (nameCount == null) {
            nameCount = 1.0;
            counts.put(name, nameCount);
        } else {
            counts.put(name, counts.get(name) + 1);
        }
        count++;
    }

    /**
     * Returns proportion of parameter name in all calls to addName.
     * @param name Name.
     * @return Double in interval [0, 1]. Returns 0 if AddName has not been called.
     */
    public double nameProportion(String name) {
        return counts.get(name) / count;

    }

    public static void main(String[] args) {
        NamesCount namesCount = new NamesCount();
        namesCount.addName("James");
        namesCount.addName("John");
        namesCount.addName("Mary");
        namesCount.addName("Mary");
        System.out.println("Fraction of Johns: " + namesCount.nameProportion("John"));
        System.out.println("Fraction of Marys: " + namesCount.nameProportion("Mary"));
    }
}