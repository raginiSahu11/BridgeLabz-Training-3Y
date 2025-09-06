import java.util.*;
public class NumberCheckerDigitsBasic {
    public static int countDigits(int n){ return String.valueOf(Math.abs(n)).length(); }
    public static int[] digits(int n){
        String s=String.valueOf(Math.abs(n)); int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0'; return d;
    }
    public static boolean isDuck(int n){ // common definition: has at least one zero (not leading)
        String s=String.valueOf(n); return s.indexOf('0')>=0;
    }
    public static boolean isArmstrong(int n){
        int[] d=digits(n); int p=d.length, sum=0;
        for(int v:d) sum += Math.pow(v,p);
        return sum==n;
    }
    public static int[] twoLargest(int[] d){
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;
        for(int v:d){
            if(v>max1){ max2=max1; max1=v;}
            else if(v>max2 && v!=max1) max2=v;
        }
        return new int[]{max1, max2==Integer.MIN_VALUE?max1:max2};
    }
    public static int[] twoSmallest(int[] d){
        int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        for(int v:d){
            if(v<min1){ min2=min1; min1=v;}
            else if(v<min2 && v!=min1) min2=v;
        }
        return new int[]{min1, min2==Integer.MAX_VALUE?min1:min2};
    }
    public static void main(String[] args){
        int n = 153;
        System.out.println("n="+n);
        System.out.println("countDigits="+countDigits(n));
        System.out.println("digits="+Arrays.toString(digits(n)));
        System.out.println("isDuck="+isDuck(n));
        System.out.println("isArmstrong="+isArmstrong(n));
        System.out.println("twoLargest="+Arrays.toString(twoLargest(digits(n))));
        System.out.println("twoSmallest="+Arrays.toString(twoSmallest(digits(n))));
    }
}
