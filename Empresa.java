package Clase02;
 class Empresa 
 {
    //atributos
    public String nombre;
    public String ubicacion;
    public String gerente;
    public String tipoDeEmpresa;
    public int telefono;

    //constructor
    Empresa(String nom, String ubi, String ger, String tipo, int tel)
    {
      establecerNombre(nom);
      establecerUbicacon(ubi);
      establecerGerente(ger);
      establecerTipoDeEmpresa(tipo);
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

    public void establecerUbicacon(String ubi)
    {
        ubicacion=ubi;
    }
    public String obtenerUbicacion()
    {
        return ubicacion;
    }

    public void establecerGerente(String ger)
    {
        gerente=ger;
    }
    public String obtenerGerente()
    {
        return gerente;
    }
    public void establecerTipoDeEmpresa(String tipo)
    {
        tipoDeEmpresa= tipo;
    }
    public String obtenerTipoDeEmpresa()
    {
        return tipoDeEmpresa;
    }

    public void establecerTelefono(int tel)
    {
        telefono= tel;
    }
    public int obtenerTelefono()
    {
        return telefono;
    }



    void brindaServicios()
    {
        System.out.println("CHINCHAYSUYO brinda servicios de transporte");
    }

    public static void main(String [] args){
        Empresa empresa1 = new Empresa("CHINCHAYSUYO","Jirón Seichi Izumi 620, Huánuco","Alfredo Torres","SAC",516760);
        
        /*empresa1.nombre = "CHINCHAYSUYO";
        empresa1.ubicacion = "Jirón Seichi Izumi 620, Huánuco";
        empresa1.gerente= " Alfredo Torres";
        empresa1.tipoDeEmpresa = "SAC";
        empresa1.telefono =  516760;*/

        System.out.println("El nombre de la empresa es: "+empresa1.obtenerNombre());
        System.out.println("El ubicacion de la empresa es: "+empresa1.obtenerUbicacion());
        System.out.println("El gerente de la empresa es: "+empresa1.obtenerGerente());
        System.out.println("El tipo de la empresa es: "+empresa1.obtenerTipoDeEmpresa());
        System.out.println("El telefono de la empresa es: "+empresa1.obtenerTelefono());
        empresa1.brindaServicios();
    } 
}
