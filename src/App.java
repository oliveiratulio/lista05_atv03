import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEntre com o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("\nEntre com o segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("\nEntre com o terceiro número: ");
        int n3 = sc.nextInt();

        sc.close();
        int resultSoma = calculo(n1, n2, n3);
        System.out.print("\nA soma dos numeros informado foi: " + resultSoma);

    }

    public static int calculo(int n1, int n2, int n3) {
        int soma = n1 + n2 + n3;
        return soma;

    }

}
