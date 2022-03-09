
public class IncrementoDecremento {
    public static void main(String[] args) {
        
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4
        
        lives--;//Decremento
        System.out.println(lives); //3
        
        lives++;//Incremento
        System.out.println(lives); //4
        
        //Prefija 
        // Gana puntos por ganar una vida
//      int puntos = 100 + lives++;  // postfijo lives++
        int puntos = 100 + ++lives;  // postfijo ++lives
        System.out.println(puntos);
        System.out.println(lives);
    }
    
    
}
