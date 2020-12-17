public class ByTwos implements Series {
    int val;

    public ByTwos() {
        val = 0;
    }

    public int getPrev() {
        val -= 2;
        return val;
    }

    @Override
    public int getNext() {
        if (val >= Series.MAX) {
            System.out.println(Series.ERRORMSG);
        } else {
            val += 2;
        }
        return val;
    }

}