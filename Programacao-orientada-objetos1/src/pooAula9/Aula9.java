package pooAula9;

public abstract class Aula9 {
    public static void main(String[] args) {
        /*Visitando v1 = new Visitando();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

        /**
        Professor p1 = new Professor();
        p1.setNome("Alan");
        p1.setEspecialidade("informatica");
        p1.setIdade(16);
        p1.setSexo("M");
        p1.setSalario(500);
        
        System.out.println(p1.toString());
        p1.infosProf();
        
        p1.receberAumento(200);

        p1.infosProf();
        */

        tecnico at = new tecnico();
        at.setNome("Alan");
        at.setRegProfissional(01112);
        at.Praticando();
    }
}