package gokhanaliccii.hurriyetmobile.model;

/**
 * Created by gokhan on 08/10/17.
 */

public class Writer {

    private String name;
    private String surname;

    public Writer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Writer) {
            Writer writer = (Writer) o;

            boolean equal = true;

            equal &= writer.name.equals(name);
            equal &= writer.surname.equals(surname);

            return equal;
        }
        return super.equals(o);
    }
}
