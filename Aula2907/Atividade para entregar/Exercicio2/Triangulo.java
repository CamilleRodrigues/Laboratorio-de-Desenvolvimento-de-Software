package ExercicioDois;

public class Triangulo extends FormaGeometrica {
    public float altura;

    @Override
    public void calcularArea() {
        area = altura * lado /2;
    }
   
}
