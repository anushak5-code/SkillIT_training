package Daywise_classnotes;

public class prime_num {
    static void main(String[] args){
        int num = 11;
        boolean is_prime = true;
        if(num>=1){
            is_prime = true;
        }
        for(int i=2;i<=num/2;i++){
             if(num%i ==0){
                 is_prime = false;
                 break;

             }
        }
              if(is_prime){
                  System.out.println(num +" is prime");
              }
              else{
                  System.out.println(num + "not prime no.");
              }
    }
}
