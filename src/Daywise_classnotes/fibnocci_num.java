package Daywise_classnotes;

public class fibnocci_num {
    static void main(String args[]){
        int a = 0;
        int b =1;
        for(int i =0 ; i<10;i++) {
            //if(a>10){
            //break;
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        }
    }

