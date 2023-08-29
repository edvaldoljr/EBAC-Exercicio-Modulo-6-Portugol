import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Definido os Arrays para armazenar os nomes de acordo com o sexo
        String[] nomesMasculinos = new String[50]; //Suponho um máximo de 50 nomes
        String[] nomesFemininos = new String[50]; //suponho um máximo de 50 nomes

        //Contador para total de nomes masculinos
        int totalMasculinos = 0;

        //Contador para total de nomes femininos
        int totalFemininos = 0;

        //Solicitando ao usuário que insira os nomes e sexos separados por vígula
        System.out.print("Digite os nomes e sexos separados por vírgula (nome-sexo , nome-sexo): ");
        String input = scanner.nextLine();

        //Dividindo as entradas usando vírgulas como separador
        String[] entradas = input.split(",");

        //iterando através de cada entrada
        for(String entrada : entradas) {
            //Dividindo a entrada em partes usando o traço como separador
            String[] partes = entrada.split("-");
            if (partes.length !=2 ) {
                System.out.println("Formato incorreto. Use o formato nome-sexo");
                continue;
            }

            //Extraindo o nome e sexo
            String nome = partes[0].trim();
            String sexo = partes[1].trim().toLowerCase();

            //Verificando o sexo e armazendo o nome no array apropriado
            if (sexo.equals("masculino")) {
                nomesMasculinos[totalMasculinos] = nome;
                totalMasculinos++;
            } else if (sexo.equals("feminino")) {
                nomesFemininos[totalFemininos] = nome;
                totalFemininos++;
            } else {
                System.out.println("Sexo inválido. Use 'masculino' ou 'feminino'.");
            }
        }

        // Imprimindo os nomes masculinos
        System.out.println("Nomes masculinos:");
        for (int i = 0; i < totalMasculinos; i++) {
            System.out.println(nomesMasculinos[i]);
        }

        // Imprimindo os nomes femininos
        System.out.println("Nomes femininos:");
        for (int i = 0; i < totalFemininos; i++) {
            System.out.println(nomesFemininos[i]);
        }

        //Fechando o scaner
        scanner.close();
    }
}
