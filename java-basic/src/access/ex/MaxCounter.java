package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (incrementValid()) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }

    private boolean incrementValid() {
        // max 를 초과할 수 없다.
        return count < max;
    }
}
