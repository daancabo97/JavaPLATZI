//Ejm : Casteo -> Convierte un tipo de dato Grande a uno mas pequeño, castea el resultado de dos datos

public class Casting {

    public static void main(String[] args) {

        // -> En un año ubique 30 perritos
        // -> Cuantos perritos ubique al mes?
        double monthlyDogs = 30.0 / 12.0;    // -> divide 30 perros por 12 meses del año
        System.out.println(monthlyDogs);

        
        // ESTIMACION: Convertir este tipo de dato double a un entero 
        int estimateMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimateMonthlyDogs);

        
        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a / b);
        
        
        
        //
        char n = '1';               // -> Caso donde char si cabe en int, puedo ejecutar el sato sin castear
        int nI = n;
        System.out.println(nI);

        
        //
        short nS = (short) n;      // -> Caso donde char no cabe en short porque short es una variable mas pequeña y me obliga a ejecutar un casting 
        System.out.println(nS);
    }

}
