import java.util.Scanner;

public class Frase {

    private Scanner input=new Scanner(System.in);
    String[] Palabras = {};

    public String[] SeparaPalabra(String frase){
        for(int i=0;i<frase.length();i++){
            Palabras = frase.split(" ");
        }
        return Palabras;
    }

    public void getPalabras(String[] Palabras){
        for(int i=Palabras.length-1;i>=0;i--){
            System.out.print(Palabras[i]+ " ");
        }
    }

    public String PidoFrase(){
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine();
        return frase;
    }

    //contar letras
    //contar letras aprovechamos clase
    public int[] contar(String frase){
        int[] caracteres = new int[26];
        for (int i=0;i<frase.length();i++){
            char letra = frase.charAt(i);
            if(Character.isUpperCase(letra)){
                letra = Character.toLowerCase(letra);
            }
            if ((letra>='a' && letra <='z')){
                caracteres[letra -'a']++;
            }if(letra>= '0' && letra<= '9'){
                System.out.println(letra+ " es un numero");
            }
        }
        return caracteres;
    }
    public void PrintToScrean(int[] caracteres){
        for (int i=0;i<caracteres.length;i++){
            if(caracteres[i]>1){
                System.out.println((char) (i+'a')+ " sale: "+ caracteres[i]+ "veces");
            }if (caracteres[i] == 1){
                System.out.println((char) (i+'a')+ " sale: "+ caracteres[i]+ "vez");
            }
        }
    }

}
