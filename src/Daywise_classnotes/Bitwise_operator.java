package Daywise_classnotes;

public class Bitwise_operator {
    static void main(String[] args){

        int m,n;
        m = 2;
        n= 3;
        System.out.println(m&n); // 2=0 0 1 0 , 3 = 0 0 1 1 ans = 0 0 1 0   o/p = 2
        System.out.println(m|n); // 2= 0 0 1 0 , 3 = 0 0 1 1 ans = 0 0 1 1 o/p = 3
        System.out.println(m^n); // 2= 0 0 1 0 , 3 = 0 0 1 1 ans = 0 0 0 1 o/p = 1
        n=86;
       // System.out.println(n>> 10);
        System.out.println(n<<4);

    }

}
