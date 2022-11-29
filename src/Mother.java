public class Mother extends Grandmother{
    private int age;

    public Mother(Enum heirColor, int age) {
        super(heirColor);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int sum(int x, int y){
        return x + y;
    }
    final public double sum(double x, double y){
        return x + y;
    }
    public  int sum(int x, int y, int z){
        return x + y + z;
    }
}
