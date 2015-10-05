public class Main {

    public static void main(String[] args) {
        Frase frase=new Frase();
        String fraseusuario =frase.PidoFrase();
        //frase.getPalabras(frase.SeparaPalabra(fraseusuario));
        frase.PrintToScrean(frase.contar(fraseusuario));

    }
}
