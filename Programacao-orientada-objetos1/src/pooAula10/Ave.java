package pooAula10;

public class Ave extends Animal{
    private String corPena;


    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho(){

    }

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void alimentar(){
        System.out.println("bicando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Ave");
    }
}
