public class NumberCheckerPerfectAbundantDeficientStrong {
    public static int sumProperDivisors(int n){
        int s=0;
        for(int i=1;i<=n/2;i++) if(n%i==0) s+=i;
        return s;
    }
    public static boolean isPerfect(int n){ return n>0 && sumProperDivisors(n)==n; }
    public static boolean isAbundant(int n){ return n>0 && sumProperDivisors(n)>n; }
    public static boolean isDeficient(int n){ return n>0 && sumProperDivisors(n)<n; }
    public static int factorial(int x){ int f=1; for(int i=2;i<=x;i++) f*=i; return f;}
    public static boolean isStrong(int n){
        int s=0, t=n;
        while(t>0){ s+=factorial(t%10); t/=10; }
        return s==n;
    }
    public static void main(String[] args){
        int n=28;
        System.out.println("n="+n);
        System.out.println("perfect="+isPerfect(n));
        System.out.println("abundant="+isAbundant(n));
        System.out.println("deficient="+isDeficient(n));
        System.out.println("strong="+isStrong(n));
    }
}
