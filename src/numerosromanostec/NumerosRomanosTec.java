/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosromanostec;

import java.util.Scanner;

public class NumerosRomanosTec {

    public static int[] numero = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static String[] numRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner(System.in);
        int i;
        while (true) {
            entradaTeclado = entradaEscaner.nextLine();

            int entrada = Integer.parseInt(entradaTeclado);
            if (entrada == 0) {
                break;
            } else {
                System.out.printf("%-4d", entrada);
                i = 0;
                while (entrada > 0 && entrada <= 1000) {
                    if (entrada >= numero[i]) {
                        System.out.print(numRoman[i]);
                        entrada = entrada - numero[i];
                    } else {
                        i++;
                    }
                }
                System.out.println("");
            }

        }

    }

}
