public class MultiplyOperation {
    public int getMultiplication(int a, int b) {
        Operator operator1 = (x,x1) -> x*x1;
        return operator1.toOperate(a,b);
    }
}
