class Teste{
    public  static void main(String arg[]){
    //Criação de elementos
        Quadrado f1 = new Quadrado(1,2,2);
        Quadrado f2 = new Quadrado(3,4,4);
        Circulo f3 = new Circulo(5,6,6);
        Circulo f4 = new Circulo(7,8,8);

    //teste metodo desenhar
        String a = f1.desenhar();
        System.out.println(a);
        String b = f2.desenhar();
        System.out.println(b);
        String c = f3.desenhar();
        System.out.println(c);
        String d = f4.desenhar();
        System.out.println(d);
    
    //teste metodo mover
        f1.mover(1,2);
        String e = f1.getPosicao();
        System.out.println(a);
        f2.mover(3,4);
        String f = f2.getPosicao();
        System.out.println(b);
        f3.mover(5,6);
        String g = f3.getPosicao();
        System.out.println(c);
        f4.mover(7,8);
        String h = f4.getPosicao();
        System.out.println(d);

    //teste metodo calcular area
        float i = f1.calcularArea();
        System.out.println(i);
        float j = f2.calcularArea();
        System.out.println(j);        
        float k = f3.calcularArea();
        System.out.println(k);
        float l = f4.calcularArea();
        System.out.println(l);
    }
}