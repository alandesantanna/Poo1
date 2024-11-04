package pooAula10;

public class Cachorro extends Mamifero{
    
    public void enterrarOsso(){
        System.out.println("Enterrando Osso");
    }

    public void abanarRabo(){
        System.out.println("Abanando rabinho");
    }

    @Override
    public void emitirSom(){
        System.out.println("latindo");
    }
}
