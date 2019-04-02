class Basic extends Conta{

    Basic(int id){
        this.tipo = "Basic";
        this.id = id;
        this.saldo = 0;    
    }

    void creditar(int dinheiro){
        this.saldo += dinheiro;
    }

    void debitar(int dinheiro){
        this.saldo -= dinheiro;
    }

    String getTipo(){
        return this.tipo;
    }

    public String toString(){
        return "Tipo: " + getTipo() + "\n ID: " + getID() + "\n Saldo: " + consultarSaldo();
    }
}