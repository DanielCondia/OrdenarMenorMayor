public class Main {
    public static void main(String[] args) {
        //Creamos array a para ordenar
        int[] a = {1,2,4,3,5};
        //Creamos array ordenado con la misma longitud que a
        int[] arrayOrdenado = new int[a.length];
        //Creamos boolean control para que me controle el ciclo do while
        boolean control = true;
       do {
           //Creamos int contador para recorrer a
           int contador = 1;
           for (int i = 0; i < a.length; i++) {
               //Si el número anterior es menor que el que le sigue
               if(a[i] < a[contador]){
                   //Agregamos a array ordenado el número que esta en posición de i
                   arrayOrdenado[i] = a[i];
               }
               else{
                   //De lo contrario agregamos a array ordenado en posición de i el número que esta en posición de contador
                   arrayOrdenado[i] = a[contador];
                   //Luego pasamos a array ordenado en posición de contador, lo que esta en a en posición de i
                   arrayOrdenado[contador] = a[i];
                   //Creamos la variable de control para el while, que es igual a lo que esta en contador + 1.
                   int controlWhile = ++contador;
                   while (controlWhile < a.length){
                       //Posicionamos el resto de números de a, en array ordenado
                       arrayOrdenado[controlWhile] = a[contador++];
                       controlWhile++;
                   }
                   //Nos salimos del ciclo for
                   break;
               }
               contador++;
           }
           //Variable que me permite controlar el bucle
           int segundoContador = 1;
           //Variable que me permite controlar la verificación del bucle
           boolean verificadorBooleano = true;
           for (int j = 0; j < arrayOrdenado.length; j++) {
               if(segundoContador == arrayOrdenado.length){
                   segundoContador = arrayOrdenado.length;
                   segundoContador--;
               }
               if(arrayOrdenado[j] <= arrayOrdenado[segundoContador]){
                   //El verificador booleano sigue en true
                   verificadorBooleano = true;
               }
               else{
                   //Borramos el contenido de arrays
                   a = new int [a.length];
                   a = arrayOrdenado;
                   arrayOrdenado = new int [a.length];
                   verificadorBooleano = false;
                   break;
               }
               segundoContador++;
           }

           if(verificadorBooleano){
               control = false;
           }

       }while(control);
        imprimirArreglo(arrayOrdenado);
    }
    public static void imprimirArreglo(int[] arrayOrdenado){
        for (int i = 0; i < arrayOrdenado.length; i++) {
            System.out.println(arrayOrdenado[i]);
        }
    }
}