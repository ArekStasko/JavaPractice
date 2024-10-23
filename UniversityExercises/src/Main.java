//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 2;
        long b = 3;
        b = a;
        // przypisanie B do A nie jest możliwe bez zastosowania castowania
        // ze względu na mniejszą pojemność typu int
        a = b;
    }
}