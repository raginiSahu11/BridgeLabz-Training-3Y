import java.util.*;
public class FactorsAdvanced {
    public static int[] factors(int n){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++) if(n%i==0) list.add(i);
        return list.stream().mapToInt(i->i).toArray();
    }
    public static int greatest(int[] f){ int m=f[0]; for(int v:f) if(v>m) m=v; return m; }
    public static long sum(int[] f){ long s=0; for(int v:f) s+=v; return s; }
    public static long product(int[] f){ long p=1; for(int v:f) p*=v; return p; }
    public static double productCubes(int[] f){ double p=1; for(int v:f) p*=Math.pow(v,3); return p; }
    public static void main(String[] args){
        int n=12;
        int[] f=factors(n);
        System.out.println("factors="+Arrays.toString(f));
        System.out.println("greatest="+greatest(f));
        System.out.println("sum="+sum(f));
        System.out.println("product="+product(f));
        System.out.println("productOfCubes="+productCubes(f));
    }
}

