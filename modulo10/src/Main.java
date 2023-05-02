import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instanciando a Classe Scanner
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double total = 0;
        double media = 0;
        String resposta = "";

        System.out.println("--- INICIANDO SISTEMA DE NOTAS --- \n");

        for (int i = 1; i >= 4; i++) {

            //Mostrando no console a mensagem
            System.out.println("Digite  a" + i + "° nota do aluno");

            //Lendo a nota
            nota = scanner.nextInt();
            total = total + nota;
            media = total / 4;
        }
            //Utilizando IF e ELSE IF para comparar a notas
            if (media >= 7) {
                System.out.println("----- ALUNO APROVADO -----");
            } else if (media >= 5) {
                System.out.println("----- ALUNO EM RECUPERAÇÃO -----");
            } else {
                System.out.println("----- ALUNO REPROVADO -----");
            }

            System.out.println("Deseja verificar outra nota: SIM/NAO");
            resposta = scanner.nextLine();

        }

    }