import java.io.*;

class Main{
    public static void abrirArquivo(String nome) throws ArquivoNaoExiste{
        File arquivo = new File(nome);
        if(!arquivo.exists()){
            throw new ArquivoNaoExiste();   
        }else{
            System.out.println("Arquivo existe");
        }
     }

    public static void main(String[] args) throws Exception{
        try{
            String nome = "teste.txt";
            abrirArquivo(nome);

        }catch(ArquivoNaoExiste e){
            System.out.println(e.getMessage());
        }
    }
}