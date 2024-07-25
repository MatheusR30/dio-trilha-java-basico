import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /*TODO: Conhecer e importar a classe Scanner.
        Exibir as mensagens para o nosso usuario.
        Obter pelo scanner os valores digitados pelo usuario.
        exibir a mensagem conta criada. */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Seja bem-vindo(a) " + nome + " " + sobrenome);
        System.out.println("Sua conta foi criada com sucesso.");;
    }
}