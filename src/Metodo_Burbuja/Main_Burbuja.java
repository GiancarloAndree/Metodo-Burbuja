package Metodo_Burbuja;

import java.util.Arrays;

public class Main_Burbuja {

    public static void main(String[] args) {
        
       
        int[] numeros = new int[]{4, -2, -4, 0, 80, 45, 95, 1, 5, 54};
        System.out.println("Arreglo a ordenar: " + Arrays.toString(numeros));
        int[] numerosDesc = Metodo_Burbuja.Algoritmo_Descendente.Metodo_Burbuja(numeros);
        System.out.println("Arreglo ordenado ascendentemente: " + Arrays.toString(numerosDesc));
        int[] numerosAsc = Metodo_Burbuja.Algoritmo_Descendente.Metodo_Burbuja(numeros);
        System.out.println("Arreglo ordenado descendentemente: " + Arrays.toString(numerosAsc));
       
     
         
    }
}
