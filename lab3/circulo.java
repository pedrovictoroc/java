class Circulo extends Figura{
    float raio;
    Circulo(float x, float y, float raio){
        super(x,y,"Circulo");
        this.raio = raio;
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
        return (3.14f*this.raio*this.raio);
    }
}