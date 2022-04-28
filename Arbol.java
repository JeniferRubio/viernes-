 package Clase02;
 
 class Arbol {
     //atributos
    
   public String nombre;
   public String especie;
   public float altura;
   public int edad;
   public  float diametro;
    //constructor
    Arbol(String nom, String esp, float alt, int años, float diam)
    {
          establecerNombre(nom);
          establecerEspecie(esp);
          establecerAltura(alt);
          establecerEdad(años);
          establecerDiametro(diam);
    }
    //encapsulamiento
    public void establecerNombre(String nom)
    {
     nombre= nom; 
    }
    public String obtenerNombre()
    {
       return nombre;
    }
    public void establecerEspecie(String esp)
    {
     especie= esp; 
    }
    public String obtenerEspecie()
    {
       return especie;
    }
    public void establecerAltura(float alt)
    {
     altura = alt; 
    }
    public float obtenerAltura()
    {
       return altura;
    }
    public void establecerEdad(int años)
    {
     edad =años; 
    }
    public int obtenerEdad()
    {
       return edad;
    }
    public void establecerDiametro(float diam)
    {
     diametro =diam; 
    }
    public float obtenerDiametro()
    {
       return diametro;
    }
     
     //operaciones 
    void curar()
    {
        System.out.println("el tallo del arbol sirve como un remedio de curacion natural");
    }
    void purificar()
    {
        System.out.println("las hojas del arbol purifican el aire contaminado mediante la fotosintesis");
    }
    public static void main(String [] args){
        Arbol arbol1 = new Arbol( "sakura", "cerezo", 14.5f, 6, 12.5f);
        
        System.out.println("El nombre del arbol es: "+arbol1.obtenerNombre());
        System.out.println("El nombre del arbol es: "+arbol1.obtenerEspecie());
        System.out.println("El nombre del arbol es: "+arbol1.obtenerAltura());
        System.out.println("El nombre del arbol es: "+arbol1.obtenerEspecie());
        System.out.println("El nombre del arbol es: "+arbol1.obtenerEdad());
        System.out.println("El nombre del arbol es: "+arbol1.obtenerDiametro());

    } 
}
