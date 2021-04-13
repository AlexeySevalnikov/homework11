package person.appearance.hair;

public class LongHair extends Hair {

    public LongHair(final String color) {
        this.setColor(color);
    }

    @Override
    public final String toString() {
        return "длинные, " + getColor();
    }
}
