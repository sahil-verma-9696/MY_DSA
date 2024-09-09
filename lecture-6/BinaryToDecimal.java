public class BinaryToDecimal{
    public static void main(String arg[]){
        String n = "0000100";
        int c = 0;
        int x = 0;
        
        for(int i = 0; i<n.length(); i++){
            int l = n.length() - 1 - i;
            int ld = Integer.parseInt(String.valueOf(n.charAt(l)));
            x += ld<<c;
            c++;
        }

        System.out.println("decimal : "+ x);
    }
}