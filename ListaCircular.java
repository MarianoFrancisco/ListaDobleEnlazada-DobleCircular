public class ListaCircular extends ListaDoble{
    private Nodo inicio;
    private Nodo finish;
    private int cantidadNodos=0;
    //constructor
    public ListaCircular(){
        super();
    }
    //insertar
    @Override
    public void insertarAlInicio(String info){
        if(inicio==null){
            inicio = new Nodo(null, null, info);
            finish = inicio;
        }else{
            Nodo nuevo = new Nodo(inicio, finish, info);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
        }
        cantidadNodos++;
    }
    @Override
    public void insertarAlFinal(String info){
        if(inicio==null){
            finish = new Nodo(null, null, info);
            inicio = finish;
        }else{
            Nodo nuevo = new Nodo(inicio, finish, info);
            finish.setSiguiente(nuevo);
            finish=nuevo;
        }
        cantidadNodos++;
    }
    @Override
    public String eliminarInicio(){
        String dato = inicio.getInfo();
        inicio=inicio.getSiguiente();
        if (inicio!=null) {
            inicio.setAnterior(finish);
        } else {
            finish=null;
        }
        cantidadNodos--;
        return dato;
    }
    @Override
    public String eliminarFinish(){
        String dato= finish.getInfo();
        finish=finish.getAnterior();
        if (finish!=null) {
            finish.setSiguiente(inicio);
        } else {
            inicio=null;
        }
        cantidadNodos--;
        return dato;
    }
    //imprimit datos inicio final, y viceversa
    @Override
    public void imprimirInicioFin(){
        Nodo temporal= inicio;
        for (int i = 0; i < cantidadNodos; i++) {
            System.out.println(temporal.getInfo());
            temporal=temporal.getSiguiente();
        }
        /* int i = 0;
        do{
            System.out.println(temporal.getInfo());
            temporal=temporal.getSiguiente();
        } while (temporal!=null && !temporal.equals(inicio)); */
    }

    @Override
    public void imprimirFinInicio(){
        Nodo temporal=finish;
        for (int i = 0; i < cantidadNodos; i++) {
            System.out.println(temporal.getInfo());
            temporal=temporal.getAnterior();
        }
        /* do{
            System.out.println(temporal.getInfo());
            temporal=temporal.getAnterior();
        } while (temporal!=null && !temporal.equals(finish)); */
    }
    //busqueda
    @Override
    public Boolean buscarInfo(String info){
        Nodo temporal=inicio;
        for (int i = 0; i < cantidadNodos; i++) {
            if (temporal.getInfo().equals(info)) {
                return true;
            }
            temporal=temporal.getSiguiente();
        }
        return false;
    }

}
