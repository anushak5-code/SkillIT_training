package Daywise_classnotes;

public class count_digits {

    static void main (String[] args){

        // m = 456893 c=0
        // 456893/10 = 45689 c= 1
        // 45689/10 = 4568 c= 2
        // 4568/10 = 456 c= 3
        // 456/10 = 45 c= 4
        // 45/10 = 4 c= 5

        int m = 456893; int c =0;
        while (m>0){
            m = m /10 ;
            c++;
        }
        System.out.println(c);
    }
}
