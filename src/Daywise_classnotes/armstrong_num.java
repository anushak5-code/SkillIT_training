package Daywise_classnotes;

public class armstrong_num {
     static void main(String[] args){
        int num=23;
        int org_num=num;
        int sum=0;
        while(num>0){
            int digit = num%10; //get last digit from the number
            sum = sum + (digit*digit*digit);
            num = num/10;
        }
        if (sum==org_num){
            System.out.println(org_num + " is armstrong number");
        }
        else{
            System.out.println(org_num + " is Not armstrong number");
        }
    }
}
