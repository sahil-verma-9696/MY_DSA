public class FindMaxInRotatedArray {
    public static void main(String[] args) {
        int arr[] = { 8, 9, 12, 2, 4, 5, 6 };
        int n = arr.length;

        int l = 0;
        int r = n - 1;

        int m = 0;

        while (l < r) {
            m = (int) Math.ceil((double) (l + r) / 2);

            // System.out.println("l=" + l + " r=" + r + " m=" + m);
            if (arr[m] > arr[0]) {
                l = m;
            } else if (arr[m] < arr[0]) {
                r = m - 1;
            }
        }
        System.out.println("index="+l+" elem="+arr[l]);
    }
}
