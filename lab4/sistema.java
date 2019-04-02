class Sistema{
    Conta arrayConta[] = new Conta[1000];   //Posição será o ID

    void criarContaXPTOBasic(int id){
        Basic conta = new Basic(id);
        this.arrayConta[id] = conta;
    }

    void criarContaXPTOPlus(int id){
        Plus conta = new Plus(id);

        this.arrayConta[id] = conta;
    }

    void  criarContaXPTOExtreme(int id){
        Extreme conta  = new Extreme(id);

        this.arrayConta[id] = conta;
    }
}