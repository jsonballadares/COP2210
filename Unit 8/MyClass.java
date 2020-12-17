public class MyClass<T, D> {
    T ob;
    D ob2;

    MyClass(T ob, D ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }
}
