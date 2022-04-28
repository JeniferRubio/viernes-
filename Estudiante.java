package Clase02;
class Estudiante
{
    //atributos
    public String nombre;
    public String apellido;
    public String direccion;
    public int codigo;
    public int edad;

    //constructor 
    Estudiante(String nom, String apell, String direc,int cod, int años )
    {
      establecerNombre(nom);
      establecerApellido(apell);
      establecerDireccion(direc);
      establecerCodigo(cod);
      establecerEdad(años);
    }

    //encapsular
    public void establecerNombre(String nom)
    {
        nombre=nom;
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
    public void establecerDireccion(String direc)
    {
        direccion=direc;
    }
    public String obtenerDireccion()
    {
        return direccion;
    }
    public void establecerCodigo(int cod)
    {
        codigo=cod;
    }
    public int obtenerCodigo()
    {
        return codigo;
    }
    public void establecerEdad(int años)
    {
     edad= años; 
    }
    public int obtenerEdad()
    {
       return edad;
    }


    //operaciones
    void aprender()
    {
        System.out.println("Marco aprende a sumar");
    }
    
    void hacerTarea()
    {
        System.out.println("Marco hace tarea de Biologia");
    }
    public static void main(String [] args){
        Estudiante estudiante1 = new Estudiante(" Marco","chavez Mendoza","jr: Orquideas 456",56787357,13);
        
       /* estudiante1.nombre = " Marco";
        estudiante1.apellido = "chavez Mendoza";
        estudiante1.codigo = 56787357;
        estudiante1.direccion = "jr: Orquideas 456";
        estudiante1.edad = 15;*/

        System.out.println("El nombre del estudiante es: "+estudiante1.obtenerNombre());
        System.out.println("El apellido del estudiante es: "+estudiante1.obtenerApellido());
        System.out.println("El codigo del estudiante es: "+estudiante1.obtenerCodigo());
        System.out.println("La direccion del estudiante es: "+estudiante1.obtenerDireccion());
        System.out.println("La edad del estudiante es: "+estudiante1.obtenerEdad());
        estudiante1.aprender();
        estudiante1.hacerTarea();

    } 
}
