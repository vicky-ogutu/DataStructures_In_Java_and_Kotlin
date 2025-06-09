public class factorial {

    public static void main(String[]args){

        String name="abcd";
        int length =name.length();

        int factorial=1;

        for (int i=1; i<=length; i++){
            //factorial  *=i;
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
