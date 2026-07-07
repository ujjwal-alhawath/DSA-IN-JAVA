import java.util.Arrays;

class LC167 {
    public int[] twoSum(int[] numbers, int target) {
     int [] result=new int[2];
     int n = numbers.length-1;
     int i=0;
    while (n>i){
        int x=numbers[n]+numbers[i];
        if(x == target){
            result[0]=i+1;
            result[1]=n+1;
            return result ;
        }
        else if(x>target){
            n=n-1;
        }
        else{
            i=i+1;
        }


    }
    return new int[]{-1,-1};
    }
    public static void main(String[] args) {

                LC167 obj = new LC167();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(obj.twoSum(numbers, target)));
    }


}