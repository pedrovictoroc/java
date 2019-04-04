class Quadrado extends Figura implements Colorida{
    float lado;
    String cor;

    Quadrado(float x, float y, float lado){
        super(x, y, "Quadrado");
        this.lado = lado;
    }

    String desenhar(){
        return super.toString();
    }

    public void desenhar(String cor){
        System.out.println(cor);
    }

    public void mover(float x, float y){
        super.x += x;
        super.y += y;
    }

    String getPosicao(){
        return "X: " + this.x + "\nY: " + this.y;
    }

    public float calcularArea(){
        return this.lado*this.lado;
    }
}