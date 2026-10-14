public class Dispositivo {
    private String nombre;
    private String marca;
    private static int contador = 0;

    public Dispositivo (String nombre, String marca){
   this.nombre = nombre;
   this.marca = marca;

   contador++;
    }
   public static int getTCantidadDis (){
        return contador;
}
}
,