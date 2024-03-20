public class Dog {
    String name;
    String breed;
    int speed;

    void run() {  // метод run без параметрів, тип void
        String result = ""; // При виклику цього методу виводиться рядок "біжу, біжу"
        for (int i = 0; i < speed; i++) {  // Слово "біжу" виводиться стільки разів,
            result += "біжу";              // скільки вказано у змінній - швидкість.

            if (i == speed - 1) {    // Перевірка на останнє слово, якщо так, то ставимо крапку
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }

    String info() {
        return "Кличка: " + name + " \nПорода: " + breed + " \nШвидкість: " + speed;
    }
}
