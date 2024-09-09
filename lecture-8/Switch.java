public class Switch{
    public static void main(String[] args) {

        int ex = 2;

        switch (
            ex > 3 ? 9 : 5 
        ) {
            case 9:
                System.out.println("hello");
                break;
        }
    }
}