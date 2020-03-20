public class Academico extends Persona {

    //Variables:
    private String paper;

    //Constructor propio:
    public Academico(String Nombre, String Ocupacion, int Edad, String Paper){
        super(Nombre, Ocupacion, Edad);
        this.paper = Paper;
    }

    //Métodos:
    public void dormir() {
        System.out.println("ZzzZzzZ");
    }

    public void hacerLoSuyo() {
        System.out.println("Hacer cuarentena y aprender a ocupar Zoom");;
    }
    public void publicarPaper(){
        this.paper = "Paper publicado, asignar paper";
    }
}
