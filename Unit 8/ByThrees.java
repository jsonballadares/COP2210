public class ByThrees implements Series {
    int val;

    public ByThrees() {
        val = 0;
    }

    @Override
    public int getNext() {
        if (val >= Series.MAX) {
            System.out.println(Series.ERRORMSG);
        } else {
            val += 3;
        }
        return val;
    }
}
