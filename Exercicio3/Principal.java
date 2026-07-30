package ExercicioDois;

public class Principal {
    public static void main(String[] args){
        FormaGeometrica quadrado = new FormaGeometrica();
        quadrado.lado = 3.7f;
        quadrado.calcularArea();
        System.out.println("Área do quadrado: " + quadrado.area);
        
        Triangulo t = new Triangulo();
        t.altura = 3.7f;
        t.lado = 5.4f;
        t.calcularArea();
        System.out.println("Área do triângulo: " + t.area);
    }
    
}
