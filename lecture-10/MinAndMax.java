public class MinAndMax {
    public static int[] minAndMax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(min > i ){
                min = i;
            }
            if(max < i){
                max = i;
            }
        }
        int [] ans = {min,max};

        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] result = minAndMax(arr);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
