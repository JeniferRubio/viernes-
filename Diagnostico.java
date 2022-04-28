package Clase02;
class Diagnostico 
{
    //atributos
    
    public String enfermedad;
    public String observaciones;
    public String recetaMedica;
    //constructor
    Diagnostico(String enfer,String obser, String receta)
    {
       establecerEnfermedad(enfer);
       establecerObservaciones(obser);
       establecerRecetaMedica(receta);
    }

    public void establecerEnfermedad(String enfer)
    {
        enfermedad=enfer;
    }
    public String obtenerEnfermedad()
    {
        return enfermedad;
    }

    public void establecerObservaciones(String obser)
    {
        observaciones=obser;
    }
    public String obtenerObservaciones()
    {
        return observaciones;
    }

    public void establecerRecetaMedica(String receta)
    {
        recetaMedica=receta;
    }
    public String obtenerRecetaMedica()
    {
        return recetaMedica;
    }
    
    //operaciones
    void crearReceta()
    {
        System.out.println("el doctor crea una serie de recetas para parar las dolencias de la paciente");
    }

    public static void main(String [] args){
      Diagnostico diagnostico1 = new Diagnostico("diabetes","ninguna","insulina y dieta");
        
        /*diagnostico1.enfermedad = "diabetes";
        diagnostico1.observaciones = "ninguna";
        diagnostico1.recetaMedica = "insulina y dieta";*/

        System.out.println("Enferdad: "+diagnostico1.obtenerEnfermedad());
        System.out.println("Observaciones: "+diagnostico1.obtenerObservaciones());
        System.out.println("Receyta medica: "+diagnostico1.obtenerRecetaMedica());
        diagnostico1.crearReceta();
       

    } 
}
