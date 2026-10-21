package Daywise_classnotes;

public class Program1 {

    static void main(String[] args){

        //factorial 6*5*4*3*2*1
        int fact=1; // fact = 6*5*4*3*2*1
        int num = 6;  //fact = fact * num
        for (int i = 1; i<=num; i++){
            fact = fact*i;
           System.out.println(fact);
        }

    }

}
