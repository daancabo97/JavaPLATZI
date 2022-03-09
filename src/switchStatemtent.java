
public class switchStatemtent {

    public static void main(String[] args) {

        String SelectColor = "Dark";

        switch (SelectColor) {
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Ambar":
                System.out.println("Seleccionaste Ambar Mode");
                break;
            case "Danger":
                System.out.println("Seleccionaste Danger Mode");
                break;
            case "Warning":
                System.out.println("Seleccionaste Warning Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                    System.out.println("Selecciona una opcion valida");
        }

    }
}
