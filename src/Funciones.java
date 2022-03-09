import java.util.Scanner;

public class Funciones {

    public static void main(String[] args) {
        double y = 3;

        //Calcula el Area de un circulo
        // pi * r2    
        System.out.println(circleArea(y));

        //Area de una esfera
        // 4 * pi * r2
        System.out.println(AreaEsfera(y));

        //Volumen de una esfera
        //(4/3)* pi *r3
        System.out.println(VolumenEsfera(y));
   
        //
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu moneda: ");
        String moneda;
        moneda = sc.nextLine();

        System.out.print("Ingresa la cantidad: ");
        double cantidad;
        cantidad = sc.nextInt();

        double conversion = convertirMoneda(moneda, cantidad);
        System.out.println("El peso en dolares es: " + conversion);

        sc.close();
        
    }

    public static double circleArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double AreaEsfera(double r) {
        return 4 * Math.PI * Math.pow(r, 2);

    }

    public static double VolumenEsfera(double r) {
        return (4 / 3) * Math.PI * Math.pow(r, 3);

    }

   public static double convertirMoneda(String moneda, double cantidad) {
        switch (moneda) {
            case "MXN":
                cantidad = cantidad * 0.052;
                break;
            case "COL":
                cantidad = cantidad * 0.00031;
                break;        
            default:
                System.out.println("Ingresa una moneda correcta");
        }

        return cantidad;
    }

    
}