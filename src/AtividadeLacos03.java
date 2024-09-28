import java.util.Scanner;
public class AtividadeLacos03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = sc.nextInt();
        int fatorial = 1;
        int i = 1;
        do {

            fatorial *= i;
            i ++;


        } while ( i <= n);
        System.out.println(" O fatorial de " + n +" é : " + fatorial);
        sc.close();

    }

}
