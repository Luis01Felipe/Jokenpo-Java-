import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pC = new Scanner(System.in);

        int playerChoice;
        int computerChoice;
        int playerScore   = 0;
        int computerScore = 0;

        do {
            do {
                System.out.println("\nEscolha entre: \n1. Pedra, 2. Papel, 3. Tesoura");

                while (!pC.hasNextInt()) {
                    System.out.println("Formato invalido, por favor tente novamente.");
                    pC.next();
                }

                playerChoice = pC.nextInt();

                switch (playerChoice) {
                    case 1:
                        System.out.println("Você escolheu *Pedra*");
                        break;
                    case 2:
                        System.out.println("Você escolheu *Papel*");
                        break;
                    case 3:
                        System.out.println("Você escolheu *Tesoura*");
                        break;
                    default:
                        System.out.println("Escolha incorreta, por favor tente novamente.");
                        break;
                }
            } while (playerChoice < 1 || playerChoice > 3);

            Random cC = new Random();
            do {
                computerChoice = cC.nextInt(3) + 1;
            } while (computerChoice == playerChoice);

            switch (computerChoice) {
                case 1:
                    System.out.println("Computador escolheu *Pedra*");
                    break;
                case 2:
                    System.out.println("Computador escolheu *Papel*");
                    break;
                case 3:
                    System.out.println("Computador escolheu *Tesoura*");
                    break;
            }

            if (computerChoice == 1 && playerChoice == 2 || computerChoice == 2 && playerChoice == 3 || computerChoice == 3 && playerChoice == 1) {
                System.out.println("--Jogador ganhou--");
                playerScore+=1;
            } else {
                System.out.println("--Computador ganhou--");
                computerScore+=1;
            }
        }while(playerScore < 3 && computerScore < 3);

        System.out.printf("\nPontuação Final: \n[Jogador: %d] \n[Computador: %d]", playerScore, computerScore);

        pC.close();
    }
}

