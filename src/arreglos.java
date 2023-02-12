
public class arreglos {

    public static void main(String[] args) {

        // 1. Declaracion del arreglo
        int[] enteros;

        // 2.Reservamos espacio de memoria para el arreglo
        enteros = new int[5];

        enteros[0] = 13;
        enteros[1] = 24;
        enteros[2] = 43;
        enteros[3] = 89;
        enteros[4] = 56;

        System.out.println("Enteros : " + enteros[0]);
        
        // 3. Imprimir varios elementos de un arreglo
        int[] Enteros = {10, 27, 38, 41, 50};
        for (int i = 0; i < Enteros.length; i++) {
            System.out.println(Enteros[i]);
        }
       
    }
}
