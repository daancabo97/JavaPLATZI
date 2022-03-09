/* 
 * Ejemplo programar simulacion lampara: Bucle While 
 * Consiste en monitorear el estado de la lampara de un dispositivo,
 * si realmente la lamapara esta en estado "TurnON" o "turnOFF"
 */

public class While {
    
  /*
   *
   */
    static boolean isTurnONLight = false;      
    
    public static void main(String[] args) {
     
        turnONOFFLight();
        
        int i = 1;
        while(isTurnONLight && i<= 10){
            PrintSOS();
            i++;
        }
        
    }
    
    public static void PrintSOS() {
        System.out.println(". . . _ _ _ . . .");     
    }
    
    public static boolean turnONOFFLight(){
    
        isTurnONLight = (isTurnONLight)?false:true;     // -> Operador ternario para determinar si la lampaar esta encendida entonces devolvera falso, si la lampara esta apafada entonces devolvera true 
        
        // if(isTurnON_Light){
        //    isTurnON_Light = false;
        // }else{
        //    isTurnON_Light = true;
        // }
        
        return isTurnONLight;
                
    }
}
