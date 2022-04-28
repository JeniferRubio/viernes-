package Clase02;
 class Curso 
 {
    //atributos
    public String nombre;
    public String docente;
    public String duracion;
    public int numeroDeAlumnos;
    public float costeDeMatricula;
    
    //constructor 
    Curso(String nom, String doc, String dur, int num, float coste)
    {
      establecerNombre(nom);
      establecerDocente(doc);
      establecerDuracion(dur);
      establecerNumeroDeAlumnos(num);
      establecerCosteDeMatricula(coste);
    }

    //encapsulamiento
     
    public void establecerNombre(String nom)
    {
        nombre=nom;
    }
    public String obtenerNombre()
    {
        return nombre;
    }
    
    public void establecerDocente(String doc)
    {
        docente=doc;
    }
    public String obtenerDocente()
    {
        return docente;
    }

    public void establecerDuracion(String dur)
    {
        duracion=dur;
    }
    public String obtenerDuracion()
    {
        return duracion;
    }

    public void establecerNumeroDeAlumnos(int num)
    {
        numeroDeAlumnos=num;
    }
    public int obtenerNumeroDeAlumnos()
    {
        return numeroDeAlumnos;
    }

    public void establecerCosteDeMatricula(float coste)
    {
       costeDeMatricula= coste;
    }
    public float obtenerCosteDematricula()
    {
        return costeDeMatricula;
    }

    //operaciones
    void desarrollarTemas()
    {
        System.out.println("el curso de matematica desarrollo un tema de fracciones");
    }

    void recuperarConocimientos()
    {
        System.out.println("El curso de matematica Basica me hizo recordar de los exponentes");
    }

    public static void main(String [] args){
        Curso curso1 = new Curso("Matematica Basica", "Rodrigo Fernandez", "2h 30min", 40, 120.45f );
        
        /*curso1.nombre = "Matematica Basica";
        curso1.docente= "Rodrigo Fernandez";
        curso1.duracion = "2h 30min";
        curso1.numeroDeAlumnos = 30;
        curso1.costeDeMatricula = 120.82f;*/

        System.out.println("Nombre del  Curso es: "+curso1.obtenerNombre());
        System.out.println("Docente del  Curso es: "+curso1.obtenerDocente());
        System.out.println("Duracion del  Curso es: "+curso1.obtenerDuracion());
        System.out.println("Numero de alumnos del Curso es: "+curso1.obtenerNumeroDeAlumnos());
        System.out.println("Coste de la matricula del Curso es: "+curso1.obtenerCosteDematricula());
        curso1.recuperarConocimientos();
        curso1.desarrollarTemas();
    } 
}

