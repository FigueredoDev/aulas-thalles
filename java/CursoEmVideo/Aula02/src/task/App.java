package task;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.println("Numero: ");

        int number = sc.nextInt();
        System.out.println("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.println("Limite de saque:");
        Double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.println("Informe a quantia para saque: ");
        double amount = sc.nextDouble();

        acc.withdraw(amount);
        System.out.println("Novo saldo: %.2f %n" + acc.getBalance());

        sc.close();
    }
}
