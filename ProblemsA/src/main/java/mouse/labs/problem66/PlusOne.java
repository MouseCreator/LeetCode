package mouse.labs.problem66;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] sol = new int[digits.length];
        System.arraycopy(digits, 0, sol, 0, digits.length);
        int i = digits.length - 1;
        for (; i >= 0; i--) {
            if (digits[i] == 9) {
                sol[i] = 0;
            } else {
                sol[i] = sol[i] + 1;
                return sol;
            }
        }
        sol = new int[digits.length+1];
        sol[0] = 1;
        return sol;
    }
}
