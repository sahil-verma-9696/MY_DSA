public class DiminishComplement {
    public static void main(String arg[]) {
        int n = 0;
        int comp = ~n;
        int bit = 0;
        while (n != 0) {
            bit++;
            n = n >> 1;
        }
        int mask = (~0)<<bit;

        System.out.println(mask^comp);
        System.out.println(1<<10);
    }
}
