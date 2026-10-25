package Daywise_classnotes;

public class array8_ele {
    static void main(String[] args){
        int a [] = {12,34,90,34,54,87,56,89,74};
        int n=89;
        boolean is_num_pre = false;
        for(int i : a){
            if (i == n){
                is_num_pre = true;
                break;
            }
        }System.out.println(is_num_pre ? "ele is present": "ele is not present");
    }
}
