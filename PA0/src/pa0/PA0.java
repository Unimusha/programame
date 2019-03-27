package pa0;

public class PA0 {

    //Prueba de subir las cosas desde netbeans
    public static void main(String[] args) {
        boolean finalizar;
        do{
            String entrada = leerEntrada();
            if (!(finalizar = finalDeJuego())){
                logica();
                escribirSalida();
            }
        }while(!finalizar);
    }

    //Jugador 1
    private static String leerEntrada() {
        String entrada = "";
        
        return entrada;
    }

    //Jugador 2
    private static boolean finalDeJuego() {
        boolean fin = false;
        
        return fin;
    }

    //Mario hace esto
    private static void logica() {
        
    }

    //
    private static void escribirSalida() {
        
    }
    
}
