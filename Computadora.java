package Clase02;
 class Computadora 
 {
     //ATRIBUTOS
    public String marca;
    public String mesDeCompra;
    public String numeroDeSerio;  
    public String referencia;
    public float velocidadDeProcesador;

    //CONSTRUCTOR
    Computadora(String marc, String mes, String num, String ref, float vel)
    {
      establecerMarca(marc);
      establecerMesDeCompra(mes);
      establecerNumeroDeSerie(num);
      establecerReferencia(ref);
      establecerVelocidadDelProcesador(vel);
    }


     //encapsulamiento
    public void establecerMarca(String marc)
    {
        marca=marc;
    }
    public String obtenerMarca()
    {
        return marca;
    }
    
    public void establecerMesDeCompra(String mes)
    {
        mesDeCompra=mes;
    }
    public String obtenerMesDeCompra()
    {
        return mesDeCompra;
    }

    public void establecerNumeroDeSerie(String num)
    {
        numeroDeSerio=num;
    }
    public String obtenerNumeroDeSerie()
    {
        return numeroDeSerio;
    }

    public void establecerReferencia(String ref)
    {
        referencia=ref;
    }
    public String obtenerReferencia()
    {
        return referencia;
    }
     
    public void establecerVelocidadDelProcesador(float vel)
    {
        velocidadDeProcesador= vel;
    }
    public float obtenerVelocidadDeProcesador()
    {
        return velocidadDeProcesador;
    }

    //operaciones
    void informar()
    {
        System.out.println("la computadora informa mediante una busqueda intensa sobre los fenomenos del pais");
    }
    void procesarDatos()
    {
        System.out.println("la computadora procesa datos cuando son ingresados por el usuario");
    }

    public static void main(String [] args){
        Computadora computadora1 = new Computadora("Lenovo", "Mayo", "Computador A62 Lenovo","4A185048W", 3.20f);
        
        /*computadora1.marca = "Lenovo";
        computadora1.mesDeCompra = "Abril";
        computadora1.referencia= "Computador A62 Lenovo" ;
        computadora1.numeroDeSerio = "4A185048W";
        computadora1.velocidadDeProcesador = 3.20f;*/

        System.out.println("La marca de la computadora es: "+computadora1.obtenerMarca());
        System.out.println("Mes de la compra de la computadora es: "+computadora1.obtenerMesDeCompra());
        System.out.println("Referencia de la computadora es: "+computadora1.obtenerReferencia());
        System.out.println("El numero de Serie es: "+computadora1.obtenerNumeroDeSerie());
        System.out.println("La velocidad de su procesador es: "+computadora1.obtenerVelocidadDeProcesador());
        computadora1.informar();
        computadora1.procesarDatos();

    } 
}

