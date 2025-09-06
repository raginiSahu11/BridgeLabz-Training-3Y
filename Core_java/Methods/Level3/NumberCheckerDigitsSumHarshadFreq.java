import java.util.*;
public class NumberCheckerDigitsSumHarshadFreq {
    public static int[] digits(int n){ String s=String.valueOf(Math.abs(n)); int[] a=new int[s.length()]; for(int i=0;i<s.length();i++) a[i]=s.charAt(i)-'0'; return a;}
    public static int sumDigits(int n){ int s=0; for(int d:digits(n)) s+=d; return s;}
    public static int sumSquares(int n){ int s=0; for(int d:digits(n)) s+=d*d; return s;}
    public static boolean isHarshad(int n){ int sd=sumDigits(n); return sd!=0 && n%sd==0;}
    public static int[][] digitFrequency(int n){
        int[] freq=new int[10]; for(int d:digits(n)) freq[d]++;
        int count=0; for(int f:freq) if(f>0) count++;
        int[][] out=new int[count][2]; int idx=0;
        for(int i=0;i<10;i++) if(freq[i]>0){ out[idx][0]=i; out[idx][1]=freq[i]; idx++; }
        return out;
    }
    public static void main(String[] args){
        int n=21;
        System.out.println("n="+n);
        System.out.println("digits="+Arrays.toString(digits(n)));
        System.out.println("sumDigits="+sumDigits(n));
        System.out.println("sumSquares="+sumSquares(n));
        System.out.println("isHarshad="+isHarshad(n));
        System.out.println("frequency:");
        for(int[] row:digitFrequency(n)) System.out.println(row[0]+" -> "+row[1]);
    }
}

