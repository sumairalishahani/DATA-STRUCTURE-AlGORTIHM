public class Sum_of_Array {
    public static void main(String[] args) {
        int [] element={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i=0;i< element.length;i++){

            sum+=element[i];

        }
        System.out.println("the sum of first 10 element is :"+sum);
    }
}
