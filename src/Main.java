import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = sc.nextInt();

        System.out.println("Tabuada do número" + n + ":");

        for(int i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = "+(n*i));
        }
       sc.close();

    }
}