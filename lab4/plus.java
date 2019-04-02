class Plus extends Basic{

    Plus(int id){
        this.tipo = "Plus";
        this.id = id;
        this.saldo = 0;
    }

    void creditar(int dinheiro){
        this.saldo += dinheiro*1.05;
    }

    void debitar(int dinheiro){
        this.saldo -=dinheiro;
    }

    String getTipo(){
        return this.tipo;
    }

    public String toString(){
        return "Tipo: " + getTipo() + "\n ID: " + getID() + "\n Saldo: " + consultarSaldo();
    }
}