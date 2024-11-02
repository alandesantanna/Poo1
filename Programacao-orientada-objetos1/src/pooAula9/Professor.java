package pooAula9;

public class Professor extends Pessoa{
    private String especialidade;
    private int salario;
    
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void receberAumento( int aumento){
        this.setSalario(this.getSalario() + aumento);
    }

    public void infosProf(){
        System.out.println("Professor = [ Especialidade = " + especialidade + ", Salario = " + salario + "]");
    }
    
}
