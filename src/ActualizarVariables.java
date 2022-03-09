
public class ActualizarVariables {
     public static void main(String[] args) {
        int salary = 1000;
        
        //bono + $500
        salary = salary + 500;
        System.out.println(salary);
        
        //pension - $50
        salary = salary - 50;
        System.out.println(salary);
        
        //2 horas extra $30 - Comida:$45
        salary = salary + (30*2) - 45;
        System.out.println(salary);
        
        //Actualizando cadenas de texto
        String employeeName = "Daniel Andres";
        employeeName = employeeName + " " + "Caicedo Bohorquez";
         System.out.println(employeeName);
         
        employeeName = employeeName + " " + "Caicedo Bohorquez";
        System.out.println("tu nombre es: " + employeeName);
         
        
        
    }
    
}
