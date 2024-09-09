public class NumberOfSetBits {
    public int noOfSetBits(int a , int b){

        int noOfBits = 0;

        while(a!=0){
            noOfBits = noOfBits + (a&1);
            a = a>>1;
        }
        while (b!=0) {
            noOfBits = noOfBits + (b&1);
            b = b>>1;
        }

        return noOfBits;
    }
    public static void main(String[] args) {
        NumberOfSetBits obj = new NumberOfSetBits();
        System.out.println(obj.noOfSetBits(1,2));
    }
}
