import java.io.*;
public class LeArquivo{
    public static void main(String[] args){
        try{
            FileReader arquivo = new FileReader("escrita.txt");
            int i = 0;

            while(i != -1){
                i = arquivo.read();
                //char c = (char)i;
                System.out.print(i);
            }
            arquivo.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}