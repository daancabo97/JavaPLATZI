//Enteros : byte, short , int , long

public class tiposDeDatos {

    public static void main(String[] args) {

        int n = 12345678;       // int   
        long nL = 1234567891L;  //Long: L al final
        double nD = 123.456123456;  //Double
        float nF = 123.456F;  //Float

        //
        int salary = 1000;
        //pension = 3%
        double pension = salary * 0.03;
        double totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);
        
        String employee = "Daniel Caicedo";
        System.out.println("EMPLOYEE: " + employee + "   " + "SALARY: " + salary);
    }

}
