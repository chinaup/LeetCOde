package BitManipulation.Easy;
/*
给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。

注意:
十六进制中所有字母(a-f)都必须是小写。
十六进制字符串中不能包含多余的前导零。如果要转化的数为0，那么以单个字符'0'来表示；对于其他情况，十六进制字符串中的第一个字符将不会是0字符。
给定的数确保在32位有符号整数范围内。
不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法。

示例 1：
输入:
26
输出:
"1a"

示例 2：
输入:
-1
输出:
"ffffffff"
 */
public class ConvertANumberToHexadecimal_405 {

    public static void main(String[] args){

        System.out.println(toHex(-2));
    }
//    public static String toHex(int num) {
//
//        if(num==0) return "0";
//        int[] a = new int[32];
//        int tmp = Math.abs(num);
//        for(int i=0;i<32;i++)
//            a[i]=(tmp>>i)&1;
//
//
//        if(num<0){
//            for(int i=0;i<32;i++)
//                a[i]=1-a[i];
//
//            int flag=0;
//            if(a[0]==0){
//                flag=0;
//                a[0]=1;
//            }
//            else{
//                flag=1;
//                a[0]=0;
//            }
//            for(int i=1;i<32;i++){
//                if(a[i]==0 || (a[i]==1&&flag==0)){
//                    a[i]=a[i]+flag;
//                    flag=0;
//                }
//
//                else if(a[i]==1&&flag==1){
//                    a[i]=0;
//                    flag=1;
//                }
//            }
//        }
//
//        String s = "";
//        for(int i=31;i>0;i=i-4){
//            int n1=a[i];
//            int n2=a[i-1];
//            int n3=a[i-2];
//            int n4=a[i-3];
//            int n=n1*8+n2*4+n3*2+n4*1;
//            if(n<10)
//                s+=n;
//            else
//                s+=(char)(n-10+'a');
//        }
//        System.out.println(s);
//        int index = 0;
//        for(int i=0;i<s.length();i++)
//            if(s.charAt(i)!='0'){
//                index=i;
//                break;
//            }
//        return s.substring(index,s.length());
//    }


    public static String toHex(int num) {

        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 0xF)] + result;//计算机内部负数自动用补码运算
            num = (num >>> 4);
        }
        return result;
    }
}
























