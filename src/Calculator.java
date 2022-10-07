import java.util.Scanner;

public class Calculator {

    public static final String FIRST = "Digite o primeiro número";
    public static final String SECOND = "Digite o segundo número";

    public static void main(String[] args) {

        int response = 1;

        Number n1 = new Number();
        Number n2 = new Number();
        Number res = new Number();
        Scanner scanner = new Scanner(System.in);


        while (response == 1) {

            System.out.println("Digite a opção desejada");
            System.out.println("[ 1 ] - Adição");
            System.out.println("[ 2 ] - Subtração");
            System.out.println("[ 3 ] - Multiplicação");
            System.out.println("[ 4 ] - Divisão");


            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println(FIRST);
                    n1.setValue(scanner.nextDouble());
                    System.out.println(SECOND);
                    n2.setValue(scanner.nextDouble());
                    double result = res.setValue(n1.getValue() + n2.getValue());
                    System.out.printf("O resultado da soma é de %2.2f", result);
                }
                case 2 -> {
                    System.out.println(FIRST);
                    n1.setValue(scanner.nextDouble());
                    System.out.println(SECOND);
                    n2.setValue(scanner.nextDouble());
                    double result = res.setValue(n1.getValue() - n2.getValue());
                    System.out.printf("O resultado da soma é de %2.2f", result);
                }
                case 3 -> {
                    System.out.println(FIRST);
                    n1.setValue(scanner.nextDouble());
                    System.out.println(SECOND);
                    n2.setValue(scanner.nextDouble());
                    double result = res.setValue(n1.getValue() * n2.getValue());
                    System.out.printf("O resultado da soma é de %2.2f", result);
                }
                case 4 -> {
                    System.out.println(FIRST);
                    n1.setValue(scanner.nextDouble());
                    System.out.println(SECOND);
                    n2.setValue(scanner.nextDouble());
                    double result = res.setValue(n1.getValue() / n2.getValue());
                    System.out.printf("O resultado da divisão é de %2.2f", result);
                }

                default -> System.out.println("Opção inválida");

            }
            System.out.println("\nDeseja realizar outra operação?");
            System.out.println("Digite [ 1 ] Sim ou [ 2 ] Não");
            response = scanner.nextInt();
            if (response != 1) {
                System.out.println("Finalizado");
            }
        }
    }
}
