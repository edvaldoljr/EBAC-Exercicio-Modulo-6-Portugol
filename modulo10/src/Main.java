import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instanciando a Classe Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- INICIANDO SISTEMA DE NOTAS --- \n");
        String resposta = "";

        do {
            //Mostrando no console a mensagem
            System.out.println("Digite  a nota do aluno");

            //Lendo a nota
            int nota = scanner.nextInt();

            //Utilizando IF e ELSE IF para comparar a notas
            if (nota >= 7) {
                System.out.println("----- ALUNO APROVADO -----");
            } else if (nota >= 5) {
                System.out.println("----- ALUNO EM RECUPERAÇÃO -----");
            } else {
                System.out.println("----- ALUNO REPROVADO -----");
            }

            System.out.println("Deseja verificar outra nota: SIM/NAO");
            resposta = scanner.nextLine();

        } while (resposta.equals("sim"));

            System.out.println("Obrigado");
        }
    }