import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;

        System.out.println("Qual seu nome?");
        nome = input.nextLine();

        System.out.println(("Olá ") + (nome) + (". Será que você é geek? Responda as seguintes questões do quiz para descobrir:"));

        int perguntas = 4;
        double[] quiz = new double[perguntas];
        int respostasCorretas = 0;
        int respostasErradas = 0;

        System.out.println("Pergunta número 1: Qual o nome do melhor amigo do Harry Potter?");

        System.out.println("[1] Gina Weasley");
        System.out.println("[2] Ronnie Weasley");
        System.out.println("[3] Draco Malfoy");
        System.out.println("[4] Luke Skywalker");
        quiz[0] = input.nextDouble();

        if (quiz[0] == 2) {
            System.out.println("Você acertou!");
            respostasCorretas = respostasCorretas + 1;

        }else{
            System.out.println("Resposta errada!");
            respostasErradas = respostasErradas + 1;
        }
        System.out.println(nome + ", esse é o placar:");
        System.out.println("Acertos: " + respostasCorretas);
        System.out.println("Erros: " + respostasErradas);



        System.out.println("Segunda pergunta: Qual dessas é uma expressão do Sheldon Cooper, da série The Big Bang Theory?");

        System.out.println("[1] Alohomora");
        System.out.println("[2] Legendary!");
        System.out.println("[3] Bazinga!");
        System.out.println("[4] Vida longa e próspera");
        quiz[1] = input.nextDouble();

        if (quiz[1] == 3) {
            System.out.println("Você acertou!");
            respostasCorretas = respostasCorretas + 1;

        }else{
            System.out.println("Resposta errada!");
            respostasErradas = respostasErradas + 1;
        }
        System.out.println(nome + ", esse é o placar:");
        System.out.println("Acertos: " + respostasCorretas);
        System.out.println("Erros: " + respostasErradas);


        System.out.println("Pergunta número 3: Qual o verdadeiro nome do Homem Aranha?");

        System.out.println("[1] Peter Parker");
        System.out.println("[2] Harry Potter");
        System.out.println("[3] Bruce Wayne");
        System.out.println("[4] Bruce Banner");
        quiz[2] = input.nextDouble();

        if (quiz[2] == 1) {
            System.out.println("Você acertou!");
            respostasCorretas = respostasCorretas + 1;

        }else{
            System.out.println("Resposta errada!");
            respostasErradas = respostasErradas + 1;
        }
        System.out.println(nome + ", esse é o placar:");
        System.out.println("Acertos: " + respostasCorretas);
        System.out.println("Erros: " + respostasErradas);



        System.out.println("Quarta pergunta: Quem, além do próprio Thor, é o único capaz de levantar o martelo Mjölnir?");

        System.out.println("[1] Hulk");
        System.out.println("[2] Homem de Ferro");
        System.out.println("[3] Viúva Negra");
        System.out.println("[4] Capitão América");
        quiz[3] = input.nextDouble();

        if (quiz[3] == 4) {
            System.out.println("Você acertou!");
            respostasCorretas = respostasCorretas + 1;

        }else{
            System.out.println("Resposta errada!");
            respostasErradas = respostasErradas + 1;
        }
        System.out.println(nome + ", esse é o placar final:");
        System.out.println("Acertos: " + respostasCorretas);
        System.out.println("Erros: " + respostasErradas);


        }


}
