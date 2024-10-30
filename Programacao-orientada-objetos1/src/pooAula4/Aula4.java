package pooAula4;
public class Aula4 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        
        p1.abrirConta("CC");
        p1.setDono("Alan");
        p1.estadoAtual();
        p1.depositar(30);
        p1.estadoAtual();
        p1.pegarEmprestimo(1000);
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(22222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p1.sacar(150);

        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}