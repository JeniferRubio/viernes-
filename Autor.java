package Clase02;
 
 class Autor {
     //atributos
    
    public String nombre;
    public String apellido;
    public String paisDeOrigen;
    public int edad;
    public String genero;
     //constructor
     Autor(String nom, String apell, String pais, int años, String gen)
     {
       establecerNombre(nom);
       establecerApellido(apell);
       establecerPaisDeOrigen(pais);
       establecerEdad(años);
       establecerGenero(gen);
     }

     //encapsulamientos
     public void establecerNombre(String nom)
    {
     nombre= nom; 
    }
    public String obtenerNombre()
    {
       return nombre;
    }

    public void establecerApellido(String apell)
    {
     apellido= apell; 
    }
    public String obtenerApellido()
    {
       return apellido;
    }

    public void establecerPaisDeOrigen(String pais)
    {
     paisDeOrigen= pais; 
    }
    public String obtenerPaisDeOrigen()
    {
       return paisDeOrigen;
    }

    public void establecerEdad(int años)
    {
     edad= años; 
    }
    public int obtenerEdad()
    {
       return edad;
    }

    public void establecerGenero(String gen)
    {
     genero= gen; 
    }
    public String obtenerGenero()
    {
       return genero;
    }
     //operaciones
    void crearHistorias()
    {
        System.out.println("carlos crea la historia perfecta de dos hicos enamorados");
    }
    void investigar()
    {
        System.out.println("carlos investiga sobre el romanticismo para plasmar en su historia");
    }

    public static void main(String [] args){
        Autor autor1 = new Autor("Carlos","Ordoñez","Espania",73, "masculino");
        
       /* autor1.nombre = "Carlos";
        autor1.apellido = "Fernandez";
        autor1.paisDeOrigen = "Espania";
        autor1.edad = 73;
        autor1.genero = "Masculino";*/

        System.out.println("El nombre del Autor es: "+autor1.obtenerNombre());
        System.out.println("El apellido del Autor es: "+autor1.obtenerApellido());
        System.out.println("El pais del autor es: "+autor1.obtenerPaisDeOrigen());
        System.out.println("La edad del autor es: "+autor1.obtenerEdad());
        System.out.println("Genero del autor es: "+autor1.obtenerGenero());
        autor1.crearHistorias();
        autor1.investigar();
    } 
}
