import java.util.Scanner;


public class TesteBonificacao {
    public static void main(String[] args){
        double salario;
        String nome;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        nome = entrada.nextLine();

        System.out.print("Salário: ");
        salario = entrada.nextFloat();

        double bonificacao1 = ((salario * 20)/100);
        double bonificacao2 = ((salario * 10)/100);
        double desconto = ((salario * 10)/100);


        if (salario < 1000) {
            System.out.println("Nome: " + nome);
            System.out.println("Salário: " + salario);
            System.out.println("Bônus: " + bonificacao1);
            System.out.println("Salário líquido: " + (salario + bonificacao1));
        }else if ((salario >= 1000) && (salario < 2000)){
            System.out.println("Nome: " + nome);
            System.out.println("Salário: " + salario);
            System.out.println("Bônus: " + bonificacao2);
            System.out.println("Salário líquido: " + (salario + bonificacao2));
        }else if (salario >= 2000){
            System.out.println("Nome: " + nome);
            System.out.println("Salário: " + salario);
            System.out.println("Desconto: " + desconto);
            System.out.println("Salário líquido: " + (salario - desconto));
        }

    }

}
