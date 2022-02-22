public class Ejercicio3 {
    private Nodo inicio;
    private Nodo finish;
    //constructor
    public Ejercicio3(){
        inicio=null;
        finish=null;
    }
    //insertar
    public void insertarAlInicio(String info){
        if(inicio==null){
            inicio= new Nodo(null, null, info);
            finish= inicio;
        }else{
            Nodo nuevo = new Nodo(inicio, null, info);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
        }
    }
    public void insertarAlFinal(String dato){
        if(inicio==null){
            finish= new Nodo(null, null, dato);
            inicio = finish;
        }else{
            Nodo nuevo = new Nodo(null, finish, dato);
            finish.setSiguiente(nuevo);
            finish=nuevo;
        }
    }
    //eliminar
    public String eliminarInicio(){
        String dato= inicio.getInfo();
        inicio=inicio.getSiguiente();
        if (inicio!=null) {
            inicio.setAnterior(null);
        } else {
            finish=null;
        }
        return dato;
    }
    public String eliminarFinish(){
        String dato= finish.getInfo();
        finish=finish.getAnterior();
        if (finish!=null) {
            finish.setSiguiente(null);
        } else {
            inicio=null;
        }
        return dato;
    }
    //imprimit datos inicio final, y viceversa
    public void imprimirInicioFin(){
        Nodo temporal=inicio;
        while (temporal!=null) {
            System.out.println(temporal.getInfo());
            temporal=temporal.getSiguiente();
        }
    }
    public void imprimirFinInicio(){
        Nodo temporal=finish;
        while (temporal!=null) {
            System.out.println(temporal.getInfo());
            temporal=temporal.getAnterior();
        }
    }
    //busqueda
    public Boolean buscarInfo(String info){
        Nodo temporal=inicio;
        while (temporal!=null) {
            if (temporal.getInfo().equals(info)) {
                return true;
            }
            temporal=temporal.getSiguiente();
        }
        return false;
    }

}
