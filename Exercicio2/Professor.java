package Heranca;

public class Professor extends Pessoa {
    protected int matricula;
    protected String curso;
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Professor{ " + "matricula: " + matricula + ", curso: " + curso + '}';
    }

}
