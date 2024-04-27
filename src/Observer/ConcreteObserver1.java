
package Observer;
import Publisher.*;
import javax.swing.JOptionPane;

public class ConcreteObserver1 implements Observer {
    
    //referencia de publisher para poder obtener el nombre de la revista (del cambio de estado)
    private Publisher publisher;
    
    //Un concreteObserver tiene un publisher en especifico, por eso lo recibe de parametro
    public ConcreteObserver1(Publisher publisher){
        this.publisher = publisher;
    }
    
    //Sobreescribimos el metodo actualizar para verificar que si se notifico al concrete observer del cambio de estado
    //cambio estado = publicacion nueva revista
    @Override
    public void actualizar() {
        JOptionPane.showMessageDialog(null, "Notificado Concrete Observer 1\n" 
                + "¡Se acabo de publicar la revista: " + publisher.getEstado() + "!");
    }
    
}
