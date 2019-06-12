class Main{
    public static void main(String[] args){
        Coquetel meuCoquetel = new Cachaca();

        meuCoquetel = new Caipirinha(meuCoquetel);
        meuCoquetel = new Tequila(meuCoquetel);
        System.out.println(meuCoquetel.getNome() +
                " == " + meuCoquetel.getPreco());
    }
}