package com.mycompany.mavenproject1;

import java.util.Scanner;

class f {

    static Scanner teclat = new Scanner(System.in);
    // ----------------------------------------------------------------------------------------

    public static int lligInt(String pregunta) {
        int numero;
        do {
            try {
                System.out.println(pregunta);
                
                numero = teclat.nextInt(); // Si hem posat lletres, va al catch
                // Si passa per ací, no ha donat error. Buidem \n i tornem el número.
                teclat.nextLine();
                return numero;
            } catch (Exception e) { // Si hem posat lletres, avisa i buida el buffer:
                System.out.print("Ha de ser un número enter:");
                teclat.nextLine();
            }
        } while (true); // Bucle infinit fins que retornem el número correcte.
    }
    // ----------------------------------------------------------------------------------------

    public static float lligFloat(String pregunta) {
        float numero;
        do {
            try {
                System.out.println(pregunta);
                numero = teclat.nextFloat(); // Si hem posat lletres, va al catch
                // Si passa per ací, no ha donat error. Buidem \n i tornem el número.
                teclat.nextLine();
                return numero;
            } catch (Exception e) { // Si hem posat lletres, avisa i buida el buffer:
                System.out.print("Ha de ser un número enter:");
                teclat.nextLine();
            }
        } while (true); // Bucle infinit fins que retornem el número correcte.
    }

// ----------------------------------------------------------------------------------------
public static char lligChar(String pregunta) {
        System.out.print(pregunta);
        String text;
        text = teclat.nextLine();

        while (text.length() != 1) {
            System.out.println("Només 1 lletra.");
            text = teclat.nextLine();
        }
        return text.charAt(0);

    }
// ----------------------------------------------------------------------------------------
    public static String lligString(String pregunta) {
        System.out.print(pregunta);
        return teclat.nextLine();

    }
}