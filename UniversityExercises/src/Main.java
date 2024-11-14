
public class Main {
    public static void main(String[] args) {
        char[] values = new char[10];
        char[] mirror = new char[values.length];
        System.out.println("Values:");
        for(int i = 0; i < 10; i++) {
            int randomInt = 97 + (int) (Math.random() * 26);
            values[i] = (char)randomInt;
            System.out.println(values[i]);
        }
        System.out.println("Mirror:");
        for(int i = 0; i < mirror.length; i++) {
            mirror[i] = values[values.length - 1 - i];
            System.out.println(mirror[i]);
        }

    }
}