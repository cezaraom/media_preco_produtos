import java.util.Locale;
import java.util.Scanner;

public class Porgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de produtos: ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Insira o nome do " + (i + 1) + "º produto: ");
            String nome = sc.nextLine();
            System.out.print("Insira o preço do " + (i + 1) + "º produto: ");
            double preco = sc.nextDouble();
            vect[i] = new Product(nome, preco);
        }

        double somaPrecos = 0;

        for (int i = 0; i < vect.length; i++) {
            somaPrecos += vect[i].getPrice();
        }

        double mediaPrecos = somaPrecos / n;

        System.out.println("Produtos inseridos: ");

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i].getName());
        }

        System.out.printf("Média dos preços: %.2f", mediaPrecos);

        sc.close();

    }
}