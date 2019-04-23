class Operator extends Expression{
    char operation;

    Expression right, left;

    Operator(Expression left, char op, Expression right){
        this.right  = right;
        operation = op;
        this.left = left;
    }

    double operation(){
        if(operation == '*'){
            return left.operation() * right.operation(); 
        } else {
            return left.operation() / right.operation();
        }
    }

    Expression[] getChild(int i){return null;}

}