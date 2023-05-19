import model.Human;

// класс который является входной точкой в программу. таких вх. точек может быть много
// клиентский код - вызывает выполнение основной логики программы
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Alex");
        Human human1 = new Human("Oleg", "m", 34);
        System.out.println(human1.getName());
        String str = "aaaaaaa";
        StringBuilder c = new StringBuilder();

        int i = 0;

        // int, byte short float long boolean char double
//        boolean - 1
//        byte - 8
//        short float -16
//        int char -32
//        long? short float- 64 bit
//        string -> char char

        System.out.println(str.length());
//        System.out.println(human.getName());
//        human.setName("Mary");
//        System.out.println(human.getName());
    }
}
