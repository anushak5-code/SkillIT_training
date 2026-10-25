package Daywise_classnotes;

public class array9_elecount {
    static void main(String[] args){
        int a [] = {23,10,45,23,10,23,45,23,10};
        int count =0;
        int num = 23;
        for(int i : a){
            if (num==i){
                count++;
            }
        }System.out.println(count);
    }

}
