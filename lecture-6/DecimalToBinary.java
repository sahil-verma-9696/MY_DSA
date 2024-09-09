public class DecimalToBinary {
    public static void main(String arg[]){
        int decimal = 7;
        String binary = "";
        while(decimal != 0){
            int ld = decimal & 1;
            binary = String.valueOf(ld) + binary;
            decimal = decimal >> 1;
        }
        System.out.println("binary : "+ binary);
        // System.out.println(binary);
    }
}
