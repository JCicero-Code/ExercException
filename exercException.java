import java.util.Scanner;


public class Logar {
  public static final String SENHASECRETA = "123456";

  public static void main(String[] args) {
    try {
      Scanner s = new Scanner(System.in);
      System.out.print("Digite seu nome: ");
      String nome = s.nextLine();
      System.out.print("Digite a senha: ");
      String senha = s.nextLine();
      if(!senha.equals(SENHASECRETA)) {
        throw new Exception("Senha incorreta!");
      }
      System.out.println("Senha correta!!!\nBem vindo !!! "+nome);
    } catch (Exception ex) {
      System.out.println("Ocorreu algum erro: "+ ex.getMessage());
    }
  }
}