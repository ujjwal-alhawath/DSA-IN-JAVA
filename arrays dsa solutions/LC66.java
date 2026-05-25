public class LC66 {
    
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9
            digits[i] = 0;
        }

        // Case like 999 -> 1000
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
    public static void main(String[] args) {
        LC66 obj = new LC66();
        int[] digits = {9,9,9};
        int[] result = obj.plusOne(digits);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}

