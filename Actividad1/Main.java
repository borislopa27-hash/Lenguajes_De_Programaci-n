public class Main {
    static int maximo (int t[], int pos)
    {
        int res;
        if(pos==t.length-1) // caso base: pos indica el último elemento de t
            res=t[pos];
        else
        {
            int k;
            k = maximo (t,pos+1); // k será el mayor desde la posición pos+1 hasta el último elemento
            if (t[pos]>k) // si t[pos] es mayor que k
                res = t[pos]; //t[pos] es el máximo
            else
                res = k; // en caso contrario será k el máximo
        }
        return(res);
    }
 
    static int maximo (int t[])
    {
        return (maximo (t,0));
    }
 
    public static void main(String[] args) {
        int datos[];
        int max;
 
        // Definie una lista de 10 enteros
        datos = new int[10];
        for (int i = 0; i < datos.length; i++)
            datos[i] = (int) (Math.random()*1000+1);
 
        System.out.println("Los datos son:");
        for (int i = 0; i < datos.length; i++)
            System.out.print(datos[i] + " ");
 
        max =maximo(datos);
        System.out.println("\n\nEl máximo es: " + max);
    }
}