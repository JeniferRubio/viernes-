package Clase02;

public class Calefactor {
    
   //atributos
    
   public String color; 
   public String marca; 
   public String modelo;
   public int temperatura;

   //constructor
   Calefactor(String col, String marc, String mode, int tem)
   {
     establecerColor(col);
     establecerMarca(marc);
     establecerModelo(mode);
     establecerTemperatura(tem);

   }

   //encapsulamiento 
   public void establecerColor(String col)
   {
     color=col;
   }
   public String obtenerColor()
   {
      return color; 
   }

   public void establecerMarca(String marc)
   {
      marca= marc;
   }
   public String obtenerMarca()
   {
      return marca;
   }

   
   public void establecerModelo(String mode)
   {
      modelo= mode;
   }
   public String obtenerModelo()
   {
      return modelo;
   }

   public void establecerTemperatura(int tem)
   {
      temperatura= tem;
   }
   public int obtenerTemperatura()
   {
      return temperatura;
   }


    //operaciones


   void fijarTemperatura()
   {
       System.out.println("El calefactor fija la temperatura para estar calentitos");
   }

   public static void main(String[] args)
   {
      Calefactor calefactor1 = new Calefactor("blanco", "Rowenta","S06510F2", 250);
       
     /* calefactor1.color = "Negro";
      calefactor1.marca = "Rowenta";
      calefactor1.modelo = "SO6510F2";
      calefactor1.temperatura =  250;*/

      System.out.println("La color del calefactor es: "+calefactor1.obtenerColor());
      System.out.println("La marca de la moto es: "+calefactor1.obtenerMarca());
      System.out.println("el modelo de la moto es: "+calefactor1.obtenerModelo());
      System.out.println("El temperatura del calefactor es: "+calefactor1.obtenerTemperatura());
      calefactor1.fijarTemperatura();
   }

}
