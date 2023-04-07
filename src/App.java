import java.util.Scanner;

class main {

    public static void main(String[] args) {
        double n1;
        double n2;
        double soma;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Me der um valor");
        n1 = teclado.nextDouble();
        System.out.println("Me der outro valor");
        n2 = teclado.nextDouble();
        soma = n1 + n2;
        System.out.println("A soma de ambos os valores é " + soma);

    }
}
