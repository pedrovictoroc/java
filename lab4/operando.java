class Operand extends Expression {
    private double value;

    Operand (double v){
        value = v;
    }

    double operation(){
        return value;
    }
}