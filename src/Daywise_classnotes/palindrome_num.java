package Daywise_classnotes;

public class palindrome_num {
    static void main(String[] args){
        int n = 565;
        int originalnum = n;
        int reverse =0;
        while(n>0){
            int d = n% 10;
            reverse = reverse * 10 +d;
            n = n/10;
        }if(reverse==originalnum){
            System.out.println(originalnum + " is palindrome");
        }else{
            System.out.println(originalnum + " is not palindrome");
        }
    }





}
