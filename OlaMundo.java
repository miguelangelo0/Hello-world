 import java.util.Scanner;
 public class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Olá , seja bem-vindo!");
	
	Scanner input = new Scanner(System.in);

	String userCerto = "Exemplo";
	String passwordCerta = "Exemplopswd";

	System.out.println("user: ");
	String user = input.nextLine();

	System.out.println("password: ");
	String password = input.nextLine();

	if (user.equals(userCerto) && password.equals(passwordCerta)) {
		System.out.println("Login efetuado com sucesso. Bem-vindo!");
	} else {
		System.out.println("User ou Password incorretos.");
	}
	input.close();



    }
}
