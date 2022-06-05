import java.util.Calendar;
import java.util.Scanner;


public class ValidarUsuarioSenha {
    public static void main(String[] args) {
        int hora;
        String login, senha;

        Scanner entrada = new Scanner(System.in);

        Calendar calendario = Calendar.getInstance();
        hora=calendario.get(Calendar.HOUR_OF_DAY);

        System.out.print("Nome do usuário: ");
        login = entrada.nextLine();

        System.out.print("Senha: ");
        senha = entrada.nextLine();

        //Neste exemplo, usaremos o nome de usuário maria, e a senha será 1234.

        if((login.equals("maria") && senha.equals ("1234")) && ((hora>6) && (hora<12))){
            System.out.println("Bom dia, você se logou ao nosso sistema.");

        } else if((login.equals("maria") && senha.equals ("1234")) && ((hora>=12) && (hora<18))) {
            System.out.println("Boa tarde, você se logou ao nosso sistema.");

        }else if ((login.equals("maria") && senha.equals ("1234")) && ((hora>18) && (hora<24))) {
            System.out.println("Boa noite, você se logou ao nosso sistema.");

        } else if ((login.equals("maria") && senha.equals ("1234")) && ((hora>=0) && (hora<6))){
            System.out.println("Boa madrugada, você se logou ao nosso sistema.");

        }else{
            System.out.println("Usuário ou senha incorretos, tente novamente.");
        }


    }

}