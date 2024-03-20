import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor numérico: ");

        int numero = scanner.nextInt();
         
        Integer numeroWrapper = Integer.valueOf(numero);
                    
        System.out.println("O valor convertido para Integer é: " + numeroWrapper);

        scanner.close();
    }
}
