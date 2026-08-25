import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();  // Original word
        String t = sc.next();  // Translated word

        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        if (reversed.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
