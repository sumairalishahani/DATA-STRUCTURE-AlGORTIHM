public class Min_Max {
    public static void main(String[] args) {
        int [] element={3,5,1,3,7,8,10,6,11,2};
        int max=0;
        int min=0;
        max=element[0];
        min=element[0];

        for (int i:element){
            if(i>max){
                max=i;
            }
        }
        System.out.println("the maximun number is :"+max+"\n");
        for (int j:element){
            if(j<min){
                min=j;
            }
        }
        System.out.println("the minimun number is "+ min
        );

    }
}
