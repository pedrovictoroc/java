public abstract class CoquetelDecorator extends Coquetel{
    Coquetel coquetel;

    public CoquetelDecorator(Coquetel umCoquetel){
        this.coquetel = umCoquetel;
    }

    @Override
    public String getNome(){
        return coquetel.getNome() + " + " + this.nome;
    }

    public double getPreco(){
        return coquetel.getPreco() + this.preco;
    }
}