package task3;

public class Plane {
    private String name;

    public Plane(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                '}';
    }
}
