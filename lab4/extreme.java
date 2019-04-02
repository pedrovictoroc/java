class Extreme extends Basic{

    Extreme(int id){
        this.tipo = "Extreme";
        this.id = id;
        this.saldo = 0;
    }

    void creditar(int dinheiro){
        this.saldo += dinheiro*1.02;
    }

    void debitar(int dinheiro){
        this.saldo -= dinheiro*0.98;
    }

    String getTipo(){
        return this.tipo;
    }

    public String toString(){
        return "Tipo: " + getTipo() + "\n ID: " + getID() + "\n Saldo: " + consultarSaldo();
    }
}