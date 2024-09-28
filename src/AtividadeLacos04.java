import java.util.Scanner;
public class AtividadeLacos04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        do {
          System.out.println("Digite sua idade :");
               idade = sc.nextInt();
            if(idade <= 0) {
                System.out.println("Idade inválida !Tente outra novamente ");
          }
            }while (idade <= 0);
        System.out.println("Idade válida inserida :" + idade);
        sc.close();

    }
}
