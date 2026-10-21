package Daywise_classnotes;

public class Program2 {
    static void main(String[] args){
        //num = 5 power = 3 5*5*5
        // num = 6 power = 6 6*6*6*6*6*6
        //num = 2 power =2 2*2

        int num=4;
        int p = 3;
        int power=1;
        for(int i = 1; i <=p ;i++){
            power = power*num;


        }

        System.out.println(power);
    }

}
