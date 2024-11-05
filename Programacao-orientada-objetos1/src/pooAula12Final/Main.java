package pooAula12Final;

public class Main {
    public static void main(String[] args){
       Video v[] = new Video[3];
       v[0] = new Video("Camaro 2012");
       v[1] = new Video("O novo ford Mustang");
       v[2] = new Video("Carros do futuro");

       
       Gafanhoto g[] = new Gafanhoto[2];
       g[0] = new Gafanhoto("Alan", 22, "M", "AlanB10");
       g[1] = new Gafanhoto("Carla", 53, "F", "CarlaSSSouza");

       Visualizacao vis[] = new Visualizacao[5];
       vis[0] = new Visualizacao(g[0], v[2]);

       vis[0].avaliar();
       System.out.println(vis[0].toString());
       
       vis[1] = new Visualizacao(g[0], v[1]);

       vis[0].avaliar(85.0f);
       System.out.println(vis[0].toString());

         

    }
}
