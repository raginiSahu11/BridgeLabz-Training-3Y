import java.util.*;
public class NumberCheckerReversePalindromeDuck {
    public static int[] digits(int n){ String s=String.valueOf(Math.abs(n)); int[] a=new int[s.length()]; for(int i=0;i<s.length();i++) a[i]=s.charAt(i)-'0'; return a;}
    public static int[] reverseArray(int[] a){ int[] r=new int[a.length]; for(int i=0;i<a.length;i++) r[i]=a[a.length-1-i]; return r;}
    public static boolean arraysEqual(int[] a,int[] b){ return Arrays.equals(a,b);}
    public static boolean isPalindrome(int n){ return arraysEqual(digits(n), reverseArray(digits(n))); }
    public static boolean isDuck(int n){ return String.valueOf(n).indexOf('0')>=0; }
    public static void main(String[] args){
        int n=1221;
        System.out.println("digits="+Arrays.toString(digits(n)));
        System.out.println("reversed="+Arrays.toString(reverseArray(digits(n))));
        System.out.println("arraysEqual? "+arraysEqual(digits(n), reverseArray(digits(n))));
        System.out.println("isPalindrome? "+isPalindrome(n));
        System.out.println("isDuck? "+isDuck(n));
    }
}
