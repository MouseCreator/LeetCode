package mouse.labs.problem295;


import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {

    @Override
    public String toString() {
        return "FindMedianFromDataStream{\n" +
                "median=" + median + "\n" +
                "lower=" + lower + "\n" +
                "higher=" + higher + "\n" +
                "even=" + even + "\n" +
                "root1=" + root1 + "\n" +
                "root2=" + root2 + "\n" +
                '}';
    }

    public FindMedianFromDataStream() {
        lower = new PriorityQueue<>(11, (o1, o2) -> o2 - o1);
        higher = new PriorityQueue<>(11, Comparator.comparingInt(o -> o));
    }
    private Double median = null;
    private final PriorityQueue<Integer> lower;
    private final PriorityQueue<Integer> higher;
    boolean even = false;
    int root1 = 0;
    int root2 = 0;
    public void addNum(int num) {
        even = !even;
        if (median == null) {
            median = (double) num;
            root1 = num;
            root2 = num;
            return;
        }

        if (num < median) {
            if (num > root1) {
                lower.add(root1);
                root1 = num;
                if (even) {
                    higher.add(root2);
                    root2 = num;
                }
            } else {
                addAndPollFrom(num, true);
            }
        } else {
            if (num < root2) {
                higher.add(root2);
                root2 = num;
                if (even) {
                    lower.add(root1);
                    root1 = num;
                }
            } else {
                addAndPollFrom(num, false);
            }
        }
        if (even) {
            median = (double) root1;
        } else {
            median = (root1 + root2) / 2.0;
        }

    }

    private void addAndPollFrom(int num, boolean goDown) {
        if (even) {
            if (goDown) {
                lower.add(num);
                higher.add(root2);
                root2 = root1;
            } else {
                lower.add(root1);
                higher.add(num);
                root1 = root2;
            }
        } else {
            if (goDown) {
                lower.add(num);
                Integer poll = lower.poll();
                assert poll != null;
                root1 = poll;
            } else {
                higher.add(num);
                Integer poll = higher.poll();
                assert poll != null;
                root2 = poll;
            }
        }
    }

    public double findMedian() {
        return median;
    }
}
