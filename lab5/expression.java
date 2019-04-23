abstract class Expression{
    abstract double operation();
    Expression[] getChild(int i){return null;};
    abstract void add(Expression e);
    abstract void remove(Expression e);
}