package person;

import generators.FioGenerator;
import person.appearance.Appearance;

public class Person {

    private String id;
    private FioGenerator fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    public static class Builder {
        private final String id;
        private FioGenerator fio;
        private Physical phys;
        private Appearance appearance;
        private Phone phone;

        public Builder(final String id) {
            this.id = id;
        }

        public final Builder withFio(final FioGenerator textFio) {
            this.fio = textFio.getFio();
            return this;
        }

        public final Builder withPhys(final Physical textPhys) {
            this.phys = textPhys;
            return this;
        }

        public final Builder withAppearance(final Appearance textAppearance) {
            this.appearance = textAppearance;
            return this;
        }

        public final Builder withPhone(final Phone textPhone) {
            this.phone = textPhone;
            return this;
        }

        public final Person build() {
            final Person person = new Person();
            person.id = this.id;
            person.fio = this.fio;
            person.phys = this.phys;
            person.appearance = this.appearance;
            person.phone = this.phone;
            return person;
        }
    }

    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(fio).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }
}