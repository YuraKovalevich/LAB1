package Package;

import java.util.Locale;

public class Coffee extends Food {
    private String aroma;

    public Coffee(String aroma) {
        super("Кофе");
        checkValidAroma(aroma);
        this.aroma = aroma;
    }

    public void consume() {
        System.out.println(this + "съедено");
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public void checkValidAroma(String aroma) {
        switch (aroma.toLowerCase(Locale.ROOT)) {
            case "насыщенный":
            case "горький":
            case "восточный":
                break;
            default:
                throw new IllegalArgumentException("invalid value");
        }

    }

    @Override
    public String toString() {
        return "Coffee{" +
                "aroma='" + aroma + '\'' +
                '}';
    }
}
