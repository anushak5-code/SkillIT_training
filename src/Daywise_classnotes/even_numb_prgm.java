package Daywise_classnotes;

public class even_numb_prgm {

    static void main(String[] args){
        //even no. 30 31 32 34 35 36 37 38 39 40 , count = 5
        int even = 30;
        int count = 10;
        while(count>0)
        {
           if(even % 2 == 0){
              System.out.println(even);
                count --;
           }
               even++;
        }

    }
}
