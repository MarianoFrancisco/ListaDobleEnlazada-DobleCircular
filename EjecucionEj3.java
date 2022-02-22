import java.util.Scanner;

public class EjecucionEj3 {

    private static Scanner scanner = new Scanner(System.in);
    private Ejercicio3 lista;

    public static void main(String[] args) {
        EjecucionEj3 ej = new EjecucionEj3();
        ej.menuPrincipal();

    }

    public void menuPrincipal() {
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("----LISTAS ENLAZADAS-----");
            System.out.println("1)Lista enlazada doble \n2)Lista enlazada doble circular \n3)Salir");
            opcion = pedirNumero("Que lista desea probar? ");
            switch (opcion) {
                case 1:
                    lista = new Ejercicio3();
                    menuLista(true);
                    break;
                case 2:
                    //lista = new ListaCircular();
                    menuLista(false);
                    break;
                    case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("\nNo existe esa opcion!");
                    break;
            }
        }
    }

    public void menuLista(boolean listaDoble) {
        int opcion;
        boolean salir = false;
        while (!salir) {
            System.out.println("----LISTA ENLAZADA DOBLE" + (listaDoble ? "" : " CIRCULAR") + "-----");
            System.out.println(
                    "1) Buscar \n2)Eliminar el inicial \n3) Eliminar el final \n4) Agregar al inicio \n5) Agregar al final"
                            + "\n6)Imprimir del inicio al final \n7) imprimir del final al inicio \n8) Regresar");
            opcion = pedirNumero("Seleccione una opcion: ");
            switch (opcion) {
                case 1:
                    contrlBuscar();
                    break;
                case 2:
                    contrlEliminar(true);
                    break;
                case 3:
                    contrlEliminar(false);
                    break;
                case 4:
                    contrlAgregar(true);
                    break;
                case 5:
                    contrlAgregar(false);
                    break;
                case 6:
                    contrlImpr(true);
                    break;
                case 7:
                    contrlImpr(false);
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("\n\nEsa opcion no existe!");
                    break;

            }
        }

    }

    public void contrlBuscar() {
        String palabra = pedirPalabra("Ingrese la palabra que desea buscar: ");
        boolean encontrada = lista.buscarInfo(palabra);
        if (encontrada) {
            System.out.println("\nLa palabra SI ha sido encontrada!");
        } else {
            System.out.println("\nLa palabra NO ha sido encontrada");
        }

    }

    public void contrlEliminar(boolean inicio) {

        if (inicio) {
            lista.eliminarInicio();

        } else {
            lista.eliminarFinish();
        }
        System.out.println("\nLa palabra ha sido eliminada con exito");
    }

    public void contrlAgregar(boolean inicio) {
        String palabra = pedirPalabra("Ingrese la palabra que desea agregar: ");
        if (inicio) {
            lista.insertarAlInicio(palabra);
        } else {
            lista.insertarAlFinal(palabra);
        }
        System.out.println("\nSe ha ingresado la palabra");
    }

    public void contrlImpr(boolean inicio) {
        if (inicio) {
            lista.imprimirInicioFin();

        } else {
            lista.imprimirFinInicio();
        }

        System.out.println("\nSe ha impreso la lista con exito");
    }

    private String pedirPalabra(String mensaje) {
        System.out.print("\n" + mensaje);
        String recolectada = scanner.next();
        return recolectada;
    }

    private int pedirNumero(String mensaje) {
        System.out.print("\n" + mensaje);
        int recolectada = scanner.nextInt();
        return recolectada;
    }
}