public class Nodo {
    private Nodo siguiente;
    private Nodo anterior;
    private String info;

    public Nodo(Nodo siguiente, Nodo anterior, String info) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.info = info;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    

    
}
