import javax.swing.*;

public class Box {
    double width;
    double height;
    double lenght;

    void setDimens (double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

//    void showVolume() {
//        double volume = width * height * lenght;
//        System.out.println(volume);
    double volume() {
        return width * height * lenght;
    }
}
