package pooAula8;

public class Aluno extends Pessoa {
    private int matr;
    private String Curso;

    public void cancelarMatr(){
        System.out.println("Matricula será cancelada");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    

}
