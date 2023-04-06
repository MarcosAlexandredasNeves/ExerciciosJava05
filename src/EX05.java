import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do aluno(a)");
        String nome = scanner.nextLine();
        System.out.println("Quais foram as notas de " + nome);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        double media = (n1 + n2 + n3) / 3;
        if (media >= 7) {
            System.out.println("O aluno " + nome + " teve a média de " + media + " sendo assim está APROVADO!");
        } else {
            System.out.println("A média de " + nome + " foi de " + media + ", sendo assim está REPROVADO!");
        }

    }
}
