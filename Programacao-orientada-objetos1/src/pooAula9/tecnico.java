package pooAula9;

public class tecnico extends Aluno{
    private int regProfissional;

    public int getRegProfissional() {
        return regProfissional;
    }

    public void setRegProfissional(int regProfissional) {
        this.regProfissional = regProfissional;
    }

    public void Praticando(){
        System.out.println(this.getNome() + " está praticando seu aprendizado técnico");
    }
}
