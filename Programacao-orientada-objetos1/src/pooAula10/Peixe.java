package pooAula10;

public class Peixe extends Animal {
    private String corEscama;
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    public void soltarBolha(){
        System.out.println("soltando bolha");
    }

    @Override
    public void locomover(){
        System.out.println("nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo Substancias");
    }

    @Override
    public void emitirSom(){
        System.out.println("som de peixe");
    }

}
