public class SumarArreglo {

    // Definición de la estructura del nodo
    static class Nodo {
        int valor;
        Nodo siguiente;

        Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    // Función recursiva
    public static int sumarLista(Nodo nodo) {
        // 1. Caso base: si llegamos al final de la lista o está vacía
        if (nodo == null) {
            return 0;
        }

        // 2. Caso recursivo: valor del nodo actual + suma del resto
        return nodo.valor + sumarLista(nodo.siguiente);
    }

    // Crear la lista ligada
    public static Nodo construirLista(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return null;
        }

        Nodo cabeza = new Nodo(arreglo[0]);
        Nodo actual = cabeza;

        for (int i = 1; i < arreglo.length; i++) {
            actual.siguiente = new Nodo(arreglo[i]);
            actual = actual.siguiente;
        }

        return cabeza;
    }

    public static void main(String[] args) {
        // Arreglo de 7 enteros
        int[] datos = {5, 12, 8, 3, 20, 7, 15};

        // Construir la lista
        Nodo lista = construirLista(datos);

        int total = sumarLista(lista);

        System.out.println("Arreglo de entrada: [5, 12, 8, 3, 20, 7, 15]");
        System.out.println("Suma total de la lista ligada: " + total);
    }
}