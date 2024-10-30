package pooAula4;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos Especiais
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean st){
        this.status = st;
    }

    public boolean getStatus(){
        return this.status;
    }

    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }


    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        }else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0 ){
            System.out.println("Conta não pode ser fechado, ainda tem dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechado, debito existente");
        }else{
            this.setStatus(false);
            System.out.println("Conta desabilitada");
        }
    }

    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossivel efetuar saque. Conta inativa!");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() ==  "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com Sucesso por " + this.getDono());
        }else{
            System.out.println("Impossivel pagar uma conta fechado");
        }
    }

}
