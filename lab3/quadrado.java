class Quadrado extends Figura{
    float lado;
    Quadrado(float x, float y, float lado){
        super(x, y, "Quadrado");
        this.lado = lado;
    }

    String desenhar(){
        return super.toString();
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