
package Publisher;
import Observer.*;
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    
    private List<Observer> observadores = new ArrayList<Observer>();
    String estado;
    
    //Retorna el estado (nombre de la revista) que se halla introducido
    public String getEstado(){
        return estado;
    }
    
    //En caso de que se publique una nueva revista (se cambie el estado), notifica a todos los Observadores
    public void setEstado(String estado){
        this.estado = estado;
        //Se publico la revista tal..
        NotifyObservers();
        
    }
    //Metodo para anadir observadores a la lista
    public void addObserver(Observer observer){
        observadores.add(observer);
    }
    //Metodo para remover obsrevadores de la lista
    public void removeObserver(Observer observer){
        observadores.remove(observer);
    }
    
    //Mediante un bucle notificamos a todos los observadores del cambio de estado
    public void NotifyObservers(){
        for(Observer observer: observadores){
            observer.actualizar();
        }
    }
    
}
