package excepciones.fueraDeRango;
public class exception2 {

    public static void main(String[] args) {
      try{
          System.out.println("uso de excepciones utilizando: try, catch, finally");
          int n = Integer.parseInt("r");
          //int n = Integer.parseInt("8");
          System.out.println(n);
          // Runtime Exception..Illegal Argument exception
      }catch(NumberFormatException e){
          
          System.out.println("Ocurrio un error: "+e);
      
      }finally{
          System.out.println("'Ejecutando...'");
          }
        
    }
    
}
