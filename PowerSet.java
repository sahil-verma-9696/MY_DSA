import java.util.*;

public class PowerSet{
    public static void powerSet(List<List<Integer>>ps,int i, int arr[]){
        if(i == arr.length){
            return;
        }
        powerSet(ps,i+1,arr);
        ps.add(new ArrayList<>(arr[i]));
        powerSet(ps,i+1,arr);
    }
    public static void main(String[] args) {
        List<List<Integer>> ps = new ArrayList<>();
        int arr[] = {1,2,3};

        powerSet(ps, 0, arr);

        System.out.println(ps);
    }
}