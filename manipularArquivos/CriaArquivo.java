import java.io.File;

class CriaArquivo{
    public static void main(String[] args) throws Exception{
        File arquivo = new File("teste.txt");
        //System.out.println(arquivo.createNewFile());
        System.out.println(arquivo.exists());
        System.out.println(arquivo.getName());
        System.out.println(arquivo.getAbsolutePath());
        System.out.println(arquivo.delete());
    }
}