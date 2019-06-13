import java.io.*;

class Arquivo{
    private File arquivo;

    Arquivo(String nome){
        this.arquivo = new File(nome);
    }

    public void copiarArquivo() throws ArquivoNaoExiste{
        if(!this.arquivo.exists()){
            throw new ArquivoNaoExiste();
        }else{
            try{
                Arquivo input = new Arquivo("entrada.txt");
                Arquivo output = new Arquivo("saida.txt");

                FileReader entrada = new FileReader(input.arquivo);
                FileWriter saida = new FileWriter(output.arquivo);
                int c;

                while((c = entrada.read()) != -1){
                    saida.write(c);
                }
                
                entrada.close();
                saida.close();
            }catch(Exception e){
                e.getStackTrace();
            }
        }
    }
}
