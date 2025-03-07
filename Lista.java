package LIstasEnlazadas;

public class Lista {
    Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void insertarCabeza(int entrada) {
        Nodo nuevo = new Nodo(entrada);
        nuevo.enlace = cabeza;
        cabeza = nuevo;
    }

    public void mostrar() {
        for (Nodo p = cabeza; p!=null; p=p.enlace) {
            System.out.print(p.dato+" ");
        }
    }
}
