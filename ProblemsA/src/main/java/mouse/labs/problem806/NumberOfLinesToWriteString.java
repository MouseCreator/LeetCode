package mouse.labs.problem806;

public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String s) {
        int rowLen = 0;
        int rows = 1;
        int limit = 100;
        for (char ch : s.toCharArray()) {
            rowLen += widths[ch-'a'];
            if (rowLen > limit) {
                rowLen = widths[ch-'a'];
                rows++;
            }
        }
        return new int[] {rows, rowLen};
    }
}
