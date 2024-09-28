import java.util.Scanner;
public class AtividadesLacos02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = sc.nextInt();

        while (n >=0 ){
            System.out.println("Contagem:" + n);
            n--;
        }
        System.out.println("Contagem Concluida");
       sc.close();
    }
}
