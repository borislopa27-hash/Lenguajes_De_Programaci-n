public class buscarElemento {

    public static int busca(int[] arreglo, int objetivo, int indice) {
        // Caso1: Recorrimos todo el arreglo y no encontramos el elemento
        if (indice == arreglo.length) {
            return -1;
        }
        
        // Caso2: Encontramos el elemento en el índice actual
        if (arreglo[indice] == objetivo) {
            return indice;
        }
        
        // Paso recursivo: Buscamos en la siguiente posición
        return busca(arreglo, objetivo, indice + 1);
    }

    public static void main(String[] args) {
        int[] numeros = {14, 27, 8, 55, 91, 3, 6, 87, 1, 42, 19, 25,};
        int numeroABuscar = 25;
        
        // Siempre iniciamos la búsqueda pasándole el índice 0
        int resultado = busca(numeros, numeroABuscar, 0);
        
        if (resultado != -1) {
            System.out.println("¡Elemento encontrado! Está en el índice: " + resultado);
        } else {
            System.out.println("El elemento " + numeroABuscar + " no se encuentra en el arreglo.");
        }
    }
}