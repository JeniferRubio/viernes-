package Clase02;
class Cliente {
    //atributos
    
    public String nombre;
    public String direccion;
    public int ruc;
    public int telefono;
    // constructor
    Cliente(String nom, String direc, int r, int tel)
    {
      establecerNombre(nom);
      establecerDireccion(direc);
      establecerRuc(r);
      establecerTelefono(tel);
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

    public void establecerDireccion(String direc)
    {
        direccion=direc;
    }
    public String obtenerDireccion()
    {
        return direccion;
    }

    public void establecerRuc(int r)
    {
      ruc=r;
    }
    public int obtenerRuc()
    {
        return ruc;
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
    void comprarProductos()
    {
        System.out.println("rogelio compra zapatos en Bata");
    }
    void verProductos()
    {
        System.out.println("Rogelio ve las addidas forum que venden en Fundamentals y le gusto");
    }

    public static void main(String [] args){
        Cliente cliente1 = new Cliente("Raul", "Romero", 102890839, 979876789);
        
        /*cliente1.nombre = "Rogelio ";
        cliente1.direccion = "Romero";
        cliente1.ruc = 102890839;
        cliente1.telefono = 987678234;*/

        System.out.println("El nombre del cliente es: "+cliente1.obtenerNombre());
        System.out.println("el direccion del cliente es: "+cliente1.obtenerDireccion());
        System.out.println("ruc del cliente es: "+cliente1.obtenerRuc());
        System.out.println("El telefono del cliente es: "+cliente1.obtenerTelefono());
        cliente1.verProductos();
        cliente1.comprarProductos();

    } 
}
