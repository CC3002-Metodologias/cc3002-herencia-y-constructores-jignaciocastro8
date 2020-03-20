public class Estudiante extends Persona {
    //Variables:
    protected String carrera;

    //Constructor:
    public Estudiante(String Nombre, String Ocupacion, int Edad, String Carrera) {
        super(Nombre, Ocupacion, Edad);
        this.carrera = Carrera;
    }

    //Métodos:
    public void comer(){
        System.out.println("Ñom Ñom completos de Gorbea");
    }
    public void dormir(){
        System.out.println("ZzZzZz");
    }
    public void hacerLoSuyo(){
        System.out.println("Ver anime o Netflix y hacer cuarentena");
    }

}
