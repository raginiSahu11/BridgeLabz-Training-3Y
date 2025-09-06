public class NumberCheckerPrimesNeonSpyAutoBuzz {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
    public static boolean isNeon(int n){
        int sq = n*n, s=0; while(sq>0){ s+=sq%10; sq/=10; } return s==n;
    }
    public static boolean isSpy(int n){
        int sum=0, prod=1, t=n;
        while(t>0){ int d=t%10; sum+=d; prod*=d; t/=10; }
        return sum==prod;
    }
    public static boolean isAutomorphic(int n){
        int sq=n*n; return String.valueOf(sq).endsWith(String.valueOf(n));
    }
    public static boolean isBuzz(int n){ return n%7==0 || n%10==7; }
    public static void main(String[] args){
        int n=7;
        System.out.println("n="+n);
        System.out.println("prime="+isPrime(n));
        System.out.println("neon="+isNeon(n));
        System.out.println("spy="+isSpy(n));
        System.out.println("automorphic="+isAutomorphic(n));
        System.out.println("buzz="+isBuzz(n));
    }
}

