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
    }
}