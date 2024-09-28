import java.util.Random;
import java.util.Scanner;
public class AtividadeLacos5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroAleatório = rand.nextInt(100) +1;
        int palpite = 0;

        System.out.println("Bem-Vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100");

        while (palpite != numeroAleatório){
            System.out.println("Digite seu palpite:");
            palpite = sc.nextInt();

            if(palpite < numeroAleatório){
                System.out.println("Muito baixo Tente novamente.");
            }else if (palpite >numeroAleatório){
                System.out.println("Muito alto tente novamente.");
            }else{
                System.out.println("Prabéns! Você adivinhou o número! ");
            }
        }
        sc.close();
    }
}
