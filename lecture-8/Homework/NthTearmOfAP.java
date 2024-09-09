public class NthTearmOfAP {
    public int nthAPTearm(int firstTearm , int commonDifference , int n ){
        return firstTearm + ((n - 1) * commonDifference);
    }

    public static void main(String[] args) {
        NthTearmOfAP obj = new NthTearmOfAP();
        System.out.println(obj.nthAPTearm(1, 1, 10));
    }
}
