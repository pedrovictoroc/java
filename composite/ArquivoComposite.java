import java.util.ArrayList;

public class ArquivoComposite extends ArquivoBase{
    ArrayList<ArquivoBase> arquivos = new ArrayList<ArquivoBase>();

    public ArquivoComposite(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }

    public void printNomeArquivo(){
        System.out.println("|->" + this.nomeArquivo);

        for(ArquivoBase temp : arquivos){
            temp.printNomeArquivo();
        }
    }

    @Override
    public void adicionarArquivo(ArquivoBase novo){
        this.arquivos.add(novo);
    }

    @Override
    public void removerArquivo(String nome) throws Exception{
        for(ArquivoBase temp: arquivos){
            if(temp.getNomeArquivo() == nome){
                this.arquivos.remove(temp);
                return ;
            }
        }
        throw new Exception("Arquivo inexistente!");
    }

    public ArquivoBase getArquivoBase(String nome) throws Exception{
        for(ArquivoBase temp: arquivos){
            if(temp.getNomeArquivo() == nome){
                return temp;
            }
        }
        throw new Exception("Arquivo inexistente!");
    }
}