abstract class Figura{
    float x;
    float y;
    String tipo;

    Figura(float x, float y, String tipo){
        this.x = x;
        this.y = y;
        this.tipo = tipo;    
    }

    public String toString(){
        return this.tipo;
    }

    public abstract void mover(float x, float y);
    public abstract float calcularArea();
}