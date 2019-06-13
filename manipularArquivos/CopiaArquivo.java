import java.io.*;

public class CopiaArquivo{
    public static void main(String[] args) throws Exception{
        File input = new File("entrada.txt");
        File output = new File("saida.txt");

        FileReader entrada = new FileReader(input);
        FileWriter saida = new FileWriter(output);
        int c;

        while((c = entrada.read()) != -1){
            saida.write(c);
        }
    
        entrada.close();
        saida.close();
    
        /*    File input = new File("entrada.txt");
        File output = new File("saida.txt");
        int contador;

        FileInputStream entrada = new FileInputStream(input);
        FileOutputStream saida = new FileOutputStream(output);

        while((contador = entrada.read()) != -1){
            saida.write(contador);
        }

        entrada.close();
        saida.close();
    */
    }
}