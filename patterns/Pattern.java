public class Pattern {

    /**
     *   0  1  2  3  4
     * 0 2
     * 1 8  7
     * 2 13 12 10
     * 3 17 16 14 11
     * 4 20 19 17 14 10
     */
    public static void main(String arg[]) {
        // int s = 2;
        // int inc = 6;
        // int i = 0;
        // while(i < 5){
        //     int j = 0;
        //     int p = s;

        //     while(j <= i){
        //         p-=j;
        //         System.out.print(p+" ");
        //         j++;
        //     }
        //     System.out.println();
        //     s+=inc;
        //     inc--;
        //     i++;
        // }

        for(int i = 0, inc = 6, s = 2; i < 5; i++, s+=inc, inc--){
            for(int j = 0, p = s; j <= i; j++, p-=j){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}