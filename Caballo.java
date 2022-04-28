package Clase02;
 
 class Caballo {
     //atributos
    
    public String nombre;
    public String tamanio;
    public int peso;
    public int edad;
    public String color;
     //constructor
     Caballo(String nom, String tam, int pe, int años,String col )
     {
      establecerNombre(nom);
      establecerTamanio(tam);
      establecerPeso(pe);
      establecerEdad(años);
      establecerColor(col);
     }

     //encapsulamiento
     public void establecerNombre(String nom)
     {
         nombre = nom;
     }
     public String obtenerNombre()
     {
         return nombre;
     }

     public void establecerTamanio(String tam)
     {
        tamanio= tam;
     }
     public String obtenerTamanio()
     {
         return tamanio;
     }

     public void establecerPeso(int pe)
     {
         peso=pe;
     }
     public int obtenerPeso()
     {
         return peso;
     }

     public void establecerEdad(int años)
     {
       edad=años; 
     }
     public int obtenerEdad()
     {
         return edad;
     }

     public void establecerColor(String col)
     {
         color=col;
     }
     public String obtenerColor()
     {
         return color;
     }
     //operaciones
    void trasladar()
    {
        System.out.println("utilizan a Sandra para trasladar abono");
    }

    void comer()
    {
        System.out.println("sandra come manzanas por las tardes");
    }

    public static void main(String [] args){
        Caballo Caballo1 = new Caballo("Sandra", "mediano", 300, 2, "blanco");
        
        /*Caballo1.nombre = "Sandra";
        Caballo1.tamanio = "mediano";
        Caballo1.peso = 300;
        Caballo1.color = "Blanco";
        Caballo1.edad = 2;*/

        System.out.println("El nombre del Caballo es: "+Caballo1.obtenerNombre());
        System.out.println("El tamanio del Caballo es: "+Caballo1.obtenerTamanio());
        System.out.println("La peso del Caballo es: "+Caballo1.obtenerPeso());
        System.out.println("La edad del Caballo es: "+Caballo1.obtenerEdad());
        System.out.println("El color del Caballo es: "+Caballo1.obtenerColor());
        Caballo1.comer();
        Caballo1.trasladar();


    } 
}
