public class NthFibbonacci {

    public int nthFibbo(int n){
        int a = 0;
        int b = 1;
        int c = 0;

        int i = 0;

        while(i != (n-2)){
            c = a+b;
            a = b;
            b = c;

            i++;
        }

        return c; 
    }

    public static void main(String[] args) {
        NthFibbonacci obj = new NthFibbonacci();

        System.out.println(obj.nthFibbo(5));
    }
}
