package Daywise_classnotes;

import java.util.Scanner;

public class user_input_prgm {

    static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int count =3;
        while(count>0){
            System.out.println("Enter UPI Pin:");
            int upi= sc.nextInt();
            if(upi==3434){
                System.out.println("open");
                break;
            }

             else{
                 count --;
            }
        }

    }
}
