class Teste{
    public class main void(String args[]){
        Sistema s = new Sistema();
        s.criarContaXPTOBasic(1);
        s.criarContaXPTOPlus(2);
        s.criarContaXPTOExtreme(3);
        for(int i = 1; i<=3; i++) s.credita
        r(i,1000);
        for(int i = 1; i<=3; i++) s.debitar(i,10);
        //todas as igualdades devem ser verdadeiras
        s.consultarSaldo(1) == 990 ;
        s.consultarSaldo(2) == 995 ;
        s.consultarSaldo(3) == 992.02 ;     
    }
}