import java.io.*;

public class EscreveArquivo{
    public static void main(String[] args){
        try{
            File arquivo = new File("escrita.txt");
            FileWriter saida = new FileWriter(arquivo);
            String texto = "olá";
            texto = texto + "\nteste\ntestandooo";
            saida.write(texto);

            saida.close();


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}