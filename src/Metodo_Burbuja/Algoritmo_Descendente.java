
package Metodo_Burbuja;

public class Algoritmo_Descendente {
        public static int[] Metodo_Burbuja(int[] numero) {
        int i;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (i = 0; i < numero.length - 1; i++) {
                if (numero[i] < numero[i + 1]) {
                    temp = numero[i];
                    numero[i] = numero[i + 1];
                    numero[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return numero;

    }
}
