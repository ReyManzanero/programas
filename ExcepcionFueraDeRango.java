package excepciones.fueraDeRango;

public class ExcepcionFueraDeRango {
   
    public static void main(String[] args) {
       
     try{
      imprimirVector(4);
      //runtime exceptions....//errores de programador
     }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Intentas acceder a una posición fuera del vector");
     }
    }
    
    public static void imprimirVector(int pos){
        int[] vector ={2,3,4};
        System.out.println(vector[0]);
        System.out.println(vector[pos]);
    }
}
