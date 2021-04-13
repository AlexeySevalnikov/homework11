package person.appearance.hair;

public class ShortHair extends Hair {

    public ShortHair(final String color) {
        this.setColor(color);
    }

    @Override
    public final String toString() {
        return "короткие, " + getColor();
    }
}
