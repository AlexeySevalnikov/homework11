package person.appearance;

public final class EyesColor {

    private static EyesColor instance;

    private EyesColor() {
    }

    public static EyesColor getInstance() {
        if (instance == null) {
            instance = new EyesColor();
        }
        return instance;
    }
    private String blue = "голубые";
    private String green = "зелёные";
    private String brown = "карие";
    private String gray = "серые";
    private String diff = "разные";

    public String getBlue() {
        return blue;
    }

    public String getGreen() {
        return green;
    }

    public String getBrown() {
        return brown;
    }

    public String getGray() {
        return gray;
    }

    public String getDiff() {
        return diff;
    }
}
