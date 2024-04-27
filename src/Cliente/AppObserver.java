
package Cliente;
import Publisher.*;
import Observer.*;
import javax.swing.JOptionPane;

public class AppObserver {
    public static void main(String[] args) {
        
        Publisher publisher = new Publisher();
        //Anadimos los concreteObserver a la lista de Observadores del Publicador o notificador(publisher)
        publisher.addObserver(new ConcreteObserver1(publisher));
        publisher.addObserver(new ConcreteObserver2(publisher));       
        //Con los observadores anadidos solo hace falta un cambio en el estado para que se les notifique
        
        // Opciones disponibles
        String opciones[] = {"Publicar revista", "Salir"};


        // Bucle infinito hasta que se seleccione la opción "Salir"
        while (true) {

            // Solicita al usuario que seleccione una opcion
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion:", "Sistema de publicacion de revistas",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            // Si el usuario cierra el cuadro de diálogo o selecciona "Salir", se termina el programa
            if (opcion == null || opcion.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }
                               
            // Dependiendo del rol seleccionado, se realizan diferentes acciones
            switch (opcion) {
                case "Publicar revista":
                    //Recibe el nombre de la nueva revista publicada (se cambia el estado), y lo notifica a los observers
                    //que estan en la lista del publisher
                    publisher.setEstado(JOptionPane.showInputDialog("Introduzca el nombre de la revista: "));
                    break;
                case "Salir":
                    // Termina el programa
                    System.exit(0);
                    break;

                default:
                    // Si se selecciona una opción no válida, se muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Tipo de opcion no valida.");
                    return;
            }
        }
    }
    
}
