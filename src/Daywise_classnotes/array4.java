package Daywise_classnotes;

public class array4 {
     static void main(String[] args){
        //armstrong number
        //123 = 1*3+ 2*3 + 3*3
        int count = 0 ;
        int num= 123;
        while(num >0){
            num = num/10;
            count ++;
        }
                System.out.println(count);
    }
}
