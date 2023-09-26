package clase_26_09_23;

import java.util.Locale;
import java.util.Scanner;

/*
         Pide un número real que represente a un precio y muestre el
         precio con IVA.EL IVA es del 21%
      */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        final double IVA = 0.21;
        System.out.println("Escribe un númereo real");
        double precioSinIVA = sc.nextDouble();

        double precioConIVA = precioSinIVA * (1+IVA);

    }
}
