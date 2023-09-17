import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci Serisi Eleman Sayısını Girin: ");
        int elemanSayisi = scanner.nextInt();

        int fib1 = 0, fib2 = 1;

        System.out.print("Fibonacci Serisi: ");

        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(fib1 + " ");

            int sonrakiFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = sonrakiFib;
        }

       
    }
}

