package pooAula9;

public abstract class Aula9 {
    public static void main(String[] args) {
        //Visitando v1 = new Visitando();
        //v1.setNome("Juvenal");
        //v1.setIdade(22);
        //v1.setSexo("M");
        //System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(11111);
        a1.setCurso("informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
    }
}