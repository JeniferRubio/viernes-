package Clase02;
 class Automovil
 {
    //atributos

    public String propietario;
    public String color; 
    public String marca; 
    public int kilometraje;
    //constructor
    Automovil(String nom, String col, String marc,int km)
    {
      establecerPropietario(nom);
      establecerColor(col);
      establecerMarca(marc);
      establecerKilometraje(kilometraje);
    }

    //Encapsulamiento
    public void establecerPropietario(String nom)
    {
     propietario= nom; 
    }
    public String obtenerPropietario()
    {
       return propietario;
    }

    public void establecerColor(String col)
    {
     color= col; 
    }
    public String obtenerColor()
    {
       return color;
    }

    public void establecerMarca(String marc)
    {
     marca= marc; 
    }
    public String obtenerMarca()
    {
       return marca;
    }

    public void establecerKilometraje(int km)
    {
     kilometraje= km; 
    }
    public int obtenerKilometraje()
    {
       return kilometraje;
    }

     //operaciones
    void transportarPersonas()
    {
        System.out.println("transpota a Keyshi a su trabajo");
    }
    public static void main(String[] args)
    {
       Automovil automovil1 = new Automovil("Keyshi Rubio","blanco","audi", 0);
        
      /* automovil1.propietario = "Keyshi Rubio";
       automovil1.color = "Negro";
       automovil1.marca = "Audi";
       automovil1.km = 0; */

       System.out.println("el propietario del automivil1 es: "+automovil1.obtenerPropietario());
       System.out.println("el color del automivil1 es: "+automovil1.obtenerColor());
       System.out.println("la marca del automivil1 es: "+automovil1.obtenerMarca());
       System.out.println("Los km del automovil1 es: "+automovil1.obtenerKilometraje());
       automovil1.transportarPersonas();
    }

}
