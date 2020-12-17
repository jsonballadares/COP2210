public class NumericFns<T extends Number> {
    T num;

    NumericFns(T ob) {
        this.num = ob;
    }

    boolean absEqual(NumericFns<?> ob) {
        return Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue());
    }

}