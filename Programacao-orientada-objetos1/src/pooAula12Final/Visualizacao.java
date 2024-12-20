package pooAula12Final;

public class Visualizacao {
    private Gafanhoto Espectador;
    private Video filme;
    
    public Visualizacao(Gafanhoto espectador, Video filme) {
        Espectador = espectador;
        this.filme = filme;
        this.Espectador.setTotAssistido(this.Espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return Espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        Espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        }else if( porc <= 50){
            tot = 5;
        }else if ( porc <= 90 ) {
            tot = 8;
        }else{
            tot = 10;
        }

        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao [Espectador=" + Espectador + ", filme=" + filme + "]";
    }
    
}
