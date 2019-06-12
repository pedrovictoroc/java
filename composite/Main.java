class Main{
    public static void main(String[] args){
        ArquivoBase pasta = new ArquivoComposite("Pasta");
        ArquivoBase pasta2 = new ArquivoComposite("Pasta2");
        ArquivoBase video = new ArquivoVideo("video");
        ArquivoBase arquivo = new ArquivoComposite("arquivo");

        try{
            pasta.adicionarArquivo((ArquivoComposite)pasta2);
            pasta2.adicionarArquivo(arquivo);
            pasta2.adicionarArquivo(video);
            pasta.printNomeArquivo();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}