package pooAula8;

public class Aula8 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Alan");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabi");

        p1.setSexo("M");
        p4.setSexo("F");

        p2.setCurso("Informatica");
        p3.setSalario(2550.5f);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}