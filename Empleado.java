package Clase02;
 class Empleado {
    //atribuciones
    public String nombre;
    public String cargo;
    public float salario;
    public int edad;
    //constructor
    Empleado(String nom, String car, float sal, int años)
    {
      establecerNombre(nom);
      establecerCargo(car);
      establecerSalario(sal);
      establecerEdad(años);

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
    
    public void establecerCargo(String car)
    {
        cargo=car;
    }
    public String obtenerCargo()
    {
        return cargo;
    }

    public void establecerSalario(float sal)
    {
        salario=sal;
    }
    public float obtenerSalario()
    {
        return salario;
    }
    public void establecerEdad(int años)
    {
     edad =años; 
    }
    public int obtenerEdad()
    {
       return edad;
    }


    public static void main(String [] args){
        Empleado empleado1 = new Empleado("Mateo", "administrador", 1952.56f,43);
        
        /*empleado1.nombre = "Mateo Rogelio ";
        empleado1.cargo= "administrador";
        empleado1.salario = 1954.8f;
        empleado1.edad = 43;*/

        System.out.println("El nombre del empleado es: "+empleado1.obtenerNombre());
        System.out.println("El cargo del empleado es: "+empleado1.obtenerCargo());
        System.out.println("El salario del empleado es: "+empleado1.obtenerSalario());
        System.out.println("La edad del empleado es: "+empleado1.obtenerEdad());

    } 
}
