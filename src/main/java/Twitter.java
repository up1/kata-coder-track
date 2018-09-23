public class Twitter {
    String name;
    int value;

    public Twitter(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + " " + value;
    }
}
