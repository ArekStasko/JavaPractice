//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 3;
        String message = a > b ?
                (a > c  ? "a jest najwieksze" : "c jest najwieksze")
                : (b > c  ? "b jest najwieksze" : "c jest najwieksze");
        System.out.println(message);
    }
}