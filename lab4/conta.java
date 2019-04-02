abstract class Conta{
    String tipo;
    int id = 0;
    float saldo = 0;

    abstract void creditar(int dinheiro);

    abstract void debitar(int dinheiro);

    float consultarSaldo(){
        return this.saldo;
    }

    int getID(){
        return this.id;
    }
}