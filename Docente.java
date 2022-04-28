package Clase02;
class Docente
{
    //atributos
    public String nombre;
    public String apellido;
    public String direccion;
    public int id;
    public int telefono;
    //constructor
    Docente(String nom, String apell,String direc,int a, int tel)
    {
      establecerNombre(nom);
      establecerApellido(apell);
      establecerDireccion(direc);
      establecerId(a);
      establecerTelefono(tel);
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
    public void establecerId(int a)
    {
        id=a;
    }
    public int obtenerId()
    {
        return id;
    }

    public void establecerTelefono(int tel)
    {
        telefono= tel;
    }
    public int obtenerTelefono()
    {
        return telefono;
    }
    //operaciones
    void enseniar()
    {
        System.out.println("el docente ensenia programacion");
    }
     
    void planificarCurso()
    {
        System.out.println("el docente planifica los temas de estudio");
    }

    void motivarAlumno()
    {
        System.out.println("el docente motiva a Andres a hacer su tarea");
    }


    public static void main(String [] args){
        Docente docente1 = new Docente("Rogelio","Rodriguez Mora","jr: Aguilar 456",2626678,962456376);
        
        /*docente1.nombre = "Braulio";
        docente1.apellido = "Rodriguez Mora";
        docente1.ID = 2626678;
        docente1.direccion = "jr: Aguilar 456";
        docente1.telefono = 962456376;*/

        System.out.println("El nombre del docente es: "+docente1.obtenerNombre());
        System.out.println("El apellido del docente es: "+docente1.obtenerApellido());
        System.out.println("El ID del docente es: "+docente1.obtenerId());
        System.out.println("La direccion del docente es: "+docente1.obtenerDireccion());
        System.out.println("El telefono del docente es: "+docente1.obtenerTelefono());
        docente1.enseniar();
        docente1.planificarCurso();
        docente1.motivarAlumno();

    } 
}
