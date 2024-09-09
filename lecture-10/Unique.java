import java.util.Stack;

public class Unique {
    public static int uniqueByXor(int[] arr){
        int unique = 0;
        for (int i : arr) {
            unique^=i;
        }
        return unique;
    }

    public static int uniqueByStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (stack.contains(i)) {
                stack.remove(stack.indexOf(i));
            } else {
                stack.add(i);
            }
        }

        return stack.getFirst();
    }

    public static int uniqueByBrute(int[] arr){

        for(int i =0; i<arr.length; i++){
            int c = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    c++;
                }
            }
            if(c == 1){
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 2, 3, 5 };

        // System.out.println(uniqueByStack(arr));
        // System.out.println(uniqueByXor(arr));
        System.out.println(uniqueByBrute(arr));

    }
}