public class Daughter extends Mother {
    public String name;

    public Daughter(Enum heirColor, int age, String name) {
        super(heirColor, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int sum(int x, int y) {
        return x-y;
    }
}
