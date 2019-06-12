public class Tequila extends CoquetelDecorator{
    public Tequila(Coquetel umCoquetel){
        super(umCoquetel);
        nome = "Tequila";
        preco = 3.5;
    }
}