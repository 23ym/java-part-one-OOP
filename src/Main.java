//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.height = 10.2;
        myBox.lenght = 15;
        myBox.width = 11.3;
        Box box2 = new Box();
        Box box3 = new Box();
        box2.width = 5;
        box2.height = 5;
        box2.lenght = 5;
        box3.lenght =10;
        box3.height = 10;
        box3.width = 10;
        double volume = myBox.height * myBox.lenght * myBox.width;
        double volume2 = box2.height * box2.lenght * box2.width;
        double volume3 = box3.height * box3.lenght * box3.width;
        System.out.println("Об'єм коробки 1 " + volume + "\nОб'єм коробки 2 " + volume2 + "\nОб'єм коробки 3 " + volume3);

        Man man1 = new Man();
        Man man2 = new Man();
        Man man3 = new Man();
        Man man4 = new Man();
        Man man5 = new Man();

        man1.name = "John";
        man1.age = 19;
        man1.weight = 70.5;
        man2.name = "Slay";
        man2.age = 24;
        man2.weight = 90.3;
        man3.name = "Bill";
        man3.age = 40;
        man3.weight = 66.4;
        man4.name = "Rokki";
        man4.age = 56;
        man4.weight  = 76.9;
        man5.name = "Chuck";
        man5.age = 36;
        man5.weight = 98;

        Man[] men = new Man[5];
        men[0] = man1;
        men[1] = man2;
        men[2] = man3;
        men[3] = man4;
        men[4] = man5;

        int sum = 0;
        for (int i = 0; i < men.length; i++) {
            sum += men[i].age;
        }
        System.out.println(sum/(double)men.length); // Вивести на екран середній вік

        Box box1 = new Box();
        Box box12 = new Box();
        box1.lenght = 5;
        box1.height = 5;
        box1.width = 5;
        box12.lenght = 10;
        box12.height = 10;
        box12.width = 10;
        double volume1 = box1.volume();
        double volume12 = box12.volume();
        System.out.println(volume1);
        System.out.println(volume12);
    }
}