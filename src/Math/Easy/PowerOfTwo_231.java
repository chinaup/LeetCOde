package Math.Easy;
/*
给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */
public class PowerOfTwo_231 {

    public static void main(String[] args){

        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {

        if(n<=0) return false;
        int flag = 1;
        while(n>1){
            if(n%2==0){
                n=n/2;
            }
            else{
                flag=0;
                break;
            }
        }
        if(flag==1) return true;
        return false;
    }
}
