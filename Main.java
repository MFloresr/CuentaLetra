public class Main {

    public static void main(String[] args) {
        Frase frase=new Frase();
	//este comentario es una trampa jajaja
        String fraseusuario =frase.PidoFrase();
        //frase.getPalabras(frase.SeparaPalabra(fraseusuario));
        frase.PrintToScrean(frase.contar(fraseusuario));
        //aquet es un comentari de la practi
    }
}
