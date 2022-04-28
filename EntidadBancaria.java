package Clase02;
class EntidadBancaria {
    //atributos
    public String nombre;
    public String gmail;
    public String ubicacion;
    public String asesores;

    //constructor 
    EntidadBancaria(String nom,String correo, String ubi, String ases)
    {
       establecerNombre(nom);
       establecerGmail(correo);
       establecerUbicacon(ubi);
       establecerAsesores(ases);
    }

    public void establecerNombre(String nom)
    {
        nombre=nom;
    }
    public String obtenerNombre()
    {
        return nombre;
    }

    public void establecerGmail(String correo)
    {
        gmail=correo;
    }
    public String obtenerGmail()
    {
        return gmail;
    }

    public void establecerUbicacon(String ubi)
    {
        ubicacion=ubi;
    }
    public String obtenerUbicacion()
    {
        return ubicacion;
    }

    public void establecerAsesores(String ases)
    {
        asesores=ases;
    }
    public String obtenerAsesores()
    {
        return asesores;
    }


    void hacerPagos()
    {
        System.out.println("Roger paga el prestamo que le dio el banco la vez pasada");
    }
    void depositar()
    {
        System.out.println("Roger deposita 1000 soles a Maria");
    }
    public static void main(String [] args){
       EntidadBancaria entidad1 = new EntidadBancaria("BANCO DE TODOS","BANCODETODOS2020@gmail.com","jr: 28 de julio 308"," Luis Palermo");
        
        /*entidad1.nombre = "BANCO DE TODOS";
        entidad1.gmail = "BANCODETODOS2020@gmail.com";
        entidad1.ubicacion = "jr: 28 de julio 308";
        entidad1.asesores = "Jesus Marengo";*/

        System.out.println("El nombre de la entidad bancaria es: "+entidad1.obtenerNombre());
        System.out.println("El gmail de la entidad bancaria es: "+entidad1.obtenerGmail());
        System.out.println("Ubicacion de la entidad bancaria es: "+entidad1.obtenerUbicacion());
        System.out.println("Asesores de la entidad bancaria es: "+entidad1.obtenerAsesores());
        entidad1.hacerPagos();
        entidad1.depositar();
    } 
}
