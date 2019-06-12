public abstract class ArquivoBase{
    String nomeArquivo;

    public void printNomeArquivo(){
        System.out.println("    |->" + nomeArquivo);
    }

    public String getNomeArquivo(){
        return nomeArquivo;
    }

    public void adicionarArquivo(ArquivoBase arquivo) throws Exception{
        throw new Exception("Não pode adicionar arquivo em: " + this.nomeArquivo + " Não é uma pasta!");
    }

    public void removerArquivo(String nome) throws Exception{
        throw new Exception("Não pode remover arquivo em: " + nome + " Não é uma pasta!");
    }

    public void getArquivo(String nome) throws Exception{
        throw new Exception("Não pode pesquisar arquivo em: " + nome + " Não é uma pasta!");
    }
}