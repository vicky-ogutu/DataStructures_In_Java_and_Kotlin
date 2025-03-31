public class second_largest_item_inArray {
    public static void main(String[] args){

        int[]marks ={10,20,30,40,50,60,70,};
        second(marks);

    }

    public static int second(int[]arr){

        if (arr==null || arr.length<2){
            throw  new RuntimeException();
        }
        int largest =Integer.MIN_VALUE;
        int SecondLargest =Integer.MIN_VALUE;

        for (int x:arr){
            if (x>largest){
                SecondLargest=largest;
                largest=x;
            }
        }
        System.out.println(SecondLargest);
        return SecondLargest;

    }

}
