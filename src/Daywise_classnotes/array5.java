package Daywise_classnotes;

public class array5 {

    public static void main(String[] args){
        int [] d = {12,23,34,56,78,345,345,231,23};
        int sum =0;
        for (int i =0 ; i<d.length;i++){
            sum = sum + d[i];
        }System.out.println("Sum = " + sum);
        System.out.println("avg  = " + sum/d.length);
    }

}
