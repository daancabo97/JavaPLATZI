
public class OperacionesMatematicas {
    public static void main(String[] args) {
        double a = 2.1;
        double b = 3;
        
        //Devuelve un entero hacia arriba : ceil
        System.out.println("Devuelve un entero hacia arriba : "+Math.ceil(a)); 
        
        //Devuelve un entero hacia abajo : floor
        System.err.println("Devuelve un entero hacia abajo : "+Math.floor(b));
        
        //Devuelve un numero elevado a otro numero : pow
        System.out.println("Devuelve un numero elevado a otro numero : "+Math.pow(a, b));
        
        // Devuelve el numero mayor
        System.out.println("Devuelve el numero mayor : "+Math.max(a, b));
        
        // Devuelve la raiz cuadrada
        System.out.println("Devuelve la raiz cuadrada : "+Math.sqrt(a));
        
        //Calcula el Area de un circulo
        // pi * r2
        System.out.println("Calcula el Area de un circulo : "+Math.PI * Math.pow(b, 2));
        
        //Area de una esfera
        // 4 * pi * r2
        System.out.println("Calcula el Area de una esfera : "+4 * Math.PI * Math.pow(b, 2)); 
        
        //Volumen de una esfera
        //(4/3)* pi *r3
        System.out.println("Calcula el Volumen de una esfera : "+(4/3) * Math.PI * Math.pow(b, 3)); 
        
        
        
       
    }
    
}
