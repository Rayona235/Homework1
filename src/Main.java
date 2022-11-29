public class Main {
    public static void main(String[] args) {
   Mother mother= new Mother(Enum.RED, 25);
   Daughter daughter=new Daughter(Enum.RED,15,"Rayana");
   Daughter daughter1=new Daughter(Enum.RED,18,"Indira");
        System.out.println(mother.getAge());
        System.out.println(mother.getHeirColor());
        System.out.println(daughter1.getHeirColor());
        System.out.println(daughter1.getName());
        System.out.println(daughter1.getAge());
        System.out.println(daughter.getHeirColor());
        System.out.println(daughter.getName());
        System.out.println(daughter.getAge());
        System.out.println(mother.sum(45,56));
        System.out.println(daughter1.sum(36,78));
        System.out.println(daughter.sum(28,99));
    }
}