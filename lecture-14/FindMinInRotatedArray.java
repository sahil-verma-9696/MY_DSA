public class FindMinInRotatedArray {
    public static void main(String[] args) {
        int arr[] = { 8, 9, 10, 11, 12, 2, 4, 5, 6 };
        int n = arr.length;

        int l = 0;
        int r = n - 1;

        int m = 0;
        while (l < r) {
            m = (l + r) / 2;

            if (arr[m] >= arr[0]) {// left sorted part
                l = m + 1;
            } else {// right sorted part
                r = m ;
            }
        }

        System.out.println("m=" + l + " arr[m]=" + arr[l]);
        System.out.println("m=" + r + " arr[m]=" + arr[r]);

    }

}