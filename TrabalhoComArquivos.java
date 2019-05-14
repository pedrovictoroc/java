import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class TrabalhoComArquivos{
    public static void main(String args[]) throws Exception{
        File arquivo = new File("./TrabalhoComArquivos.java");
        System.out.println("Existe: "+ arquivo.exists());
        System.out.println("Nome do arquivo: "+ arquivo.getName());
        System.out.println("Tamanho em bytes: "+ arquivo.length());

    }
}